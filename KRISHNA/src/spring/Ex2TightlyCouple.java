package spring;

class Engn {
	String name;
	int cc;
}

class Car1 {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engn getEngn() {
		return engn;
	}

	public void setEngn(Engn engn) {
		this.engn = engn;
	}

	Engn engn;

	public void start() {
		System.out.println("Started");
	}
}

public class Ex2TightlyCouple {
	public static void main(String[] args) {
		Engn eng = new Engn();
		Car1 car = new Car1();
		car.setEngn(eng);
		car.start();

	}
}


