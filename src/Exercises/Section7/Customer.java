package Exercises.Section7;

public class Customer {

    private String name;
    private int creditLimit;
    private String eMailAddress;

    public Customer(){
        this("Unknown", 1000, "Unknown");
    }

    public Customer(String name, String eMailAddress){
        this(name, 1500, eMailAddress);
    }

    public Customer(String name, int creditLimit, String eMailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.eMailAddress = eMailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }
}
