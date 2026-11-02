
public abstract class Employee {
    protected double salary;
    protected int workingHours;

    Employee(){
        this.salary = 4.64;
        this.workingHours = 40;
    }
    Employee(double salary, int workingHours){
        this.salary = salary;
        this.workingHours = workingHours;
    }

    final public void setWorkingHours(int value){
        if (value < 1){
            System.out.println("Incorect range of value. Value needs to be greater that zero.");
        }
        else{
        workingHours = value;
        }    
    }
    final public int getWorkingHours(){
        return workingHours;
    };
    
    final public void setSalary(double value){
        if (value < 4.64){
            System.out.println("Incorect range of value. Value needs to be greater that minimum salary in latvia per hour(4.64 euro).");
        }else{
            salary = value;
        }
        
    }
    final public double getSalary(){
        return salary;
    }

    //totalIncomePerWeek
    public abstract double income();

}
