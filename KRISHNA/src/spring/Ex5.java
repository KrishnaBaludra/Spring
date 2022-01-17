class Overloading1 {
	int add(int i, int j) {
		return i + j;
	}

	int add(int i, int k, int j) {
		return i + j + k;
	}

	float add(int i, float f) {
		return i + f;
	}

	float add(float f, int i) {
		return f + i;
	}

	float add(float f, float f3) {
		return f + f3;
	}
}

public class Ex5 {
	public static void main(String[] args) {
		Overloading1 c = new Overloading1 ();
		System.out.println(c.add(10, 20));
		System.out.println(c.add(10, 20, 23));
		System.out.println(c.add(10, 20.2f));
		System.out.println(c.add(10.2f, 20.9f));

	}

}
