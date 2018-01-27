package org.uwyo.model.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BANK_MANYTOONE")
public class BankManyToOne extends BillingDetailsManyToOne{
	
	@Column(name="BRANCH",nullable=false)
	protected String branchName;
	
	@Column(name="SWIFT",nullable = false)
	protected int swift;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getSwift() {
		return swift;
	}

	public void setSwift(int swift) {
		this.swift = swift;
	}

}
