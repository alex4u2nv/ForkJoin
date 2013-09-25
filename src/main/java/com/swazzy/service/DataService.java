package com.swazzy.service;

import java.util.List;
import java.util.concurrent.BlockingQueue;

import org.apache.log4j.Logger;

import com.swazzy.model.Data;
/**
 * 
 * @author Alexander D. Mahabir 
 * @version $Revision: $:
 * @date 	$Date: $:
 * $Id: $:
 * Spring Framework, PriorityQueue, ForkJoin, Concurrency
 */
public interface DataService {

	public List<Data> loadData(final int max);
	public BlockingQueue<Data> prioritizeData(final List<Data>data );
	
}
