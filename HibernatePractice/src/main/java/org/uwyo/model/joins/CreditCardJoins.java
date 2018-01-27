package org.uwyo.model.joins;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CREDIT_CARD_JOIN")
public class CreditCardJoins extends BillingDetailsJoins{
	
	@Column(name="CARD_NUMBER",nullable = false)
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
