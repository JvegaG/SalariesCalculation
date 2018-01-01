package com.company;

public class Employee implements Taxes {
    private double baseSalary = 40000;
    private int years;

    public Employee(int years){
        this.years = years;
    }

    public double getBonus(){
        return years*1000;
    }

    public double getGrossSalary(){
        return baseSalary + getBonus();
    }

    public double getNetSalary(){
        return getGrossSalary() - (getGrossSalary() * Taxes.getTaxRate(getGrossSalary()));
        /* I invoked getTaxRate called the interface Taxes on the beginning -  e.g."Taxes.getTaxRate()" */
    }

}
