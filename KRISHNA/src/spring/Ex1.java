class Emp {
	int id;
	String name;

	Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
public class Ex1 { 
	public static void main(String[] args) {
		Emp	e1 = new Emp(101," Ohm");
		Emp	e2 = new Emp(102," Namah");
		Emp	e3 = new Emp(103," Siva");
		Emp	e4 = new Emp(104," ya");
		System.out.println(e1.id+e1.name);
		System.out.println(e2.id+e2.name);
		System.out.println(e3.id+e3.name);
		System.out.println(e4.id+e4.name);
	}

}

