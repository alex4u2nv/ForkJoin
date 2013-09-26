package com.swazzy.controller;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.swazzy.computer.ForkJoinComputer;
import com.swazzy.model.Data;
import com.swazzy.model.Result;
import com.swazzy.service.Calculator;
import com.swazzy.service.DataService;

/**
 * 
 * @author Alexander D. Mahabir
 * @version $Revision: $:
 * @date $Date: $: $Id: $: Spring Framework, PriorityQueue, ForkJoin,
 *       Concurrency
 */
@Controller
public class Calculate {
	static Logger log = Logger.getLogger(Calculate.class);
	@Autowired
	Calculator calculator;
	@Autowired
	DataService dataService;

	public void performCalculation(Integer size) {
		List<Data> data = dataService.loadData(size);
		BlockingQueue<Data> blkQueue = dataService.prioritizeData(data);
		if (blkQueue != null) {
			int processors = Runtime.getRuntime().availableProcessors();
			ForkJoinPool fpool = new ForkJoinPool(processors);
			ForkJoinComputer fjc = new ForkJoinComputer(blkQueue, calculator);
			fpool.invoke(fjc);
			List<Result> results = fjc.getResults();
			log.debug("Result Size: " + results.size());
		}

	}

}
