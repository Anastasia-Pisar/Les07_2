package by.htp.les07task2.main;

public class Main {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		Test2 test = new Test2();
		Test2 test1 = new Test2(a, b);

		System.out.println("a = " + test.getA() + " , b = " + test.getB());
		System.out.println("a = " + test1.getA() + " , b = " + test1.getB());

		System.out.println();
		test.setA(a);
		test.setB(b);

		System.out.println("a = " + test.getA() + " , b = " + test.getB());
	}
}
