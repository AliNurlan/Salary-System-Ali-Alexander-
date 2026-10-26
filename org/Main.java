

public class Main {

    public static void main(String[] args) {
        System.out.println("HI!");
        
        Employee em = new FullTimeEmployee();
        em.setSalary(5);
        System.out.println(em.toString());
    }
}