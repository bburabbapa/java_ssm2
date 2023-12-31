package p0915_test;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	Scanner scan = new Scanner(System.in);
	ArrayList<StuScore> list = new ArrayList();
	String[] title = { "번호", "이름", "국어", "영어", "수학", "합계", "평균" };

	int mainPrint() {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("============================");
		System.out.println("1. 학생입력");
		System.out.println("2. 학생출력");
		System.out.println("3. 학생수정");
		System.out.println("4. 학생삭제");
		System.out.println("5. 학생검색");
		System.out.println("6. 등수처리");
		System.out.println("0. 프로그램종료");
		System.out.println("=============================");
		System.out.println("원하는 번호를 입력하세요");
		int choice = scan.nextInt();
		return choice;

	}// mainPrint

	int stuInput(int stuCount) {
		while (true) {
			System.out.println("학생성적입력");
			System.out.println("%d 이름입력(0.이전페이지이동)");
			String name = scan.next();

			if (name.equals("0")) {
				System.out.println(">>이전페이지이동");
				break;
			} // if
			System.out.println("국어점수입력");
			int kor = scan.nextInt();
			System.out.println("영어점수입력");
			int eng = scan.nextInt();
			System.out.println("수학점수입력");
			int math = scan.nextInt();
			list.add(new StuScore(name, kor, eng, math));
			System.out.printf("%d 번째 학생성적이 처리됨 \n", stuCount);
			stuCount++;

		} // while
		return stuCount;
	}// stuInput

	void stuOutput() {
		System.out.println();
		System.out.println("==============================================================");
		System.out.println("[ 학생성적 출력 ]");
		for (int i = 0; i < title.length; i++) {
			System.out.printf("%s\t", title[i]);
		} // for
		System.out.println();
		System.out.println("==============================================================");
		for (int i = 0; i < list.size(); i++) {
			StuScore s = (StuScore) list.get(i);// 형변환
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", s.getStuNo(), s.getName(), s.getKor(), s.getEng(),
					s.getMath(), s.getTotal(), s.getAvg());

		}
	}// stuOutput

}// class
