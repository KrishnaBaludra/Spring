public class sai {
	static int i = 10;
	int k = 19;
	static {
		System.out.println("This is static Block");
	}
	{
		System.out.println("Thsi is non static block");
	}

	static void m1() {
		System.out.println("This is Static Method");
	}

	void m2() {
		System.out.println("This non static Method");
	}

	sai() {
		System.out.println("This is constructor");
	}

	public static void main(String[] args) {
		System.out.println("This is main Method");
		System.out.println(i);
		sai k = new sai();
		{
			System.out.println(k.k);
			System.out.println("hh");
		}
		
	}
}
