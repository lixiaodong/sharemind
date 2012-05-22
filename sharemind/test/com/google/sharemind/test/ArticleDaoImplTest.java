package com.google.sharemind.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.sharemind.dao.ArticleDaoImpl;
import com.google.sharemind.entity.Article;

public class ArticleDaoImplTest {
	ArticleDaoImpl dao = new ArticleDaoImpl();

	@Test
	public void testSave() {
		Article article = new Article();
		article.setTitle("test");
		article.setContent("test");
		dao.save(article);
	}
	
	@Test
	public void testGetArticle() {
		
	}
}
