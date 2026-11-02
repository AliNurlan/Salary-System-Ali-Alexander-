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
        return sales * percentageOfSales;
    }
    
    @Override
    public String toString() {
        return "CommissionEmployee."
         + "\tWorking hours per week: " + workingHours
         + "\nSales: " + sales
         + "\tPercentage Of Sales: " + percentageOfSales;
    }
}
