
public class FullTimeEmployee extends Employee{

        protected double salary; //fixed salary per hour
    
    final public double getSalary(){
        return salary;
    }

    FullTimeEmployee(){
        this.salary = 195; 
    }
    FullTimeEmployee(String firstName, String lastName, int socialNumber, double salary){
        super( firstName,  lastName,  socialNumber);
        this.salary = salary;
    }

    public void setSalary(double value) {
        if (value < 195) System.out.println("Incorect range of value. Value needs to be greater that minimum salary in latvia per week(~195 euro).");
        else{
            salary = value;
        }    
    }

    //totalIncomePerWeek
    public double income(){
        return getSalary();
    };

    @Override
    public String toString() {
       return "Name: " + getFirstName() + " " + getLastName() + "\n"
       + "Position: Full Time Employee\n"
       + "Base Salary: " + salary + " Euro\n"
       + "Salary: " + salary + " Euro\n"
       + "Social Number: " + getSocialNumber();
    }
}
