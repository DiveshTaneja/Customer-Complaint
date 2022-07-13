// Zipcode and State columns are of no use hence dropped those columns from csv file

package view;

import java.util.*;
import java.util.Scanner;

import model.Complaint;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		UserStories stories = new UserStories();
		LoadCSV csv = new LoadCSV();
		List<Complaint> complaints;

		complaints = csv.getComplaints();

		while (true) {
			System.out.println(
					"\n1. View complaints by year\n2. View complaints by bank name\n3. View complaints based on complaint ID\n4. Get  number of days took by the Bank to close the complaint\n5. Display all the complaints closed/closed with explanation\n6. Display all the complaints which received a timely response\n7. Exit\n");
			int option = sc.nextInt();
			List<Complaint> res = new ArrayList<Complaint>();
			switch (option) {
			case 1:
				System.out.println("Enter year");
				int year = sc.nextInt();
				res = stories.complaintsBasedOnYear(complaints, year);
				for (Complaint complaint : res) {
					System.out.println(
							complaint.getDateReceived() + ", " + complaint.getIssue() + ", " + complaint.getCompany());
				}
				break;
			case 2:
				System.out.println("Enter bank name");
				String bank = sc.next();

				res = stories.complaintsBasedOnBank(complaints, bank);
				for (Complaint complaint : res) {
					System.out.println(
							complaint.getDateReceived() + ", " + complaint.getIssue() + ", " + complaint.getCompany());
				}
				break;
			case 3:
				System.out.println("Enter Complaint ID");
				int complaintID = sc.nextInt();

				res = stories.complaintsBasedOnId(complaints, complaintID);
				for (Complaint complaint : res) {
					System.out.println(
							complaint.getDateReceived() + ", " + complaint.getIssue() + ", " + complaint.getCompany());
				}
				break;
			case 4:
				stories.dateDifference(complaints);
				break;
			case 5:
				stories.complaintsWithClosedExplanation(complaints);
				break;
			case 6:
				stories.complaintsReceivedATimelyResponse(complaints);
				break;
			case 7:
				System.exit(0);
			}
		}
	}

}
