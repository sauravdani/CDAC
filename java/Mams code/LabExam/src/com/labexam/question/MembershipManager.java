package com.labexam.question;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


//Exception class for empty membership list
class EmptyMembershipListException extends Exception {
	public EmptyMembershipListException(String message) {
		super(message);
	}
}

public class MembershipManager {
	
	//List collection to store memberships
	
	List<Membership> memberships = new ArrayList<>();
	
	
	
	// Add a new membership
	public void addMembership(Membership membership) {
		memberships.add(membership);
		System.out.println("Membership added: " + membership);
	}
	
	//update availaibilty of plan
	public void updateAvailability(int id, int newSlots) {
		for(Membership m : memberships) {
			if(m.getId() == id) {
				m.setAvailableSlots(newSlots);
				m.setLastUpdatedDate(LocalDate.now());
				System.out.println("Membership ID " + id + " updated with new slots: " + newSlots);
				return;
			}
		}
		System.out.println("Membership ID " + id + " not found.");
	}
	
	//Add a 40% discount on memberships not purchased in the last 6 months using lambda
	public void applyDiscountToOldMemberships() {
		LocalDate sixMonthsAgo = LocalDate.now().minusMonths(6);
		memberships.stream().filter(m -> m.getLastEnrolledDate().isBefore(sixMonthsAgo))
			.forEach(m -> m.setDiscount(40.0));
		System.out.println("Applied 40% discount to memberships not purchased in the last 6 months.");
	}
	
	//Remove memberships that were created more than a year ago and have zero enrollments
	public void removeOldMemberships() {	
		LocalDate oneYearAgo = LocalDate.now().minusYears(1);
		memberships.removeIf(m -> m.getCreationDate().isBefore(oneYearAgo) && m.getAvailableSlots() == 0);
	}	
	
	//Display all memberships
	public void displayMemberships() throws EmptyMembershipListException {
		if(memberships.isEmpty()) {
			throw new EmptyMembershipListException("No memberships available to display.");
		}
		for(Membership m : memberships) {
			System.out.println(m);
		}
	}

}
