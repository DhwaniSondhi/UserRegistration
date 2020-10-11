package org.practice.UserRegistration;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

	private String fName;
	private String lName;
	private Date dob;
	@Autowired
	private Address address;

	public User() {
		super();
	}

	public User(String fName, String lName, Date dob) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String description() {
		return "User \n[fName=" + this.getfName() + ", \nlName=" + this.getlName() + ", \ndob=" + this.getDob()
				+ ", \naddress=" + this.getAddress() + "]";
	}

	public static class UserBuilder {

		private String fName;
		private String lName;
		private Date dob;

		public UserBuilder setfName(String fName) {
			this.fName = fName;
			return this;
		}

		public UserBuilder setlName(String lName) {
			this.lName = lName;
			return this;
		}

		public UserBuilder setDob(Date dob) {
			this.dob = dob;
			return this;
		}

		public User build() {
			return new User(fName, lName, dob);
		}
	}

}
