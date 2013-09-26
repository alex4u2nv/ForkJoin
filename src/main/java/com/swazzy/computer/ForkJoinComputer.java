package com.swazzy.computer;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang.SerializationUtils;
import org.apache.log4j.Logger;

import com.swazzy.model.Data;
import com.swazzy.model.Result;
import com.swazzy.service.Calculator;
/**
 * ForkJoin Forks the data out into various threads for calculations.
 * @author Alexander D. Mahabir 
 * @version $Revision: $:
 * @date 	$Date: $:
 * $Id: $:
 * Spring Framework, PriorityQueue, ForkJoin, Concurrency
 */
public class ForkJoinComputer extends RecursiveTask<Result> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3516672838786489490L;
	static Logger log = Logger.getLogger(ForkJoinComputer.class);
	private BlockingQueue<Data> blockingQueue = null;
	private final Calculator calculator;
	List<Result> results;
	final private Data data;
	public List<Result> getResults() {
		return results;
	}
	private static AtomicInteger calculationOrder=new AtomicInteger(0);

	/**
	 * 
	 * @param blockingQueue
	 */
	public ForkJoinComputer(BlockingQueue<Data> blockingQueue,
			Calculator calculator) {
		this.blockingQueue = blockingQueue;
		this.data = null;
		this.calculator = calculator;
		results = new ArrayList<Result>();
		log.trace("Constructed FJ computer with blockingQueue of size: "
				+ blockingQueue.size());
		
	}
	/**
	 * 
	 * @param data
	 */
	public ForkJoinComputer(Data data, Calculator calculator){
		this.data=data;
		this.calculator=calculator;
		log.trace("Constructed FJ computer with Data: " + data);
		results=null;
	}
	/**
	 * Generate the Summation Worker
	 */
	private ForkJoinComputer getSummationWorker(Data data) {
		final Calculator _calculator = calculator;
		ForkJoinComputer fjw = new ForkJoinComputer(data, new Calculator() { 
			
			@Override public Result calculateSum(Data data) {	return null;}
			@Override public Result calculateProduct(Data data) {return null;}
			@Override public Result calculateFibonacci(int n) {return null;}
			@Override public Result add(Result result01, Result result02) {return null;}
			@Override
			public Result calculate(Data data) {
				log.trace("Summation calculations for : " + data);
				Result result= _calculator.calculateSum(data);
				result.setCalculationOrder(calculationOrder.incrementAndGet());
				return result;
			}
		});
		return fjw;
	}
	/**
	 * Generate the Product calculation worker
	 * @param data
	 * @return
	 */
	private ForkJoinComputer generateProductWorker(Data data) {
		final Calculator _calculator = calculator;
		ForkJoinComputer fjw = new ForkJoinComputer(data, new Calculator() { 
			
			@Override public Result calculateSum(Data data) {	return null;}
			@Override public Result calculateProduct(Data data) {return null;}
			@Override public Result calculateFibonacci(int n) {return null;}
			@Override public Result add(Result result01, Result result02) {return null;}
			@Override
			public Result calculate(Data data) {
				log.trace("Product calculations for : " + data);
				Result result= _calculator.calculateProduct(data);
				result.setCalculationOrder(calculationOrder.incrementAndGet());
				return result;
			}
		});
		return fjw;
	}
	/**
	 * Generate the Fibonacci Calculation worker
	 * @param data
	 * @return
	 */
	private ForkJoinComputer generateFibonacciWorker(Data data) {
		final Calculator _calculator = calculator;
		ForkJoinComputer fjw = new ForkJoinComputer(data, new Calculator() { 
			
			@Override public Result calculateSum(Data data) {	return null;}
			@Override public Result calculateProduct(Data data) {return null;}
			@Override public Result calculateFibonacci(int n) {return null;}
			@Override public Result add(Result result01, Result result02) {return null;}
			//Also override the recursive calculation time.
			@Override
			public Result calculate(Data data) {
				int n = Integer.parseInt(data.getId().toString());
				int processors = Runtime.getRuntime().availableProcessors();
				Long nsStart = System.nanoTime();
				log.trace("Forking Fibonacci calculations for : " + data);
				if (data.getId() <= 10) {
					
					Result result =_calculator.calculateFibonacci(n);
					result.setNsCompleted(System.nanoTime() - nsStart);
					result.setCalculationOrder(calculationOrder.incrementAndGet());
					result.setData(data);
					return result;
				}
				
				Data data1 = (Data) SerializationUtils.clone(data);
				Data data2 = (Data) SerializationUtils.clone(data);
				data1.setId(data.getId()-1);
				data2.setId(data.getId()-2);
				
				ForkJoinComputer fjwComputer1 = generateFibonacciWorker(data1);
				ForkJoinComputer fjwComputer2 = generateFibonacciWorker(data2);
				fjwComputer2.fork();
				Result result= _calculator.add(fjwComputer1.compute(),
						fjwComputer2.join());
				result.setNsCompleted(System.nanoTime() - nsStart);
				result.setCalculationOrder(calculationOrder.incrementAndGet());
				result.setData(data);
				return result;

			}
		
		});
		return fjw;
	}

	/**
	 * Perform Computation. The first level of computation takes the problem,
	 * and forks the tasks out into various workers that are generated by the
	 * generateXXXWorker above.
	 */
	@Override
	protected Result compute() {
		if (blockingQueue != null) {
			List<ForkJoinComputer> workers = new LinkedList<ForkJoinComputer>();

			while (blockingQueue.size() > 0) {
				Data data = blockingQueue.poll();
				ForkJoinComputer fjws = this.getSummationWorker(data);
				fjws.fork();
				workers.add(fjws);
				
				ForkJoinComputer fjwp = this.generateProductWorker(data);
				fjwp.fork();
				workers.add(fjwp);

				ForkJoinComputer fjwf = this.generateFibonacciWorker(data);
				fjwf.fork();
				workers.add(fjwf);
			}
			for (ForkJoinComputer forkJoinComputer : workers) {
				results.add(forkJoinComputer.join());
			}
		}
		return this.calculator.calculate(data);
	}
}
