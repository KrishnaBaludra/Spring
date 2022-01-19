package com.ex.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmpAdd {
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO )
	private int id;
	private String name;
	private int sal;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	public int getId() {
		return id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmpAdd [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
