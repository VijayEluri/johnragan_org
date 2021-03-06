package hello;

import javax.persistence.*;

@Embeddable
public class Address {
	//@org.hibernate.annotations.Parent
	//User user;
	
	@Column(name = "ADDRESS_STREET", nullable = false, length = 255)
	private String street;
	@Column(name = "ADDRESS_ZIPCODE", nullable = false, length = 255)
	private String zipcode;
	@Column(name = "ADDRESS_CITY", nullable = false, length = 255)
	private String city;
	public Address() {}
	public Address(String street, String city, String zipcode) {
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}
	public String getStreet() { return street; }
	public void setStreet(String street) { this.street = street; }
	public String getZipcode() { return zipcode; }
	public void setZipcode(String zipcode) {
	this.zipcode = zipcode; }
	public String getCity() { return city; }
	public void setCity(String city) { this.city = city; }
}