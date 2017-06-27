package tw.aaa.myproject.OOP;

class and {
	public void a(int b, int c) {
		System.out.println("b+c=" + (b + c));
	}

	public void i(int j, int k) {
		System.out.println("j+k=" + (j - k));
	}
}

public class testClass2 {

	public static void main(String[] args) {

		and z = new and();
		z.a(10, 5);
		z.i(4, 3);
	}

}
