package tw.aaa.myproject.OOP;

class person {
	public void a() {
		System.out.println("bye");
	}

	public void sayHello() {
		System.out.println("HI");
		a();
	}
}

public class testClass {

	public static void main(String[] args) {
		person mike = new person();
		mike.sayHello();
		mike.a();
		System.out.println("finished");

	}

}
