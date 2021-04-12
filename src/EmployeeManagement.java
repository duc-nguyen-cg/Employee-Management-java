import java.util.Scanner;

public class EmployeeManagement {
    Scanner scanner = new Scanner(System.in);
    private Employee[] company = new Employee[0];

    public void addEmployee() {
        Employee[] newCompany = new Employee[company.length + 1];
        for (int i = 0; i < company.length; i++){
            newCompany[i] = company[i];
        }
        company = newCompany;
    }


    public void addEmployee(String id, String name, String age, String phone, String email, double bonus, double fine, double salary){
        addEmployee();
        company[company.length - 1] = new FullTimeEmployee(id, name, age, phone, email, bonus, fine, salary);
    }

    public void addEmployee(String id, String name, String age, String phone, String email, double workHours){
        addEmployee();
        company[company.length - 1] = new PartTimeEmployee(id, name, age, phone, email, workHours);
    }

    public void displayEmployees(){
        for (Employee employee: company){
            System.out.println(employee);
        }
    }

    public void addEmployeeMenu(){
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
        int workType = scanner.nextInt();
        scanner.nextLine();

        switch(workType){
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
    }

    public double getAveragePayment() {
        double totalPayment = 0;
        for (Employee employee: company){
            totalPayment += employee.getPayment();
        }
        return totalPayment/company.length;
    }

    public double getTotalPartTimePayment() {
        double totalPartTimePayment = 0;
        for (Employee employee: company){
            if (employee instanceof PartTimeEmployee){
                totalPartTimePayment += employee.getPayment();
            }
        }
        return totalPartTimePayment;
    }

    public void displayUnderpaidFullTime() {
        double averageIncome = getAveragePayment();
        System.out.println("The average income is "+ averageIncome);
        System.out.println("Employees who have below-average income are ");
        for (Employee employee: company){
            if (employee.getPayment() < averageIncome){
                System.out.println(employee);
            }
        }
    }

    public void test() {
        addEmployee("1", "Mike", "30", "1234567890", "a@gmail.com", 1000, 50, 8000);
        addEmployee("2", "Levi", "40", "9876543210", "b@yahoo.com", 20);
    }










}
