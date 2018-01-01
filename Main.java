package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee Jackie = new Employee(6);
        Employee Joe = new Manager (8);

        System.out.println("Jackie Gross Salary: " + Jackie.getGrossSalary() + " Net Salary " + Jackie.getNetSalary());
        System.out.println("Joe Gross Salary: " + Joe.getGrossSalary() + " Net Salary " + Joe.getNetSalary());
    }
}
