package org.uwyo.model.joins;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="BILLING_DETAILS_JOIN")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class BillingDetailsJoins {
	
	@Id
	@Column(name="SSN",nullable = false, length=10)
	protected Long ssn;
	
	@Column(nullable = false)
	protected String  owner;
	
	@Transient
	protected String ssnOwner;
	
	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}
	
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}


}
