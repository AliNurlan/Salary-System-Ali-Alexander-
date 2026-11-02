
public class PartTimeEmployee extends Employee{
        protected double salary; //fixed salary per hour
    protected int workingHours; //working hours per week

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
    
    public void setSalary(double value){
        if (value < 4.64){
            System.out.println("Incorect range of value. Value needs to be greater that minimum salary in latvia per hour(4.64 euro).");
        }else{
            salary = value;
        }
        
    }
    final public double getSalary(){
        return salary;
    }

    PartTimeEmployee(String firstName, String lastName, int socialNumber, double salary, int workingHours){
        super( firstName,  lastName,  socialNumber);
        this.salary = salary;
        this.workingHours = workingHours;
    }

    @Override
    public double income() {
        return salary * workingHours;
    }

    @Override
    public String toString() {
       return "Name: " + getFirstName() + " " + getLastName() + "\n"
       + "Position: Part Time Employee\n"
       + "Number of hours work: " + workingHours
       + "\nSalary: " + income() + " Euro\n"
       + "Social Number: " + getSocialNumber();
    }
}
