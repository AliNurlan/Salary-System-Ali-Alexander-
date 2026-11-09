public class BaseCommissionEmployee extends CommissionEmployee{
    private double bonus;
    private double baseSalary;
    BaseCommissionEmployee(String firstName, String lastName, int sales, double commission, int socialNumber, double bonus, double baseSalary){
        super(firstName, lastName, sales, commission, socialNumber);
        if (bonus > 1.0 || bonus < 0.0){
            throw new IllegalArgumentException("Bonus must be from 0.0 to 1.0");    
        }else{
            this.bonus = bonus;
            this.baseSalary = baseSalary;
        }

    }

    @Override
    public double income() {
        return super.income() + baseSalary + baseSalary*bonus;
    }

    @Override
    public String toString() {
        return "BaseCommissionEmployee.\tName: " + getFirstName() +" "+ getLastName() +
         "\tSocial Number: " + getSocialNumber()
         + "\nNumer of Sale: " + sales
         + "\tCommission: " + commission
         +"\tBase Salary: " + baseSalary
         +"\tBonus: " + bonus*100 + "%"
         + "\tSalary: " + income();
    }
}
