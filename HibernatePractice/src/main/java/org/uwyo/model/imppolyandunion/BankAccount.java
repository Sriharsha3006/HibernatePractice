package org.uwyo.model.imppolyandunion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BANK_TB_PER_CLASS_IMP_POLY")
public class BankAccount extends BillingDetails {
	
	
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
