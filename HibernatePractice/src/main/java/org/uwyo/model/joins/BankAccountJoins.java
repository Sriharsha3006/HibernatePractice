package org.uwyo.model.joins;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BANK_ACCOUNT_JOIN")
public class BankAccountJoins extends BillingDetailsJoins{

	@Column(name="ACCOUNT_NUMBER",nullable = false)
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
