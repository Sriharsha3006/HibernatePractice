package org.uwyo.dao.queries;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.uwyo.model.Users;

@Repository
@Transactional
public class HibernateQueries {
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	public void sqlQuery(){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from org.uwyo.model.Users");
		Iterator<Users> itr = query.iterate();
		while(itr.hasNext()){
			Users nextUser = itr.next();
			Users user = new Users();
			user.setHomeAddress(nextUser.getHomeAddress());
			System.out.println(user.getHomeAddress().getCity());
			
		}
	}
	
	public void criteriaQueries(){
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(Users.class);
		cr.add(Restrictions.isNull("billingAddress.street"));
		List<Users> users = cr.list();
		Users user = users.get(0);
		System.out.println(user.getFirstName());
	}
	
	public void joinClassQueries(){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("select bdj from BillingDetailsJoins bdj where type(bdj)=CreditCardJoins");
		query.list();
	}
	
	public void onlySQLQuery(){
		Session session = sessionFactory.getCurrentSession();
		Query sqlQuery = session.createQuery("from Users");
		System.out.println(sqlQuery.getQueryString());
		List<Users> objs = sqlQuery.list();
		for(Users obj:objs){
			String name = obj.getFirstName();
			System.out.println(name);
		}
	}
}
