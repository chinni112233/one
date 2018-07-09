package com.cg.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="faculty")

//@NamedQueries(@NamedQuery(name = "getAllDetails", query = "SELECT * FROM Faculty faculty"))
public class SchedulePlan {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="fid")
	private int fId;
	
	@Column(name="fname")
	@NotEmpty(message="Name should not be Empty ,please enter value")
	private String fName;
	
	@Column(name="fdate")
	private String date;
	
	@Column(name="fexpert")
	private String fExpert;
	
	@Column(name="fperiod")
	private String fPeriod;
	
	@Column(name="comments")
	private String comments;
	
	@Column(name="mailid")
	@NotEmpty @Email(message="Enter valid mail id")
	private String mail;
	@Override
	public String toString() {
		return "SchedulePlan [fId=" + fId + ", fName=" + fName + ", date="
				+ date + ", fExpert=" + fExpert + ", fPeriod=" + fPeriod
				+ ", comments=" + comments + ", mail=" + mail + "]";
	}
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getfExpert() {
		return fExpert;
	}
	public void setfExpert(String fExpert) {
		this.fExpert = fExpert;
	}
	public String getfPeriod() {
		return fPeriod;
	}
	public void setfPeriod(String fPeriod) {
		this.fPeriod = fPeriod;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public SchedulePlan() {
		// TODO Auto-generated constructor stub
	}

}
