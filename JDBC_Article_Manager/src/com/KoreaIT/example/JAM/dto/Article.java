package com.KoreaIT.example.JAM.dto;

import java.time.LocalDateTime;
import java.util.Map;

public class Article {
	public int id;
	public int memberId;
	public int viewCount;
	public LocalDateTime regDate;
	public LocalDateTime updateDate;
	public String title;
	public String body;
	public String name;

	public Article(Map<String, Object> articleMap) {
		this.id = (int) articleMap.get("id");
		this.memberId = (int) articleMap.get("memberId");
		this.viewCount = (int) articleMap.get("viewCount");
		this.regDate = (LocalDateTime) articleMap.get("regDate");
		this.updateDate = (LocalDateTime) articleMap.get("updateDate");
		this.title = (String) articleMap.get("title");
		this.name = (String) articleMap.get("name");
		this.body = (String) articleMap.get("body"); //get column명 날려주는 쿼리 이름을 따라간다. as로 수정된 컬럼명
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", memberId=" + memberId + ", viewCount=" + viewCount + ", regDate=" + regDate
				+ ", updateDate=" + updateDate + ", title=" + title + ", body=" + body + ", name=" + name + "]";
	}
	
}