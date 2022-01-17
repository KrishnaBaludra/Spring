public class Testallpg {
	public static void main(String[] args) {
		System.out.println("Hello World ");
		System.out.println("I am entering the java World");
		System.out.println("Rock the Software Industry");
	}

}

class addition {
	public static void main(String[] args) {
		int i = 2; 
		int j = 4;
		int k = i + j;
		System.out.println(k);
	}
}

class add3 {
	static int i = 10;
	static int j = 11;

	public static void main(String[] args) {
		System.out.println(i + j);
	}
}

class test2 {
	int l = 45;
	static int i = 10;
	static int j = 60;
}
// Calling the Static Variables with class name
class test3 {
	public static void main(String[] args) {
		System.out.println(test2.j + test2.i);
	}
}

class Testvar{
	int i = 20; //NonStaticVariable
	static int k = 20 ; //Staticvariable
	public static void main(String[] args) {
		int j = 100;
		System.out.println(j);
		System.out.println(Testvar.k);
		Testvar t = new Testvar();
		System.out.println(t.i);
		test2 t2 = new test2();
		System.out.println(t2.l);
		System.out.println(k);
	}
}
// Type casting implicit casting
// Explicit Casting
class Testbyte{
	public static void main(String[] args) {
		byte b = 5;
		byte b3 = 10;
		byte b4 = 127;
		char i = 65;
		int i2 = b3; // Implicit Casting
		byte b7 = (byte)i2; // Explicit Casting
		System.out.println(b7);
		}
}

class Testbyte2{
	public static void main(String[] args) {
		int i = 200;
		//byte b=i;
		byte b2 = (byte)i;
	System.out.println(b2);
	}
}
class emp1
{
	int id;
	int branchid;
}
class test5{
	public static void main(String[] args) {
	emp1 e1 = new emp1();
	System.out.println(e1.id);
	System.out.println(e1.branchid);
	}
}

