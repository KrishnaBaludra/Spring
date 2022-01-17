public class Object {
	int rollnum;
	String studentname;

	Object() {
	}

	public static void main(String[] args) {
		Object s1 = new Object();
		Object s2 = new Object();
	
		s1.rollnum = 101;
		s1.studentname = "Sai";
		s2.rollnum = 102;
		s2.studentname = "Ramireddy";
		System.out.println("Roll Num= " + s1.rollnum);
		System.out.println("Student Name = " + s1.studentname);
		System.out.println(s2.rollnum + s2.studentname);
	}

}
