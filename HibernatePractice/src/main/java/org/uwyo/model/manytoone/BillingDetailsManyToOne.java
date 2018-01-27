package org.uwyo.model.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class BillingDetailsManyToOne {

	@Id
	@Column(name="ACCOUNT_NUMBER",length=15)
	private String accNumber;
	
	
	@Column(name="BANKNAME",nullable=false,length=50)
	private String bankName;

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
}
