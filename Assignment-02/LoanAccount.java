package lab15;

public class LoanAccount extends BankAccount {
    private double givingInterestRate;
    private double installmentAmount;
    private int tenure;

    public LoanAccount(String name, String address, int age, double givingInterestRate, double installmentAmount, int tenure) {
        super(name, address, age);
        this.givingInterestRate = givingInterestRate;
        this.installmentAmount = installmentAmount;
        this.tenure = tenure;
    }

    public double getGivingInterestRate() {
        return givingInterestRate;
    }

    public void setGivingInterestRate(double givingInterestRate) {
        this.givingInterestRate = givingInterestRate;
    }

    public double getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(double installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }
}

