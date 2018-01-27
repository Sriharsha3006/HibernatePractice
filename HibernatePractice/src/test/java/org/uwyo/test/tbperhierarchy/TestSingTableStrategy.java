package org.uwyo.test.tbperhierarchy;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.uwyo.dao.tbperhierarchy.TabPerClassHierarchySinTabDAO;
import org.uwyo.model.singletable.BankAccountSingleTable;
import org.uwyo.model.singletable.CreditCardSingleTable;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:uwyo-test.xml"})
public class TestSingTableStrategy {
	
	@Autowired
	TabPerClassHierarchySinTabDAO sinTabDAO;

	@Test
	public void testCreditSingleTable() {
		CreditCardSingleTable ccDetails = new CreditCardSingleTable();
		ccDetails.setOwner("Pranay");
		ccDetails.setSsn((long) 858459018);
		ccDetails.setCardNumber("123443215678846");
		ccDetails.setCvv(125);
		
		int no = sinTabDAO.saveCreditorBank(ccDetails);
		
		assertEquals(no, 1);
	}
	
	@Test
	public void testBankAccount() {
		BankAccountSingleTable bankAcc = new BankAccountSingleTable();
		bankAcc.setOwner("Sriharsa");
		bankAcc.setSsn((long) 858459085);
		bankAcc.setAccNumber("123443245688878");
		bankAcc.setSwift(52535);
		
		int no = sinTabDAO.saveCreditorBank(bankAcc);
		
		assertEquals(no, 1);
	}
	
	@Test
	public void testGetDetails() {
		sinTabDAO.getDetails();	
	}

}
