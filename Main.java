package basicjava;

class Base {
	 protected void foo() {}
	}
	class Derived extends Base {
	public void foo() {}
	
	}
	public class Main {
	 public static void main(String args[]) {
	 Derived d = new Derived();
	 d.foo();
	 }
	}