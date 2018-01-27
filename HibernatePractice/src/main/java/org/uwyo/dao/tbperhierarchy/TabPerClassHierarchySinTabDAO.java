package org.uwyo.dao.tbperhierarchy;

import org.hibernate.Query;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.uwyo.model.singletable.BillingDetailsSingleTable;

@Repository
@Transactional
public class TabPerClassHierarchySinTabDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public int saveCreditorBank(BillingDetailsSingleTable bdSingleTable){
		Session session = sessionFactory.getCurrentSession();
		if(bdSingleTable!=null){
			session.save(bdSingleTable);
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public void getDetails(){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from CreditCardSingleTable");
		System.out.println(query.list().get(0));
	}
}
