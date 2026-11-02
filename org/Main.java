import java.util.ArrayList; // Import the ArrayList class


public class Main {
    static ArrayList<Employee> empList = new ArrayList<Employee>(); // Create an ArrayList object

    public static void printEmployeeData(){
        String line = "============================";
        System.out.println(line);
        System.out.println("Employee Information");
        System.out.println(line);
        
        for (Employee i : empList) {
            System.out.println(i.toString());
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        System.out.println("HI!");
        
        Employee em = new FullTimeEmployee();
        empList.add(em);
        printEmployeeData();
    }
}