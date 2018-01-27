package org.uwyo.model.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="USERS_MANYTOONE")
public class UsersManyToOne {
	
	@Id
	@Column(name="SSN")
	private Long ssn;
	
	@Column(name="FIRSTNAME", nullable=false, length=50)
	private String firstName;
	
	@Column(name="LASTNAME", nullable=false, length=50)
	private String lastName;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private BillingDetailsManyToOne defaultBilling;

	public BillingDetailsManyToOne getBdManyToOne() {
		return defaultBilling;
	}

	public void setBdManyToOne(BillingDetailsManyToOne defaultBilling) {
		this.defaultBilling = defaultBilling;
	}

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
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
	
}
