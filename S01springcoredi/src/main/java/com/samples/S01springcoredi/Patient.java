package com.samples.S01springcoredi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;
	public void Patient() {
		System.out.println("inside patient constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside the setter method for Id field");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	@PostConstruct
	public void Method1() {
		System.out.println("Inside the method one");
	}
	@PreDestroy
	public void Method2() {
		System.out.println("Inside the method two");
	}
	

}
