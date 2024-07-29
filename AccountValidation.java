package assignment1;

	
	public class AccountValidation {
		 
		
		
		public static void validateAccountNumber(int number) throws InvalidAccountException {
			if (number <= 0) {
				throw new InvalidAccountException("Invalid Account : Account number should not be negative.");
			}
		}

		public static void validateName(String name) throws InvalidAccountException {
			if (name.length() < 3) {
				throw new InvalidAccountException("Invalid Account : Name should be more than 3 characters");
			}
		}

		public static void validateType(String type) throws InvalidAccountException {
			if (!(type.equalsIgnoreCase("SAVINGS") || type.equalsIgnoreCase("CURRENT"))) {
				throw new InvalidAccountException("Invalid Account : type can be only SAVINGS or CURRENT ");
			}
			
		}
		

		public static void validateBalance(double balance)throws InvalidAccountException {
			
			if (balance <= 0) {
				
				throw new InvalidAccountException("Invalid balance : balance should be positive number");
			}
			
			
		}

	}



