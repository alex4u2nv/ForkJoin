package com.swazzy.service;

import org.apache.log4j.Logger;

import com.swazzy.model.Data;
import com.swazzy.model.Result;
/**
 * 
 * @author Alexander D. Mahabir 
 * @version $Revision: $:
 * @date 	$Date: $:
 * $Id: $:
 * Spring Framework, PriorityQueue, ForkJoin, Concurrency
 */
public interface Calculator {

	public Result calculate(Data data);
	public Result calculateProduct(Data data);
	public Result calculateSum(Data data);
	public Result calculateFibonacci(int n);
	public Result add(Result result01, Result result02);
	
}
