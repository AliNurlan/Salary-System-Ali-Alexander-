
public class PartTimeEmployee extends Employee{
    PartTimeEmployee(double salary, int workingHours){
        super(salary, workingHours);
    }

    @Override
    public double income() {
        return salary * workingHours;
    }

    @Override
    public String toString() {
       return "PartTimeEmployee.\tSalary: " + salary + "\tWorking hours per week: " + workingHours;
    }
}
