package org.uwyo.dao.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.uwyo.model.manytoone.CreditManyToOne;
import org.uwyo.model.manytoone.UsersManyToOne;

@Transactional
@Repository
public class ManyToOneDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public int saveUserWithBankDetails(UsersManyToOne user){
		Session session = sessionFactory.getCurrentSession();
		if(user!=null){
			CreditManyToOne ccDetails = (CreditManyToOne) user.getBdManyToOne();
			System.out.println(ccDetails.getAccNumber()+" "+ccDetails.getCardNumber());
			session.save(ccDetails);
			session.save(user);
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public int saveJustUser(UsersManyToOne user){
		Session session = sessionFactory.getCurrentSession();
		if(user!=null){
			session.save(user);
			return 1;
		}
		else{
			return 0;
		}
	}

}
