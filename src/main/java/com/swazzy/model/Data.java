package com.swazzy.model;

import java.io.Serializable;

import org.apache.log4j.Logger;
/**
 * 
 * @author Alexander D. Mahabir 
 * @version $Revision: $:
 * @date 	$Date: $:
 * $Id: $:
 * Spring Framework, PriorityQueue, ForkJoin, Concurrency
 */
public class Data implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8958384032393113534L;
	static Logger log = Logger.getLogger(Data.class);
	private Long id;
	private Float dataA;
	private Float dataB;
	private Float dataC;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Float getDataA() {
		return dataA;
	}
	public void setDataA(Float dataA) {
		this.dataA = dataA;
	}
	public Float getDataB() {
		return dataB;
	}
	public void setDataB(Float dataB) {
		this.dataB = dataB;
	}
	public Float getDataC() {
		return dataC;
	}
	public void setDataC(Float dataC) {
		this.dataC = dataC;
	}
	public Data(Float dataA, Float dataB, Float dataC) {
		super();
		this.dataA = dataA;
		this.dataB = dataB;
		this.dataC = dataC;
	}
	public Data(Long id, Float dataA, Float dataB, Float dataC) {
		super();
		this.id = id;
		this.dataA = dataA;
		this.dataB = dataB;
		this.dataC = dataC;
	}
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataA == null) ? 0 : dataA.hashCode());
		result = prime * result + ((dataB == null) ? 0 : dataB.hashCode());
		result = prime * result + ((dataC == null) ? 0 : dataC.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Data other = (Data) obj;
		if (dataA == null) {
			if (other.dataA != null)
				return false;
		} else if (!dataA.equals(other.dataA))
			return false;
		if (dataB == null) {
			if (other.dataB != null)
				return false;
		} else if (!dataB.equals(other.dataB))
			return false;
		if (dataC == null) {
			if (other.dataC != null)
				return false;
		} else if (!dataC.equals(other.dataC))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Data [id=" + id + ", dataA=" + dataA + ", dataB=" + dataB
				+ ", dataC=" + dataC + "]";
	}
	
	
}
