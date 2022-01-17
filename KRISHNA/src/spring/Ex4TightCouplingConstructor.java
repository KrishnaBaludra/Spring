package spring;

class JioSim {
	public void jioCalling(){
		System.out.println();
	}
	public void jioBrowsing() {
		System.out.println();
	}
}

class JioMobile {
	JioSim sim;

	public JioMobile(JioSim sim) {
		super();
		this.sim = sim;
	}
	public void call() {
		sim.jioCalling();
	}
	public void browse() {
		sim.jioBrowsing();
	}
	
}
public class Ex4TightCouplingConstructor {
	public static void main(String[] args) {
		JioSim sim = new JioSim();
		JioMobile mob = new JioMobile(sim);
		mob.call();
		mob.browse();
	}
}
