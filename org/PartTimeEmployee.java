
public class PartTimeEmployee extends Employee{
    @Override
    public double income() {
        return salary * workingHours;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
