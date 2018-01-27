package org.uwyo.dao.inherembedd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.uwyo.model.inherembedd.ArticleInheritanceofEmbeddable;

@Repository
@Transactional
public class ArticleDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public int saveArticle(ArticleInheritanceofEmbeddable article){
		
		Session session = sessionFactory.getCurrentSession();
		if(article!=null){
			session.save(article);
			return 1;
		}
		else
			return 0;
	}
}
