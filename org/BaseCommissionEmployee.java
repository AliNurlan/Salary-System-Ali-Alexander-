public class BaseCommissionEmployee extends CommissionEmployee{
    BaseCommissionEmployee(double sales, double percentageOfSales, int workingHours) {
        super(sales, percentageOfSales, workingHours);
        //TODO Auto-generated constructor stub
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
