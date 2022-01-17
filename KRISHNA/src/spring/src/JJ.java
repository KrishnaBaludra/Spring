class Overriding1{
	public void m1(){
		System.out.println("M1  Overriding1NS method ");
	}
	public static void m2(){
		System.out.println("M2 Overriding1N method");
	}
}
class Overriding2 extends Overriding1{
	public void m1(){
		System.out.println("M1 Overriding2NS method");
	}
	public static void m2(){
		System.out.println("M2 Overriding2N method");
	}
}
public class JJ {
	public static void main(String[] args) {
		Overriding1 o1 = new Overriding2();
		o1.m1();
		o1.m2();
	}

}
