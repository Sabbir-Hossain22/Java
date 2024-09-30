package lab15;

public class DPSAccount extends BankAccount {
    private double interestRate;
    private double monthlyInstallment;

    public DPSAccount(String name, String address, int age, double interestRate, double monthlyInstallment) {
        super(name, address, age);
        this.interestRate = interestRate;
        this.monthlyInstallment = monthlyInstallment;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMonthlyInstallment() {
        return monthlyInstallment;
    }

    public void setMonthlyInstallment(double monthlyInstallment) {
        this.monthlyInstallment = monthlyInstallment;
    }
}

