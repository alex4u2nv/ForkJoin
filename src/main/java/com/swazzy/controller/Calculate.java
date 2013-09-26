package com.swazzy.controller;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.swazzy.computer.ForkJoinComputer;
import com.swazzy.model.Data;
import com.swazzy.model.Result;
import com.swazzy.service.Calculator;
import com.swazzy.service.DataService;
import com.thoughtworks.xstream.XStream;

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
			Collections.sort(results, new Comparator<Result>() {

				@Override
				public int compare(Result o1, Result o2) {
					 return (o1.getNanoStart()>o2.getNanoStart() ? 1 : (o1.getNanoStart()==o2.getNanoStart() ? 0 : -1));
				}
			});
			
			log.debug("Result Size: " + results.size());
			XStream xStream = new XStream();
			String xmlString=xStream.toXML(results);
			
			try {
				FileUtils.writeStringToFile(new File("Results.xml"), xmlString);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
