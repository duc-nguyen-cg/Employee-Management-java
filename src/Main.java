import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement company = new EmployeeManagement();
        company.test();

        int userChoice = -1;
        do {
            System.out.println();
            System.out.println("1. Display employees' list");
            System.out.println("2. Add an employee");
            System.out.println("3. Display full-time employees receiving below-average payment");
            System.out.println("4. Total payment for part-time employees");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            userChoice = scanner.nextInt();
            scanner.nextLine();
            switch (userChoice) {
                case 1: {
                    company.displayEmployees();
                    break;
                }
                case 2: {
                    company.addEmployeeMenu();
                    break;
                }
                case 3: {
                    company.displayUnderpaidFullTime();
                    break;
                }
                case 4: {
                    System.out.println("Total payment for part-time employees is "+company.getTotalPartTimePayment());
                    break;
                }
                case 0: {
                    System.exit(0);
                }
            }
        } while (userChoice != 0);
    }
}
