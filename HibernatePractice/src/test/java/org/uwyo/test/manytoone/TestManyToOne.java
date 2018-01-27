package org.uwyo.test.manytoone;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.uwyo.dao.manytoone.ManyToOneDAO;
import org.uwyo.model.manytoone.CreditManyToOne;
import org.uwyo.model.manytoone.UsersManyToOne;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:uwyo-test.xml"})
public class TestManyToOne {
	
	@Autowired
	ManyToOneDAO mtoDAO;

	@Test
	public void testSaveUserWithBankDetails() {
		CreditManyToOne ccDetails = new CreditManyToOne();
		ccDetails.setAccNumber("12835679157822");
		ccDetails.setBankName("WellsFargo");
		ccDetails.setCardNumber("122943215676746");
		ccDetails.setCvv(129);
		
		UsersManyToOne user = new UsersManyToOne();
		user.setSsn((long)1399457887);
		user.setFirstName("Shashank");
		user.setLastName("Ram");
		user.setBdManyToOne(ccDetails);
		
		int no = mtoDAO.saveUserWithBankDetails(user);
		assertEquals(no, 1);

	}
	
	@Test
	public void testSaveJustUser(){
		UsersManyToOne user = new UsersManyToOne();
		user.setSsn((long)1239567497);
		user.setFirstName("Pranay");
		user.setLastName("Kommera");
		int no = mtoDAO.saveJustUser(user);
		assertEquals(no, 1);
	}

}
