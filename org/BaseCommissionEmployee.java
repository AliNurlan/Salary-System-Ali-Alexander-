public class BaseCommissionEmployee extends CommissionEmployee{
    BaseCommissionEmployee(double salary, int workingHours, double sales, double percentageOfSales){
        super(workingHours, sales, percentageOfSales);
        this.salary = salary;
    }
    
    @Override
    public double income() {
        return super.income() + salary * workingHours;
    }

    @Override
    public String toString() {
        return "BaseCommissionEmployee.\tSalary: " + salary +
         "\tWorking hours per week: " + workingHours
         + "\nSales: " + sales
         + "\tPercentage Of Sales: " + percentageOfSales;
    }
}
