package org.uwyo.model.imppolyandunion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

/*Here @MappedSuperclass is actually used for Table Per Class with Implicit Polymorphism Pls refer notes for this implementation
 * 
 * @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) is for Table Per Class with Union
 * */
@Entity
//@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BillingDetails {
	

	@Id
	@Column(name="SSN",nullable = false, length=10)
	protected Long ssn;
	
	@Column(nullable = false)
	protected String  owner;
	
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
