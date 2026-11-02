public class CommissionEmployee extends Employee{
    protected double sales;
    protected double commission;
    
    CommissionEmployee(String firstName, String lastName, int sales, double commission, int socialNumber){
        super(firstName, lastName, socialNumber);
        this.sales = sales;
        this.commission = commission;
    }

    @Override
    public double income() {
        return sales*commission;
    }
    
    @Override
    public String toString() {
        return "CommissionEmployee.\tName: " + getFirstName() +" "+ getLastName() +
         "\tSocial Number: " + getSocialNumber()
         + "\nNumer of Sale: " + sales
         + "\tCommission: " + commission
         + "\tSalary: " + income();
    }
}
