package com.harink.icici.domain;

public class EmployeeInformation {
	private long empId;
	private String employeeName;
	private double basicSalary;
	private double netSalary;
	private double pt;
	private double  hra;
	private double pf;
	private double medical; 
	private double grossSalary;
	public EmployeeInformation() {
		
	}
	public EmployeeInformation(long empId, String employeeName,double basicSalary) {
		this.empId = empId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}
	public double netSalary( ) {
		 pt=200;
		 hra = basicSalary*.05;
		pf = basicSalary*0.12;
		 medical=basicSalary*.1;
		 grossSalary=(hra+basicSalary+medical);
		double netSalary=grossSalary-(pf+pt);
		return netSalary;
	}
	public void displayemployeeAccountDetails() {
		System.out.println("Employee Id : " + empId + "\nEmployee name: " + employeeName +  
				 "\nNet Salary: " + netSalary);
	} 
	
}
