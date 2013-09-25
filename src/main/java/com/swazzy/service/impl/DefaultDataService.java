package com.swazzy.service.impl;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.swazzy.model.Data;
import com.swazzy.service.DataService;
/**
 * 
 * @author Alexander D. Mahabir 
 * @version $Revision: $:
 * @date 	$Date: $:
 * $Id: $:
 */
@Service
public class DefaultDataService implements DataService{
	static Logger log = Logger.getLogger(DefaultDataService.class);
	

	/**
	 * Prioritize the data in the List Queue.
	 */
	@Override
	public BlockingQueue<Data> prioritizeData(final List<Data> data) {
		if (data==null || data.size()==0)
			return null;
		BlockingQueue<Data> blkQueue = new PriorityBlockingQueue<Data>(data.size(), new Comparator<Data>() {

			/**
			 * Arbitrary prioritizing algorithm.
			 * @param o1
			 * @param o2
			 * @return
			 */
			@Override
			public int compare(Data o1, Data o2) {
				if (o1.getId() == o2.getId())
					return 0;
				
				if (o1.getDataA() < o2.getDataA())
					return 1;
				if (o2.getDataA() > o2.getDataA())
					return -1;
				
				float o1Product = o1.getDataA() * o1.getDataB() * o1.getDataC();
				float o2Product = o2.getDataA() * o2.getDataB() * o2.getDataC();
				if (o1Product < o2Product)
					return 1;
				if (o1Product>o2Product)
					return -1;
				
				return 0;
			}
		});
		blkQueue.addAll(data);
		return blkQueue;
	}


	/**
	 * Generate some data to work with.
	 */
	@Override
	public List<Data> loadData(final int max) {
		List<Data> dataList = new LinkedList<Data>(); 
		Random random = new Random();
		for (int i = 0; i < max; i++) {
			Data data = new Data((long) i, random.nextFloat(),random.nextFloat(), random.nextFloat());
			dataList.add(data);
		}
		
		log.trace("Generated data set of size: " + dataList.size());
		return dataList;
	}
}
