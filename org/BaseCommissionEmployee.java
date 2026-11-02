public class BaseCommissionEmployee extends CommissionEmployee{
    BaseCommissionEmployee(double salary, int workingHours, double sales, double percentageOfSales){
        super(sales, percentageOfSales, workingHours);
    }
    
    @Override
    public double income() {
        // TODO Auto-generated method stub
        return super.income();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
