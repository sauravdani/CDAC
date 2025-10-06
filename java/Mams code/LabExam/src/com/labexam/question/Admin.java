package com.labexam.question;

import java.time.LocalDate;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Membership m1 = new Membership(Type.MONTHLY, LocalDate.of(2023, 1, 1), 20, 
				LocalDate.of(2023, 5, 1), LocalDate.of(2023, 4, 1), "Gym A", 100.0);
		
		Membership m2 = new Membership(Type.YEARLY, LocalDate.of(2022, 1, 1), 0, 
				LocalDate.of(2022, 6, 1), LocalDate.of(2022, 5, 1), "Gym B", 500.0);
		
		
		Membership m3 = new Membership(Type.YEARLY, LocalDate.now(), 0, 
				LocalDate.now(), LocalDate.now(), "Gym C", 500.0);   //Discount should not be applied to this membership

		
		MembershipManager manager = new MembershipManager();  // Create an instance of MembershipManager
		
		manager.addMembership(m1);
		manager.addMembership(m2);
		manager.addMembership(m3);
		
		
		
		System.out.println("\nBefore updates:");
		try {
			manager.displayMemberships();	
			}catch(EmptyMembershipListException e) {
				System.out.println(e.getMessage());
			}
		
		// Update availability of membership with ID 1 to 30 slots
		manager.updateAvailability(1, 30);
		manager.updateAvailability(2, 100);
		manager.updateAvailability(4, 50); // Non-existent ID
		System.out.println("\nAfter updates:");
		try {
			manager.displayMemberships();	
			}catch(EmptyMembershipListException e) {
				System.out.println(e.getMessage());
			}
		
		
		// Apply discount to old memberships
		manager.applyDiscountToOldMemberships();
		System.out.println("\nAfter applying discounts:");
		
		
		try {
			manager.displayMemberships();	
			}catch(EmptyMembershipListException e) {
				System.out.println(e.getMessage());
			}
		
		// Remove old memberships
		manager.removeOldMemberships();
		
		System.out.println("\nAfter removing old memberships:");
		try {
			manager.displayMemberships();	
			}catch(EmptyMembershipListException e) {
				System.out.println(e.getMessage());
			}
}
}
