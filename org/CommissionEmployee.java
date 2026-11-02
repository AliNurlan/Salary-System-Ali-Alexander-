public class CommissionEmployee extends Employee{
    protected double sales;
    protected double percentageOfSales;
    
    CommissionEmployee(int workingHours, double sales, double percentageOfSales){
        super();
        this.sales = sales;
        this.percentageOfSales = percentageOfSales;
        this.workingHours = workingHours;
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
