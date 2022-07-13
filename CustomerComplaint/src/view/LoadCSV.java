// Zipcode and State columns are of no use hence dropped those columns from csv file

package view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import model.Complaint;

public class LoadCSV {
	List<Complaint> complaints = new ArrayList<Complaint>();
	private final String file = ".//src//complaints.csv";

	public List<Complaint> getComplaints() {
		try {
			String line = "";
			BufferedReader reader = new BufferedReader(new FileReader(file));
			reader.readLine();
			
			while((line = reader.readLine())!=null) {
				String[] fields = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
				
				if (fields.length > 0) {
					Complaint complaint = new Complaint();
					try {
						complaint.setDateReceived(fields[0] == "" ? null : LocalDate.parse(fields[0], DateTimeFormatter.ofPattern("MM/dd/yyyy")));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						complaint.setDateReceived(fields[0] == "" ? null : LocalDate.parse(fields[0], DateTimeFormatter.ofPattern("dd-MM-yyyy")));
					}
//					complaint.setDateReceived(fields[0].trim() == "" ? null : LocalDate.parse(fields[0], DateTimeFormatter.ofPattern("MM/dd/yyyy")));
					complaint.setProduct(fields[1].trim() == "" ? null : fields[1]);
					complaint.setSubProduct(fields[2].trim() == "" ? null : fields[2]);
					complaint.setIssue(fields[3].trim() == "" ? null : fields[3]);
					complaint.setSubIssue(fields[4].trim() == "" ? null : fields[4]);
					complaint.setCompany(fields[5].trim() == "" ? null : fields[5]);
//					complaint.setState(fields[6].trim() == "" ? null : fields[6]);
//					complaint.setZipCode(fields[7].trim() == "" ? null : Integer.parseInt(fields[7]));
					complaint.setSubmitted(fields[6] == "" ? null : fields[6]);
					try {
						complaint.setDateSentToCompany(fields[7] == "" ? null : LocalDate.parse(fields[7], DateTimeFormatter.ofPattern("MM/dd/yyyy")));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						complaint.setDateSentToCompany(fields[7] == "" ? null : LocalDate.parse(fields[7], DateTimeFormatter.ofPattern("dd-MM-yyyy")));
					}
					complaint.setCompanyResponse(fields[8] == "" ? null : fields[8]);
					complaint.setTimelyResponse(fields[9] == "" ? null : fields[9]);
					complaint.setConsumerDisputed(fields[10] == "" ? null : fields[10]);
					complaint.setComplaintId(fields[11] == "" ? null : Integer.parseInt(fields[11]));
					complaints.add(complaint);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return complaints;
	}
}
