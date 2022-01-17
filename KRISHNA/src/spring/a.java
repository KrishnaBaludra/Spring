class a

{
	public static void main(String[] args) {

		byte b = (byte) 5000; //
		System.out.println(b);
		short s = 5;
		System.out.println(s);
		byte b1 = 127;
		System.out.println(b1);
		short s1 = b1;
		byte b2 = (byte) s1;
		System.out.println(b2);
		System.out.println(s1);

		float f2 = 10;
		float f3 = (float) 10.5;
		System.out.println(f3);
		int i = 10;
		float f1 = (float) 5.5;
		int k = (int) (i + f1);
		System.out.println(k);

		byte m = 32;
		byte n = 65;
		int hn = m + n;
		System.out.println(hn);

		byte b4 = (byte) (m + n);
		System.out.println(b4);

		char c1 = 'b';
		System.out.println((int) c1);

	}
}