package org.uwyo.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.uwyo.bo.UsersBO;
import org.uwyo.model.Users;
import org.uwyo.model.embeddable.Address;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:uwyo-test.xml" })
public class TestUser {
	
	@Autowired
	UsersBO userBo;
	
	@Test
	public void test() {
		Users user = new Users();
		Address homeAddress = new Address("Landmark Apt", "Laramie", 82072);
		Address billingAddress = new Address("360 North", "Laramie", 82072);
		user.setpId(8);
		user.setFirstName("Mahesh");
		user.setLastName("Nalla");
		user.setHomeAddress(homeAddress);
		user.setBillingAddress(billingAddress);
		int no= userBo.saveUser(user);
		assertEquals(1, no);
	}
	
	@Test
	public void testImg(){
		userBo.noOfBytesOfImage();
	}

}
