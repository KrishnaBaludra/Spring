package com.ex.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("conworker")
public class ConWorker extends Worker {
	private float payperhour;
	private String conDuration, name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPayperhour() {
		return payperhour;
	}

	public void setPayperhour(float payperhour) {
		this.payperhour = payperhour;
	}

	public String getConDuration() {
		return conDuration;
	}

	public void setConDuration(String conDuration) {
		this.conDuration = conDuration;
	}

	@Override
	public String toString() {
		return "ConWorker [payperhour=" + payperhour + ", conDuration=" + conDuration + "]";
	}

}
