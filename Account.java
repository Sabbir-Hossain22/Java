package assignment1;

public class Account {

	private int number;
	private String name;
	private String type;
	private double balance;
	private boolean isActive;

	public Account() {

	}

	public Account(int number, String name, String type, double balance) throws InvalidAccountException {
		super();

		AccountValidation.validateAccountNumber(number);
		AccountValidation.validateName(name);
		AccountValidation.validateType(type);
		AccountValidation.validateBalance(balance);

		this.number = number;
		this.name = name;
		this.type = type;
		this.balance = balance;
		this.isActive = true;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String toString() 
	{
   return "Account [number=" + number + ", name=" + name + ", type=" + type + ", balance=" + balance + ", active="
				+ this.isActive + "]";
	}
}
