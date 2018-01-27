package org.uwyo.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.uwyo.model.embeddable.Address;

/*
 * Here you have practiced
 *  @Entity, 
 *  @Table, 
 *  @Embeddable using Address Class
 *  @AttributeOverrides and @AttributeOverride
 *  placing @Id on fields and getters (Imp: If you are placing @Id on getter and @AttributeOverrides on billingAddress Field, 
 *  										Hibernate has thrown an error i.e because All other columns are accessed through
 *  										getters but the billingAddress is accessed through field, there is a mismatch.
 *  										To solve this we have to either place @AttibuteOverrides on billingAddress getter 
 *  										method or place @AttibuteOverrides on the billingAddress field and also provide
 *  										@Access(AccessType.FIELD) billingAddress field AND IT CAN ALSO BE DONE VICE VERSA)
 *  Imp Points:
 *  Here in Address Class you put @Column(nullable=false), this means you are providing the DB USERS Table column information
 *  i.e. street, city, zipcode can't be nullable but BILLING_STREEt,etc can be nullable because you are overriding them
 *  
 *  You did not practice @GeneratedValue() because you did not create any sequence in DB. So it means that you have to create
 *  a sequence in DB before using it. There are few strtegies ave a look at them
 */
@Entity
@Table(name="USERS")
public class Users implements Serializable{
	

	private static final long serialVersionUID = 8355648071520818048L;

	@Id
	@Column(name="PID")
	private int pId;
	
	@Column(name="FIRSTNAME", nullable= false)
	private String firstName;
	
	@Column(name="LASTNAME", nullable= false)
	private String lastName;
	
	private Address homeAddress;
	
	@AttributeOverrides({
		@AttributeOverride(name="street", column = @Column(name="BILLING_STREET")),
		@AttributeOverride(name="city", column = @Column(name="BILLING_CITY")),
		@AttributeOverride(name="zipcode", column = @Column(name="BILLING_ZIPCODE"))
	})
	@Access(AccessType.FIELD)
	private Address billingAddress;

	
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	
	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

}
