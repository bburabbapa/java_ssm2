package p0914;

import java.util.ArrayList;
import java.util.Scanner;

public class JA0914_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id = "";
		String pw = "";

		ArrayList list = new ArrayList();
		Member m = new Member("aaa", "1111", "손승민", "서울", "010-9903-3947");
		list.add(m); // member객체는 object 객체로 자동 형변환됨
		Member m2 = new Member("bbb", "2222", "손흥민", "부산", "010-9403-3947");
		list.add(m2);
		Member m3 = new Member("ccc", "3333", "손형민", "대구", "010-9403-3947");
		list.add(m3);
		Member m4 = new Member("ddd", "4444", "손현민", "인천", "010-9603-3947");
		list.add(m4);
		Member m5 = new Member("eee", "5555", "손영민", "경기", "010-9703-3947");
		list.add(m5);

		System.out.println("아이디를 입력하세요.");
		id = scan.next();
		System.out.println("패스워드를 입려하세요.");
		pw = scan.next();

		Member tempM = (Member) list.get(0); // member로 형변환 시켜줘야함
		String tempId = tempM.getId();
		String tempPw = tempM.getPw();
		if (id.equals(tempId)) {
			if (pw.equals(tempPw)) {
				System.out.println("로그인이 되었습니다.");
			}

		}

	}// main

}// class
