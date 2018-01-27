package org.uwyo.test.tbperclassimppoly;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.uwyo.dao.tbperclassimppoly.TabPerClassImpPolyDAO;
import org.uwyo.model.imppolyandunion.BankAccount;
import org.uwyo.model.imppolyandunion.CreditCard;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:uwyo-test.xml"})
public class TestTabPerClassImpPoly {
	
	@Autowired
	TabPerClassImpPolyDAO impPolyDAO;
	
	@Test
	public void testCredit() {
		CreditCard ccDetails = new CreditCard();
		ccDetails.setOwner("Pawan");
		ccDetails.setSsn((long) 857459018);
		ccDetails.setCardNumber("123243215678846");
		ccDetails.setCvv(125);
		
		int no = impPolyDAO.saveCreditOrBank(ccDetails);
		
		assertEquals(no, 1);
	}
	
	@Test
	public void testDebit() {
		BankAccount bankAcc = new BankAccount();
		bankAcc.setOwner("Kalyan");
		bankAcc.setSsn((long) 858459825);
		bankAcc.setAccNumber("123443275688878");
		bankAcc.setSwift(52535);
		
		int no = impPolyDAO.saveCreditOrBank(bankAcc);
		
		assertEquals(no, 1);
	}
	
	@Test
	public void testGetDetails() {
		impPolyDAO.getDetails();
		
	}

}
