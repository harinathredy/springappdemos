package com.samples.S01springcoredi;

import java.util.Set;

public class CarDealer {
	String name;
	Set<String> modelName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getModelName() {
		return modelName;
	}
	public void setModelName(Set<String> modelName) {
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "CarDealer [name=" + name + ", modelName=" + modelName + "]";
	}
	

}
