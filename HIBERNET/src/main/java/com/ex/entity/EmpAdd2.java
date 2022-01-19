package com.ex.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EmpAdd2 {
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO )
	private int id;
	private String name;
	private int sal;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresslist;
	
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
	public List<Address> getAddresslist() {
		return addresslist;
	}
	public void setAddresslist(List<Address> addresslist) {
		this.addresslist = addresslist;
	}
	@Override
	public String toString() {
		return "EmpAdd2 [id=" + id + ", name=" + name + ", sal=" + sal + ", addresslist=" + addresslist + "]";
	}

}
