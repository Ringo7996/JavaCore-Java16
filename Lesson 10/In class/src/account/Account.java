package account;

public class Account implements IAccount{
    private String name;
    private int accountNumber;
    private String email;
    private double accountBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    public Account(String name, int accountNumber, String email, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.accountBalance = accountBalance;
    }

    @Override
    public void recharge(double amount) {
        this.accountBalance = amount;
    }

    @Override
    public void changeEmail(String email) {
        this.email = email;
    }

    @Override
    public void displayInfo() {
        System.out.println("In ra" + name+" "+accountNumber+" "+email+accountBalance);

    }
}
