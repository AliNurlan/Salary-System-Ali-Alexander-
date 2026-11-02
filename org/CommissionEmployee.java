public class CommissionEmployee extends Employee{
    protected double sales;
    protected double commission;
    
    CommissionEmployee(double sales, double commission, int workingHours){
        super();
        this.sales = sales;
        this.commission = commission;
        setWorkingHours(workingHours);
    }

    @Override
    public double income() {
        return sales*commission;
    }
    
    @Override
    public String toString() {
        return "CommissionEmployee.\tSalary: " + salary +
         "\tWorking hours per week: " + workingHours
         + "\nNumer of Sale: " + sales
         + "\tCommission: " + commission
         + "\tSocial Numbers: ";
    }
}
