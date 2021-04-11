package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.init();
        int userChoice;
        do {
            System.out.println("1. Display employee list");
            System.out.println("2. Add employee");
            System.out.println("3. List of full-time employees with below-average income");
            System.out.println("4. Total payment for part-time employees");
            System.out.println("0. Exit");
            userChoice = scanner.nextInt();
            scanner.nextLine();
            switch (userChoice) {
                case 1: {
                    employeeManagement.displayEmployees();
                    break;
                }
                case 2: {
                    employeeManagement.addEmployeeMenu();
                    break;
                }
                case 3: {
                    employeeManagement.displayBelowAverageFullTime();
                    break;
                }
                case 4: {
                    System.out.println(employeeManagement.getTotalPartTimePay());
                    break;
                }
                case 0: {
                    System.exit(0);
                }
            }
        }    while (userChoice != 0) ;
    }
}
