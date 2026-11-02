
public class FullTimeEmployee extends Employee{

    FullTimeEmployee(){
        this.salary = 195; 
        this.workingHours = 40; 
    }
    FullTimeEmployee(double salary){
        this.salary = salary;
    }

    @Override
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
       return "FullTimeEmployee.\tSalary: " + salary + "\tWorking hours per week: " + workingHours;
    }
}
