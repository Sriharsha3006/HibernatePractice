package org.uwyo.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.uwyo.model.Users;

@Repository
@Transactional
public class UsersDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public int saveUser(Users user){
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
