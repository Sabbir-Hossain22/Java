import java.util.Scanner;

//this is person class  
class Person implements Runnable { // name of person
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
		} catch (Exception e) {

		}
	}
}

class Chat 
{         //number of people in the chat     public volatile int peopleLeft=3;     //people array to check whether person still in chatting or not     public volatile int[] people={1,2,3};     //which ones turn by default first person turn     public volatile int whichOnesTurn=1;     public static void main(String[] args) {         //creating chat object         Chat c=new Chat();         //creating three persons using person constructor         Person p1=new Person("person1",c,1);         Person p2=new Person("person2", c, 2);         Person p3=new Person("Person3", c, 3);         //creating 3 threads         Thread t1=new Thread(p1);         Thread t2=new Thread(p2);         Thread t3=new Thread(p3);         //starting threads         t1.start();         t2.start();         t3.start();     } }
                    		   }}}}}
 }
