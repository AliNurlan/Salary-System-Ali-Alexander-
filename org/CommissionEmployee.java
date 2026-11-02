public class CommissionEmployee extends Employee{
    protected double sales;
    protected double percentageOfSales;
    
    CommissionEmployee(double sales, double percentageOfSales, int workingHours){
        super();
        this.sales = sales;
        this.percentageOfSales = percentageOfSales;
        setWorkingHours(workingHours);
    }

    @Override
    public double income() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public String toString() {
        return "CommissionEmployee.\tSalary: " + salary +
         "\tWorking hours per week: " + workingHours
         + "\nSales: " + sales
         + "\tPercentage Of Sales: " + percentageOfSales;
    }
}
