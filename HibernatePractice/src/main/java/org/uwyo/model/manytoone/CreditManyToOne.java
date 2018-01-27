package org.uwyo.model.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CREDIT_CARD_MANYTOONE")
public class CreditManyToOne extends BillingDetailsManyToOne{
	
	@Column(name="CARD_NUMBER",nullable = false, length=15,unique=true)
	protected String cardNumber;
	
	@Column(name="CVV",nullable = false, length=3)
	protected int cvv;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
}
