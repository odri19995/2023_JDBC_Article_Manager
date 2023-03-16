package com.KoreaIT.example.JAM.session;

import com.KoreaIT.example.JAM.dto.Member;
//로그인 결과 저장용 세션
public class Session {
	public static int loginedMemberId;
	public static Member loginedMember;
	
	static {
		loginedMemberId = -1;
	}
	
	public static void login(Member member) {
		loginedMemberId = member.id;
		loginedMember = member;
	}
	
	public static void logout() {
		loginedMemberId = -1;
		loginedMember = null;
	}
	public static boolean isLogined() {
		return loginedMemberId != -1;
	}


}
