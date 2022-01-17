class AB{
	int i = 10;
	static int j=20;
}
class BB extends AB{
	int k= 30;
	static int l = 40;	
}
public class Ex3 {
	public static void main(String[] args) {
		BB f1 = new BB();
		System.out.println(f1.i);
		System.out.println(AB.j);
		System.out.println(f1.k);
		System.out.println(BB.l);
		AB f2 = new AB();
		System.out.println(f2.i);
		System.out.println(f2.j);
		//System.out.println(f2.k);
		//System.out.println(f2.l);
		
	}
}
