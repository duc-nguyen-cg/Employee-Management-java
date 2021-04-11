package com.company;

import com.company.Employee;

import java.util.Scanner;

public class EmployeeManagement {
    Scanner scanner = new Scanner(System.in);
    private Employee[] employees = new Employee[0];

    public void addEmployee() {
        Employee[] newEmployees = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            newEmployees[i] = employees[i];
        }
        employees = newEmployees;
    }

    public void addEmployee(String id, String name, String age, String phone, String email, double bonus, double fine, double salary) {
        addEmployee();
        employees[employees.length - 1] = new FullTimeEmployee(id, name, age, phone, email, bonus, fine, salary);
    }

    public void addEmployee(String id, String name, String age, String phone, String email, double workHours) {
        addEmployee();
        employees[employees.length - 1] = new PartTimeEmployee(id, name, age, phone, email, workHours);
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void addEmployeeMenu() {
        System.out.println("id:");
        String id = scanner.nextLine();
        System.out.println("name:");
        String name = scanner.nextLine();
        System.out.println("age:");
        String age = scanner.nextLine();
        System.out.println("phone:");
        String phone = scanner.nextLine();
        System.out.println("email:");
        String email = scanner.nextLine();
        System.out.println("1. Full-time");
        System.out.println("2. Part-time");
        int userChoice = scanner.nextInt();
        scanner.nextLine();
        switch (userChoice) {
            case 1:
                System.out.println("bonus: ");
                double bonus = scanner.nextDouble();
                System.out.println("fine: ");
                double fine = scanner.nextDouble();
                System.out.println("salary: ");
                double salary = scanner.nextDouble();
                addEmployee(id, name, age, phone, email, bonus, fine, salary);
                break;

            case 2:
                System.out.println("work hours: ");
                double workHours = scanner.nextDouble();
                addEmployee(id, name, age, phone, email, workHours);
                break;
        }
        displayEmployees();
    }

    public void init() {
        //add samples
        addEmployee("1", "Thanh", "27", "0947641731", "thanhdamquoc@gmail.com", 1000000, 50000, 8000000);
        addEmployee("2", "Long", "27", "0912123123", "long.le@codegym.vn", 30);
        addEmployee("3", "Tuan", "27", "0900000000", "tuanle@gmail.com", 0, 4000000, 6000000);
        addEmployee("4", "Quan", "25", "0911111111", "quan.nguyen@codegym.vn", 35);
    }

    public double getAveragePay() {
        double totalPay = 0;
        for (Employee employee : employees) {
            totalPay += employee.getPayment();
        }
        return totalPay / employees.length;
    }

    public void displayBelowAverageFullTime() {
        double averageIncome = getAveragePay();
        System.out.println("The average income is " + averageIncome);
        System.out.println("List of full-time employees with below-average income:");
        for (Employee employee : employees) {
            if ((employee instanceof FullTimeEmployee) && (employee.getPayment() < averageIncome)) {
                System.out.println(employee);
            }
        }
    }

    public double getTotalPartTimePay() {
        double totalPartTimePay = 0;
        for (Employee employee : employees) {
            if (employee instanceof PartTimeEmployee) {
                totalPartTimePay += employee.getPayment();
            }
        }
        return totalPartTimePay;
    }
}
