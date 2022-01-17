package spring;

interface I {
	public void m1();
}

interface Sai {
	public void m2();
}

class A implements I, Sai {
	public void m1() {
		System.out.println("A method");
	}

	public void m2() {
		System.out.println("Sai A Method");
	}
}

class B implements I, Sai {
	public void m1() {
		System.out.println("B method");
	}

	public void m2() {
		System.out.println("Sai B Method");
	}
}

class C extends A {
	public void m1() {
		System.out.println("Cmethod");
	}
}

class Factory {
	public static I getI() { // Ikkada I andi<i> return type ade and get-I anedi kuda <i>
		return new A();
	}

	public static Sai getSai() {
		return new A();
	}
}

class Factory1 {
	public static I getI() { // Ikkada I anedi<i> return type ade and get-I anedi kuda <i>
		return new B();
	}

	public static Sai getSai() { // Ikkada Sai anedi<i> return type ade and get-Sai anedi kuda <i>
		return new B();
	}
}

public class Ex1Factory {
	public static void main(String[] args) {
		I i1 = Factory.getI();
		i1.m1();
		I i2 = Factory1.getI();
		i2.m1();
		Sai i3 = Factory.getSai();
		i3.m2();
		Sai i4 = Factory1.getSai();
		i4.m2();
		
	}
}
