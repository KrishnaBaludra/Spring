class Calc {
	int add(int a, int b) {

		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	float add(float f, float h) {
		return f + h;
	}

	float add(int a, float f) {
		return a+f;
	}
	public static void main(String[] args) {
	Calc a = new Calc();
	System.out.println(a.add(10,20,10));
	//System.out.println(a.add(2.5, 2.4));
	//System.out.println(a.add(2, 2.0);
	}
}


public class Test1 {
	public static void main(String[] args) {
		System.out.println("See UP");
	}

}
