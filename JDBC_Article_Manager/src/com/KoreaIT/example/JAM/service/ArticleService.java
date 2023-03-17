package com.KoreaIT.example.JAM.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.KoreaIT.example.JAM.dto.Article;
import com.KoreaIT.example.JAM.dao.ArticleDao;

public class ArticleService {

	private ArticleDao articleDao;
	
	public ArticleService(Connection conn) {
		this.articleDao = new ArticleDao(conn);
	}

	public int doWrite(String title, String body, int loginid) {
		return articleDao.doWrite(title, body, loginid);
	}
	
	public List<Article> getArticles(String searchKeyword){
		
		List<Map<String, Object>> articleListMap = articleDao.getArticles(searchKeyword);
		
		List<Article> articles = new ArrayList<>();
		
		for (Map<String, Object> articleMap : articleListMap) {
			articles.add(new Article(articleMap));
		}
		
		return articles;
	}

	public Article getArticle(int id) {
		
		Map<String, Object> articleMap = articleDao.getArticle(id);
		
//서비스가 Map을 받아서 article로 조립해준다. 검증
		if (articleMap.isEmpty()) {
			return null;
		}
		
		return new Article(articleMap);
	}

	public int getArticleCount(int id) {
		return articleDao.getArticleCount(id);
	}

	public void doModify(String title, String body, int id) {
		articleDao.doModify(title, body, id);
	}

	public void doDelete(int id) {
		articleDao.doDelete(id);
	}

	public int increaseViewCount(int id) {
		return articleDao.doincreaseViewCount(id);
		
	}
}