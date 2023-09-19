import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();
		int stuCount = 1;
		String[] title = { "번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

		while (true) {
			int choice = stuAction.mainPrint();

			switch (choice) {

			case 1: // 학생성적입력
				stuCount = stuAction.stuInput(stuCount);

			case 2:// 학생성적출력
				stuAction.stuOutput();
				
			case 3://학생성적수정
				System.out.println("학생성적수정");
				System.out.println("수정할학생이름입력(0.이전페이지이동)");
				String  name = scan.next();
				
				if(name.equals("0")) {
					System.out.println("이전페이지이동");
					break;
				}

			case 0:

				System.out.println();
				System.out.println("[ 프로그램 종료 ]");
				System.out.printf("프로그램을 종료합니다.\n");
				break;

				
				
				
			}// switch

		} // while

	}// main

}// class
