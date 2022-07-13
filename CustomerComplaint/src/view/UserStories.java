package view;

import java.time.Period;
import java.util.*;

import model.Complaint;

public class UserStories {
	
	public List<Complaint> complaintsBasedOnYear(List<Complaint> complaints, int year) {
		List<Complaint> result = new ArrayList<Complaint>();
		
		for (Complaint complaint: complaints) {
			if (complaint.getDateReceived().getYear() == year) {
				result.add(complaint);
			}
		}
		
		return result;
	}
	
	public List<Complaint> complaintsBasedOnBank(List<Complaint> complaints, String bankName) {
		List<Complaint> result = new ArrayList<Complaint>();
		
		for (Complaint complaint: complaints) {
			if (complaint.getCompany().trim().equalsIgnoreCase(bankName.trim())) {
				result.add(complaint);
			}
		}
		
		return result;
	}
	
	public List<Complaint> complaintsBasedOnId(List<Complaint> complaints, int complaintId) {
		List<Complaint> result = new ArrayList<Complaint>();
		
		for (Complaint complaint: complaints) {
			if (complaint.getComplaintId() == complaintId) {
				result.add(complaint);
			}
		}
		
		return result;
	}
	
	public void dateDifference(List<Complaint> complaints) {
		List<Complaint> result = new ArrayList<Complaint>();
		
		for (Complaint complaint: complaints) {
			Period period = Period.between(complaint.getDateReceived(), complaint.getDateSentToCompany());
			System.out.println(complaint.getDateReceived() + ", " +complaint.getDateSentToCompany() + ", " + complaint.getIssue() + ", " + Math.abs(period.getDays()));
		}
		
	}
	
	public void complaintsWithClosedExplanation(List<Complaint> complaints) {
		List<Complaint> result = new ArrayList<Complaint>();
		
		for (Complaint complaint: complaints) {
			if (complaint.getCompanyResponse().equalsIgnoreCase("Closed") || complaint.getCompanyResponse().equalsIgnoreCase("closed with explanation")) {
				System.out.println(
						complaint.getDateReceived() + ", " + complaint.getIssue() + ", " + complaint.getCompanyResponse() + ", " + complaint.getCompany());
			}
			
		}
		
	}
	
	public void complaintsReceivedATimelyResponse(List<Complaint> complaints) {
		List<Complaint> result = new ArrayList<Complaint>();
		
		for (Complaint complaint: complaints) {
			if (complaint.getTimelyResponse().equalsIgnoreCase("Yes")) {
				System.out.println(
						complaint.getDateReceived() + ", " + complaint.getIssue() + ", " + complaint.getCompany() + ", " + complaint.getTimelyResponse());
			}
			
		}
		
	}
	
}
