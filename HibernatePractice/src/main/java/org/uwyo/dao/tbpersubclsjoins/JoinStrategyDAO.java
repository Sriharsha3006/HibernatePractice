package org.uwyo.dao.tbpersubclsjoins;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.uwyo.model.joins.BillingDetailsJoins;

@Repository
@Transactional
public class JoinStrategyDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public int saveCreditorBank(BillingDetailsJoins bdJoin){
		Session session = sessionFactory.getCurrentSession();
		if(bdJoin!=null){
			session.save(bdJoin);
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public void getDetails(){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from BillingDetailsJoins");
		System.out.println(query.list().get(0));
	}
	
	public void deleteUser(Long ssn){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from BillingDetailsJoins bdj where bdj.ssn=:ssn");
		query.setParameter("ssn", ssn);
		BillingDetailsJoins bdj = (BillingDetailsJoins) query.list().get(0);
		session.delete(bdj);
	}

}
