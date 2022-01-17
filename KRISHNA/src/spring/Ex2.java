public class Ex2 {
	private int id;
	private String name;
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
}
class test10 {
	public static void main(String[] args) {
		Ex2 e = new Ex2();
		e.setId(10);
		e.setId(20);
		
		System.out.println(e.getId());
		System.out.println(e.getId());
	}
}