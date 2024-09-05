package assignment1;

import java.io.IOException;
import java.util.Scanner;

public class Test {


		public static void main(String[] args) throws IOException {

			Scanner sc = new Scanner(System.in);

			Account accounts[] = new Account[5];
			int indx = 0;

			while (true) {
				System.out.println("Enter your choice");
				System.out.println("1. Add Account");
				System.out.println("2. View Account");
				System.out.println("3. View all accounts");
				System.out.println("4. Deactivate Account");
				System.out.println("5. Exit");
				System.out.println("\n");

				int choice = sc.nextInt();

				switch (choice) {
				case 1:

					try {

						System.out.println("Please Enter Account Number , Name, Type, Balance");
						Account account = new Account(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
						accounts[indx++] = account;
						System.out.println("Account added successfully");

					} catch (InvalidAccountException e) {
						
						e.printStackTrace();
					}

					break;

				case 2:
					System.out.println("Enter account number");
					int number = sc.nextInt();

					boolean isFound = false;

					for (Account temp : accounts) {
						if (temp != null)
							if (temp.getNumber() == number) {
								System.out.println(temp);
								isFound = true;
								break;
							}
					}

					if (!isFound) {
						System.out.println("Account does not exist!");
					}

					break;
				case 3:
					System.out.println("Displaying all accounts");

					for (Account temp : accounts) {
						if (temp != null)
							System.out.println(temp);
					}

					break;
				case 4:

					System.out.println("Enter account number");
					number = sc.nextInt();

					isFound = false;

					for (Account temp : accounts) {
						if (temp != null)
							if (temp.getNumber() == number) {
								temp.setActive(false);
								System.out.println("Account has been deactivated!");
								isFound = true;
								break;
							}
					}

					if (!isFound)
						System.out.println("Account does not exist!");

					break;
				case 5:
					System.out.println("Thank you");
					sc.close();
					System.exit(0);
				default:
					System.out.println("Invalid choice");
				}
			}

		}
	}


