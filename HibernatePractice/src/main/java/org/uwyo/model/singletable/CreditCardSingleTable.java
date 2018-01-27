package org.uwyo.model.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CreditCard")
public class CreditCardSingleTable extends BillingDetailsSingleTable{
	
	
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
