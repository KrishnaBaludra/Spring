package classfile;

import org.springframework.stereotype.Component;

@Component
public class Bus {
	private String name;
	private int cc;
	@Override
	public String toString() {
		return "Bus [name=" + name + ", cc=" + cc + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
}
