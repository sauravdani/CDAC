package com.labexam.question;

import java.time.LocalDate;

enum Type {
	MONTHLY, QUARTERLY, YEARLY, PERSONAL_TRAINING
}
public class Membership {
	
	private static int id = 1; // static counter for unique IDs
	private int instanceId; 
	private Type type;
	private LocalDate creationDate;
	private int availableSlots;
	private LocalDate lastUpdatedDate;
	private LocalDate lastEnrolledDate;
	private String gymName;
	private double price;
	private double discount; // percentage discount
	
	

	public Membership(Type type, LocalDate creationDate, int availableSlots, LocalDate lastUpdatedDate,
			LocalDate lastEnrolledDate, String gymName, double price) {
		super();
		// assign unique id for each new membership
		this.instanceId = id;
		Membership.id++;
		this.type = type;
		this.creationDate = creationDate;
		this.availableSlots = availableSlots;
		this.lastUpdatedDate = lastUpdatedDate;
		this.lastEnrolledDate = lastEnrolledDate;
		this.gymName = gymName;
		this.price = price;
		this.discount = 0.0;
	}
	public int getId() {
		return instanceId;
	}

	
	public Type getType() {
		return type;
	}
	

	public void setType(Type type) {
		this.type = type;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public int getAvailableSlots() {
		return availableSlots;
	}

	public void setAvailableSlots(int availableSlots) {
		this.availableSlots = availableSlots;
	}

	public LocalDate getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(LocalDate lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public LocalDate getLastEnrolledDate() {
		return lastEnrolledDate;
	}

	public void setLastEnrolledDate(LocalDate lastEnrolledDate) {
		this.lastEnrolledDate = lastEnrolledDate;
	}

	public String getGymName() {
		return gymName;
	}

	public void setGymName(String gymName) {
		this.gymName = gymName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double getPriceAfterDiscount() {
		return price - discount;
	}

	@Override
	public String toString() {
		return "Membership [type=" + type + " Id = " + instanceId + ", creationDate=" + creationDate + ", availableSlots=" + availableSlots
				+ ", lastUpdatedDate=" + lastUpdatedDate + ", lastEnrolledDate=" + lastEnrolledDate + ", \n gymName="
				+ gymName + ", price (in INR )= " + price + ", discount=" + discount + " % , priceAfterDiscount (in INR)= " + getPriceAfterDiscount() + "]";
	}
	


}