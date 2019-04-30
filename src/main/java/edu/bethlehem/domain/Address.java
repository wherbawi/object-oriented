package edu.bethlehem.domain;

public class Address {
	private String streetName;
	private String houseNo;
	private String city;

	public Address(String streetName, String houseNo, String city) {
		super();
		this.streetName = streetName;
		this.houseNo = houseNo;
		this.city = city;
	}

	public Address() {

	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", houseNo=" + houseNo + ", city=" + city + "]";
	}

}
