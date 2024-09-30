package lab15;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String name, String address, int age, double interestRate) {
        super(name, address, age);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

