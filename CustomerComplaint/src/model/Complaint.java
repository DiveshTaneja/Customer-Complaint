package model;

import java.time.LocalDate;

public class Complaint {
	private LocalDate dateReceived;
	private String product;
	private String subProduct;
	private String issue;
	private String subIssue;
	private String company;
//	private String state;
//	private int zipCode;
	private String submitted;
	private LocalDate dateSentToCompany;
	private String companyResponse;
	private String timelyResponse;
	private String consumerDisputed;
	private int complaintId;
	
	public Complaint() {
		
	}
	
	public Complaint(LocalDate dateReceived, String product, String subProduct, String issue, String subIssue,
			String company, String state, int zipCode, String submitted, LocalDate dateSentToCompany,
			String companyResponse, String timelyResponse, String consumerDisputed, int complaintId) {
		super();
		this.dateReceived = dateReceived;
		this.product = product;
		this.subProduct = subProduct;
		this.issue = issue;
		this.subIssue = subIssue;
		this.company = company;
//		this.state = state;
//		this.zipCode = zipCode;
		this.submitted = submitted;
		this.dateSentToCompany = dateSentToCompany;
		this.companyResponse = companyResponse;
		this.timelyResponse = timelyResponse;
		this.consumerDisputed = consumerDisputed;
		this.complaintId = complaintId;
	}

	public LocalDate getDateReceived() {
		return dateReceived;
	}

	public void setDateReceived(LocalDate dateReceived) {
		this.dateReceived = dateReceived;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSubProduct() {
		return subProduct;
	}

	public void setSubProduct(String subProduct) {
		this.subProduct = subProduct;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getSubIssue() {
		return subIssue;
	}

	public void setSubIssue(String subIssue) {
		this.subIssue = subIssue;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public int getZipCode() {
//		return zipCode;
//	}
//
//	public void setZipCode(int zipCode) {
//		this.zipCode = zipCode;
//	}

	public String getSubmitted() {
		return submitted;
	}

	public void setSubmitted(String submitted) {
		this.submitted = submitted;
	}

	public LocalDate getDateSentToCompany() {
		return dateSentToCompany;
	}

	public void setDateSentToCompany(LocalDate dateSentToCompany) {
		this.dateSentToCompany = dateSentToCompany;
	}

	public String getCompanyResponse() {
		return companyResponse;
	}

	public void setCompanyResponse(String companyResponse) {
		this.companyResponse = companyResponse;
	}

	public String getTimelyResponse() {
		return timelyResponse;
	}

	public void setTimelyResponse(String timelyResponse) {
		this.timelyResponse = timelyResponse;
	}

	public String getConsumerDisputed() {
		return consumerDisputed;
	}

	public void setConsumerDisputed(String consumerDisputed) {
		this.consumerDisputed = consumerDisputed;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	
	
}

