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
			if (cmd.equals("article write")) {
				id++;
				System.out.print("제목 :  ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String body = sc.nextLine();
				Article article = new Article(id, title, body);
				articles.add(article);
				
				System.out.printf("%d 번 게시글이 생성되었습니다.\n", article.id);

			} else if (cmd.equals("article list")) {
				System.out.println("== 게시물 목록 ==");

				if (articles.size() == 0) {
					System.out.println("게시물이 없습니다");
					continue;
				}

				System.out.println("번호	|	제목");

				for (int i = 0 ; i < articles.size();i++){
					Article article = articles.get(i);
					System.out.printf("%d	|	%s\n", article.id, article.title);
				}
			}

			if (cmd.equals("exit")) {
				System.out.println("== 프로그램 종료 ==");
				break;
			}

		}
		sc.close();

	}
}
