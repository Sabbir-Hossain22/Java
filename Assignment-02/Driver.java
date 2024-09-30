package lab15;

public class Driver {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Sabbir", " Basundhara", 30);
        CurrentAccount currentAccount = new CurrentAccount("Hossain", "Purana Polton", 25);
        SavingsAccount savingsAccount = new SavingsAccount("Kuddus", "Gulistan", 35, 0);
}
}
