package Exercises.Section7;

public class BankAccount {

    private String accountNumber;
    private int accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void withdraw (int amount) {
        if (amount < 0){
            System.out.println("Invalid amount.");
        } else if (this.accountBalance < amount){
            System.out.println("Insufficient funds. Balance: " + this.accountBalance);
        } else {
            this.accountBalance -= amount;
            System.out.println(amount + " withdrew. Balance: " + this.accountBalance);
        }
    }

    public void deposit (int amount) {
        if (amount > 0) {
            this.accountBalance += amount;
            System.out.println(amount + " deposited. Balance: " + this.accountBalance);
        }

    }

    public void printInfo(){
        System.out.println(
                "Account Number: " + accountNumber + "\n" +
                "Account Balance: " + accountBalance + "\n" +
                "Customer Name: " + customerName + "\n" +
                "Customer E-mail: " + customerEmail + "\n" +
                "Customer Phone: " + customerPhoneNumber + "\n"
        );
    }
}
