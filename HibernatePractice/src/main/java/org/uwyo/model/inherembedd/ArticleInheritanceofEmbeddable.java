package org.uwyo.model.inherembedd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ARTICLES")
public class ArticleInheritanceofEmbeddable {
	
	@Id
	@Column(name="ARTICLE_ID")
	private int articleId;
	
	@Column(name="ARTICLE_NAME")
	private String articleName;
	
	private Dimensions dimensions;
	
	private Weight weight;

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}

	public Weight getWeight() {
		return weight;
	}

	public void setWeight(Weight weight) {
		this.weight = weight;
	}

}
