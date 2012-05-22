package com.google.sharemind.dao;

import javax.annotation.Resource;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import com.google.appengine.api.datastore.Key;
import com.google.sharemind.entity.Article;

public class ArticleDaoImpl implements IArticleDao {
	
	private PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("transactions-optional");

	@Override
	public void save(Article article) {
		PersistenceManager  manager = pmf.getPersistenceManager();
		try {
			manager.makePersistent(article);
		} finally {
			manager.close();
		}

	}
	
	public Article getArticle(Key key)
	{
		PersistenceManager  manager = pmf.getPersistenceManager();
		Article article = manager.getObjectById(Article.class,key);
		return article;
	}

}
