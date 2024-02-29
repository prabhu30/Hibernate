package com.prabhu.hibernate.IntroProject;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LaptopName {

	@Column(name = "Brand")
	private String brand;
	
	@Column(name = "Model")
	private String model;
	
	@Column(name = "Version")
	private int version;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getVersion() {
		return version;
	}
	
	public void setVersion(int version) {
		this.version = version;
	}
	
	@Override
	public String toString() {
		return "LaptopName [brand=" + brand + ", model=" + model + ", version=" + version + "]";
	}
}
