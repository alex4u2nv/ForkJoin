package com.swazzy.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.log4j.Logger;
/**
 * 
 * @author Alexander D. Mahabir 
 * @version $Revision: $:
 * @date 	$Date: $:
 * $Id: $:
 * Spring Framework, PriorityQueue, ForkJoin, Concurrency
 */
public class Result implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6733624267649460345L;
	static Logger log = Logger.getLogger(Result.class);
	Float value;
	String name;
	Data data;
	public Float getValue() {
		return value;
	}
	public void setValue(Float value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public Result(Float value, String name, Data data) {
		super();
		this.value = value;
		this.name = name;
		this.data = data;
	}
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Result other = (Result) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Result [value=" + value + ", name=" + name + ", data=" + data
				+ "]";
	}

	
}
