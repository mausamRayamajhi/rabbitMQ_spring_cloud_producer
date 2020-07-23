package com.mausam.rabbitmq_producer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

	private String empName;
	private String empID;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	@Override
	public String toString() {
		return "com.mausam.rabbitmq.model.Employee [empName=" + empName + ", empID=" + empID + "]";
	}

}
   