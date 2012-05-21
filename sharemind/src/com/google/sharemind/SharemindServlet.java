package com.google.sharemind;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.servlet.http.*;

import com.google.sharemind.entity.Article;

@SuppressWarnings("serial")
public class SharemindServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		Article article = new Article();
		article.setTitle("test");
		article.setContent("---------");
//		PersistenceManager manager = PersistenceManagerFactory
	}
}
