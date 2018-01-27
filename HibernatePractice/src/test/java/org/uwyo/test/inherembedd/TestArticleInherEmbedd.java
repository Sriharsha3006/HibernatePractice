package org.uwyo.test.inherembedd;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.uwyo.dao.inherembedd.ArticleDAO;
import org.uwyo.model.inherembedd.ArticleInheritanceofEmbeddable;
import org.uwyo.model.inherembedd.Dimensions;
import org.uwyo.model.inherembedd.Weight;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:uwyo-test.xml"})
public class TestArticleInherEmbedd {
	
	@Autowired
	ArticleDAO articleDAO;

	@Test
	public void testSaveArticle() {
		Dimensions dimensions = new Dimensions();
		dimensions.setName("inches");
		dimensions.setSymbol("''");
		dimensions.setDepth(32.2);
		dimensions.setHeight(42.4);
		dimensions.setWidth(31.5);
		Weight weight = new Weight();
		weight.setName("kilograms");
		weight.setSymbol("kgs");
		weight.setWeight(155.5);
		ArticleInheritanceofEmbeddable article =  new ArticleInheritanceofEmbeddable();
		article.setArticleId(10);
		article.setArticleName("Fridge");
		article.setDimensions(dimensions);
		article.setWeight(weight);
		int no =articleDAO.saveArticle(article);
		assertEquals(no, 1);
	}

}
