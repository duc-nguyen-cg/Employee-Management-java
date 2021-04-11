package com.company;

import com.company.Employee;

public class PartTimeEmployee extends Employee {
    private double workHours;
    final static double HOURLY_WAGE = 100000;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String id, String name, String age, String phone, String email, double workHours) {
        super(id, name, age, phone, email);
        this.workHours = workHours;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    @Override
    public double getPayment() {
        return workHours * HOURLY_WAGE;
    }

    @Override
    public String toString() {
        return (super.toString() + "\t Part-time");
    }
}