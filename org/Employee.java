
public abstract class Employee {
    private String firstName = "John";
    private String lastName = "Doe";
    private int socialNumber;

    Employee(){}
    Employee(String firstName, String lastName, int socialNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialNumber = socialNumber;
    }

    final public void setFirstName(String name){
        if(name == null || name == ""){
            System.out.println("Name can't be empty");
        }
        else if(name.length() < 2){
            System.out.println("Name can't be shorter that 2 letters");
        }
        else{
            this.firstName = name;
        }
    }
    public String getFirstName() {
        return firstName;
    }

    final public void setLastName(String name){
        if(name == null || name == ""){
            System.out.println("Last name can't be empty");
        }
        else if(name.length() < 3){
            System.out.println("Last name can't be shorter that 3 letters");
        }
        else{
            this.lastName = name;
        }
    }
    public String getLastName() {
        return lastName;
    }

    public void setSocialNumber(int socialNumber) {
        this.socialNumber = socialNumber;
    }
    final public int getSocialNumber() {
        return socialNumber;
    }

    //totalIncomePerWeek
    public abstract double income();

}
