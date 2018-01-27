package org.uwyo.model.embeddable;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	public Address(){
		
	}
	public Address(String street,String city,int zipcode){
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	
	@Column(nullable=false)
	private String street;
	
	@Column(nullable=false)
	private String city;
	
	@Column(nullable=false)
	private int zipcode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
}
