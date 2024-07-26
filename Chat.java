package assignment2;

public class Chat {
	public volatile int peopleLeft = 3;
	public volatile int[] people = { 1, 2, 3 };
	public volatile int whichOnesTurn = 1;

	public static void main(String[] args) {
		Chat c = new Chat();
		Person p1 = new Person("person1", c, 1);
		Person p2 = new Person("person2", c, 2);
		Person p3 = new Person("Person3", c, 3);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		t1.start();
		t2.start();
		t3.start();
	}
}



