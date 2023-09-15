import java.util.Scanner;

public class JA0915_02_학생성적 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int stuCount = 1;
		String[] title = { "번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

		// 객체 선언
		StuAction stuAction = new StuAction();

		while (true) {
			// 메인화면 출력부분
			int choice = stuAction.mainPrint();

			switch (choice) {
			case 1:// 1. 학생성적입력메소드
				stuCount = stuAction.stuInput(stuCount);
				break;

			case 2:// 2. 학생성적출력메소드
				stuAction.stuOutput();
				break;
			case 3:
				
				
				break;
				
			}// switch

		} // while

	}// main
}// class
