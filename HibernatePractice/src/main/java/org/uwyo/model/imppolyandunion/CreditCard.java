package org.uwyo.model.imppolyandunion;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/*
 *I have commented out @AttributeOverride because it doesnt work with Table Per class with Union
 * To work it out I have changed CC_OWNER in DB Table to OWNER 
 */

@Entity
@Table(name = "CREDIT_TB_PER_CLASS_IMP_POLY")
/*@AttributeOverride(
		name="owner",
		column = @Column(name="CC_OWNER", nullable = false)
		)*/
public class CreditCard extends BillingDetails{
	
	
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
