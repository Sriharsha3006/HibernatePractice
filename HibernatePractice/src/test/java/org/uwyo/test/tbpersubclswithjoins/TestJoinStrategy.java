package org.uwyo.test.tbpersubclswithjoins;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.uwyo.dao.tbpersubclsjoins.JoinStrategyDAO;
import org.uwyo.model.joins.BankAccountJoins;
import org.uwyo.model.joins.CreditCardJoins;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:uwyo-test.xml"})
public class TestJoinStrategy {

	@Autowired
	JoinStrategyDAO joinDAO;
	@Test
	public void testCreditCardJoin() {
		CreditCardJoins ccDetails = new CreditCardJoins();
		ccDetails.setOwner("Pranay");
		ccDetails.setSsn((long) 858459018);
		ccDetails.setCardNumber("123443215678846");
		ccDetails.setCvv(125);
		
		int no = joinDAO.saveCreditorBank(ccDetails);
		
		assertEquals(no, 1);
	}
	
	@Test
	public void testBankAccountJoin() {
		BankAccountJoins bankAcc = new BankAccountJoins();
		bankAcc.setOwner("Mahesh");
		bankAcc.setSsn((long) 858459025);
		bankAcc.setAccNumber("123443215688878");
		bankAcc.setSwift(52535);
		int no = joinDAO.saveCreditorBank(bankAcc);
		assertEquals(no, 1);
	}
	
	@Test
	public void testGetDetails() {
		joinDAO.getDetails();	
	}
	
	@Test
	public void testDelete(){
		joinDAO.deleteUser((long) 858459018);
	}

}
