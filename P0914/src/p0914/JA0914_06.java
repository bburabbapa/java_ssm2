package p0914;

import java.util.ArrayList;
import java.util.Scanner;

public class JA0914_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id = "";
		String pw = "";

		// 회원불러오기
		MemberAll m = new MemberAll();
		ArrayList list = m.memberRead(); // 회원5명 생성됨


		// 아이디와 패스워드를 입력해서 회원을 검색
		while (true) {
			System.out.println("아이디를 입력하세요.");
			id = scan.next();ㄴ
			System.out.println("패스워드를 입력하세요.");
			pw = scan.next();
			for (int i = 0; i < list.size(); i++) {

			}//if

		} // while

		Buyer b1 = new Buyer();
		int choice = 0;

		while (true) {

			System.out.println("[ 가전제품 쇼핑몰 ]");
			System.out.println("1.TV");
			System.out.println("2.컴퓨터");
			System.out.println("3.오디오");
			System.out.println("4.세탁기");
			System.out.println("==========================");
			System.out.println("1.구매를 원하는 번호를 입력하세요");
			choice = scan.nextInt();

		} // while
	}// main

}// class
