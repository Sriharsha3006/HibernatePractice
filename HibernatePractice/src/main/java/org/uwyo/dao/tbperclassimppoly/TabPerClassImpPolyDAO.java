package org.uwyo.dao.tbperclassimppoly;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.uwyo.model.imppolyandunion.BillingDetails;
import org.uwyo.model.imppolyandunion.CreditCard;

@Repository
@Transactional
public class TabPerClassImpPolyDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public int saveCreditOrBank(BillingDetails billingDetails){
		Session session = sessionFactory.getCurrentSession();
		if(billingDetails!=null){
			session.save(billingDetails);
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public void getDetails(){
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from CreditCard");
		System.out.println(query.list().get(0));
	}
}
