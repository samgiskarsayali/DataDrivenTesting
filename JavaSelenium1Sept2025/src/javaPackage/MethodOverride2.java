package javaPackage;

public class MethodOverride2 extends MethodOverride1 {

	public void eat() {
		System.out.println("Eat Again");
	}

	public static void main(String[] args) {
		MethodOverride2 m2 = new MethodOverride2();
		m2.eat();

		MethodOverride1 m1 = new MethodOverride1();
		m1.eat();

	}

}
