package assignment2;

import java.util.Scanner;

class Person implements Runnable {

	String name;

	Chat ch;

	int who;

	Person(String name, Chat ch, int who) {
		this.name = name;
		this.ch = ch;
		this.who = who;
	}

	public void whichOneNow() {
		if (ch.peopleLeft >= 2) {
			int i = ch.whichOnesTurn - 1;
			i = i + 1;
			if (i == ch.people.length)
				i = 0;

			while (ch.people[i] == -1) {
				i += 1;
				if (i == ch.people.length)
					i = 0;
			}
			ch.whichOnesTurn = i + 1;
			ch.notifyAll();
		} else {
			System.exit(0);
		}
	}

	public void run() {
		
		try {
			
			synchronized (ch) {
				
				while (true) {
					
					while (ch.whichOnesTurn != this.who) {
						
						ch.wait();
					}
					
					System.out.print(this.name + " : ");

					Scanner sc = new Scanner(System.in);
					
					String message = sc.nextLine();
					
					if (message.equalsIgnoreCase("stop")) {
						
						ch.peopleLeft -= 1;
						
						ch.people[ch.whichOnesTurn - 1] = -1;
						
						whichOneNow();
						break;
					}
					whichOneNow();
				}
			}
		} 
		catch (Exception e) 
		{
			
		}
	}

}
