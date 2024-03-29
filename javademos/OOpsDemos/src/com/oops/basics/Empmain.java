package com.oops.basics;

public class Empmain {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.employeeName  = "raju";
		employee.employeeId=12;
		employee.salary =2000;
		System.out.println("Name :"+ employee.employeeName);
		System.out.println("Id"+ employee.employeeId);
		System.out.println("salary"+employee.salary);

}
}