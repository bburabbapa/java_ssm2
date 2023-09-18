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
			
			case 1: //학생성적입력
				stuCount = stuAction.stuInput(stuCount);
				
			case 2://학생성적출력
				stuAction.stuOutput();

			}// switch

		} // while

	}// main

}// class
