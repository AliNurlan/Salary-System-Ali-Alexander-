
public class PartTimeEmployee extends Employee{
    @Override
    public double income() {
        return salary * workingHours;
    }

    @Override
    public String toString() {
       return "PartTimeEmployee.\tSalary: " + salary + "\tWorking hours per week: " + workingHours;
    }
}
