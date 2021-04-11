package com.company;

import com.company.Employee;

public class FullTimeEmployee extends Employee {
    private double bonus, fine, salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String id, String name, String age, String phone, String email, double bonus, double fine, double salary) {
        super(id, name, age, phone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    @Override
    public double getPayment() {
        return salary + bonus - fine;
    }

    @Override
    public String toString() {
        return (super.toString() + "\t Full-time");
    }
}