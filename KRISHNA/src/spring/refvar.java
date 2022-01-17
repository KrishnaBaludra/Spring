
public class refvar {
	static boolean flag = true;
	static void m1(){
		System.out.println("This is M1 Method");
	}
	public static void main(String[] args) {
		System.out.println(flag);
		m1();
		System.out.println(refvar.flag);
		refvar.m1();
		refvar d = new refvar();
		System.out.println(d.flag);
		d.m1();
	}

}
