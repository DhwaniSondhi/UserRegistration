package org.practice.UserRegistration;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String addressline1;
	private String city;
	private String province;
	private String country;
	private String postalCode;

	public Address() {
		super();
	}

	public Address(String addressline1, String city, String province, String country, String postalCode) {
		super();
		this.addressline1 = addressline1;
		this.city = city;
		this.province = province;
		this.country = country;
		this.postalCode = postalCode;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Address [addressline1=" + addressline1 + ", city=" + city + ", province=" + province + ", country="
				+ country + ", postalCode=" + postalCode + "]";
	}

	public static class AddressBuilder {

		private String addressline1;
		private String city;
		private String province;
		private String country;
		private String postalCode;

		public AddressBuilder setAddressline1(String addressline1) {
			this.addressline1 = addressline1;
			return this;
		}

		public AddressBuilder setCity(String city) {
			this.city = city;
			return this;
		}

		public AddressBuilder setProvince(String province) {
			this.province = province;
			return this;
		}

		public AddressBuilder setCountry(String country) {
			this.country = country;
			return this;
		}

		public AddressBuilder setPostalCode(String postalCode) {
			this.postalCode = postalCode;
			return this;
		}

		public Address build() {
			return new Address(addressline1, city, province, country, postalCode);
		}
	}
}
