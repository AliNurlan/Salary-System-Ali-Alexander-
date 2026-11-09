import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> empList = new ArrayList<Employee>();
    // contract of the employee with the same index in empList
    static ArrayList<String> contractList = new ArrayList<String>();
    static String line = "================================================";

    static void printMenu() {
        System.out.println(line);
        System.out.println("|            Choose from the menu              |");
        System.out.println(line);
        System.out.println("| 1. Register Employee                          |");
        System.out.println("| 2. Print Employee Data                        |");
        System.out.println("| 3. Print by Position                          |");
        System.out.println("| 4. Print by Contract                          |");
        System.out.println("| 5. Exit                                       |");
        System.out.println(line);
        System.out.println("\nChoose option");
        System.out.print("-->");
    }

    // the Employee classes have no "position" method, so we find it by the real type
    static String getPosition(Employee e) {
        if (e instanceof FullTimeEmployee) return "Full Time Employee";
        if (e instanceof PartTimeEmployee) return "Part Time Employee";
        if (e instanceof BaseCommissionEmployee) return "Base Employee with Commission"; // check before CommissionEmployee
        return "Commission Employee";
    }

    static void registerEmployee() {
        System.out.println("| 1. Full Time Employee                         |");
        System.out.println("| 2. Part - Time Employee                       |");
        System.out.println("| 3. Commission Employee                        |");
        System.out.println("| 4. Base Employee with Commission              |");
        System.out.println(line);
        System.out.print("-->");
        int type = readInt();

        if (type < 1 || type > 4) {
            System.out.println("Choose between the offered options !");
            return;
        }

        System.out.println("First name");
        String firstName = sc.nextLine();
        System.out.println("Last name");
        String lastName = sc.nextLine();
        System.out.println("Social Number");
        int social = readInt();
        System.out.println("Type of Contract (Seasonal / Annual)");
        String contract = sc.nextLine();

        Employee emp;
        if (type == 1) {
            System.out.println("Weekly salary");
            double salary = readDouble();
            emp = new FullTimeEmployee(firstName, lastName, social, salary);
        } else if (type == 2) {
            System.out.println("Hourly rate");
            double rate = readDouble();
            System.out.println("Hours of work");
            int hours = readInt();
            emp = new PartTimeEmployee(firstName, lastName, social, rate, hours);
        } else if (type == 3) {
            System.out.println("Number of sales");
            int sales = readInt();
            System.out.println("Commission per sale");
            double commission = readDouble();
            emp = new CommissionEmployee(firstName, lastName, sales, commission, social);
        } else {
            System.out.println("Base salary");
            double baseSalary = readDouble();
            System.out.println("Number of sales");
            int sales = readInt();
            System.out.println("Commission per sale");
            double commission = readDouble();
            emp = new BaseCommissionEmployee(firstName, lastName, sales, commission, social, 0.10, baseSalary);
        }

        empList.add(emp);
        contractList.add(contract);
    }

    public static void printEmployeeData() {
        System.out.println(line);
        System.out.println("|             Employee Information              |");
        System.out.println(line);
        for (Employee e : empList) {
            System.out.println(e.toString()); // polymorphism
            System.out.println(line);
        }
    }

    static void printByPosition() {
        System.out.println(line);
        System.out.println("|               Employee Position                |");
        System.out.println(line);
        for (Employee e : empList) {
            System.out.println(e.getFirstName() + " " + e.getLastName() + " - " + getPosition(e));
            System.out.println(line);
        }
    }

    static void printByContract() {
        System.out.println(line);
        System.out.println("|               Employee Contract                |");
        System.out.println(line);
        for (int i = 0; i < empList.size(); i++) {
            Employee e = empList.get(i);
            System.out.println(e.getFirstName() + " " + e.getLastName() + " - " + contractList.get(i) + " Contract");
            System.out.println(line);
        }
    }

    // reads a number; if the user types text, asks again
    static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Enter a number: ");
            }
        }
    }

    static double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Enter a number: ");
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int option = readInt();

            if (option == 1) {
                registerEmployee();
            } else if (option == 2) {
                printEmployeeData();
            } else if (option == 3) {
                printByPosition();
            } else if (option == 4) {
                printByContract();
            } else if (option == 5 || option == 0) {
                System.out.println(line);
                System.out.println("      Thank you for choosing our program");
                System.out.println(line);
                break;
            } else {
                System.out.println("Choose between the offered options !");
            }
        }
    }
}