package spring;

class AirtelSim {
	public void calling() {
		System.out.println("Calling with Airtel");
	}

	public void browsing() {
		System.out.println("Browing with Airtel");
	}
}

class OneplusMobile {
	AirtelSim sim;

	public AirtelSim getSim() {
		return sim;
	}

	public void setSim(AirtelSim sim) {
		this.sim = sim;
	}

	public void call() {
		sim.calling();
	}

	public void browse() {
		sim.browsing();
	}
}

public class Ex3TightCoupleSetterMethod {
	public static void main(String[] args) {
		AirtelSim a = new AirtelSim();
		OneplusMobile o = new OneplusMobile();
		o.setSim(a);
		o.call();
		o.browse();
	}
}
