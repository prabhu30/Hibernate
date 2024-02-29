package com.prabhu.hibernate.IntroProject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Laptop_Picks")
public class Laptop {

	@Id
	@Column(name = "laptop_id")
	private int id;
	
	private LaptopName laptopName;
	
	@Column(name = "laptop_price")
	private int price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public LaptopName getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(LaptopName laptopName) {
		this.laptopName = laptopName;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + laptopName + ", price=" + price + "]";
	}
}
