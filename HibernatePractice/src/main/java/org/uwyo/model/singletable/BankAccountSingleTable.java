package org.uwyo.model.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="BankAccount")
public class BankAccountSingleTable extends BillingDetailsSingleTable {
	
	@Column(name="ACC_NUMBER",nullable = false)
	protected String accNumber;
	
	@Column(name="SWIFT",nullable = false)
	protected int swift;

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public int getSwift() {
		return swift;
	}

	public void setSwift(int swift) {
		this.swift = swift;
	}

}
