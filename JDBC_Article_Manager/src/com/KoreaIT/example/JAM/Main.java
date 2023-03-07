package com.KoreaIT.example.JAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");

		Scanner sc = new Scanner(System.in);
		
		List<Article> articles = new ArrayList<>();

		int id = 0;
		while (true) {
			System.out.printf("명령어 ) ");
			String cmd = sc.nextLine().trim();
			if (cmd.equals("article list")) {
				id++;
				System.out.print("제목 :  ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String body = sc.nextLine();
				Article article = new Article(id,title, body);
				articles.add(article);
				
				
				
				System.out.printf("%d | %s\n",article.id, article.title);
			} else if (cmd.equals("exit")) {
				break;
			} else {
				System.out.println("존재하지 않는 명령어 입니다.");
			}

		}

		System.out.println("==프로그램 종료==");

		sc.close();
	}

}
