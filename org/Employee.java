
public abstract class Employee {
    protected double salary;
    protected int workingHours;

    public void setWorkingHours(int value){
        if (value < 1) System.out.println("Incorect range of value. Value needs to be greater that zero.");
        workingHours = value;
    }
    public int getWorkingHours(){return workingHours;};
    
    public void setSalary(double value){
        if (value < 4.64) System.out.println("Incorect range of value. Value needs to be greater that minimum salary in latvia per hour(4.64 euro).");
        salary = value;
    }
    public double getSalary(){return salary;};

    //totalIncomePerWeek
    public abstract double income();

}
