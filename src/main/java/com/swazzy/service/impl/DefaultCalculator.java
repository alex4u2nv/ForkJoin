package com.swazzy.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.swazzy.model.Data;
import com.swazzy.model.Result;
import com.swazzy.service.Calculator;
/**
 * 
 * @author Alexander D. Mahabir 
 * @version $Revision: $:
 * @date 	$Date: $:
 * $Id: $:
 */
@Service
public class DefaultCalculator implements Calculator {
	static Logger log = Logger.getLogger(DefaultCalculator.class);

	@Override
	public Result calculate(Data data) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Calculate product
	 */
	@Override
	public Result calculateProduct(Data data) {
		Result result=new Result();
		result.setName("product");
		result.setValue( data.getDataA() * data.getDataB() * data.getDataC() );
		return result;
	}

	/**
	 * Calculate summation
	 */
	@Override
	public Result calculateSum(Data data) {
		Result result=new Result();
		result.setName("sum");
		result.setValue( (Float) (data.getDataA() + data.getDataB() + data.getDataC()));
		return result;
	}

	/**
	 * Calculate Fibonacci
	 */
	@Override
	public Result calculateFibonacci(int n) {
		Result result=new Result();
		result.setName("fib");
		if (n<=1) {
			result.setValue((float)n);
			return result;
		}
		
		result.setValue( this.calculateFibonacci(n-1).getValue() + this.calculateFibonacci(n-2).getValue());
		return result;
	}

	@Override
	public Result add(final Result result01, final Result result02) {
		Result result = new Result();
		result.setName(result01.getName());
		result.setValue(result01.getValue() + result02.getValue());
		return result;
	}

	
}
