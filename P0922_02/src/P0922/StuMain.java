package P0922;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		StuAction s = new StuAction();
		int choice = 0;

		loop: while (true) {
			System.out.println("=======================================");
			System.out.println("학생성적처리프로그램");
			System.out.println("=======================================");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적삭제");
			System.out.println("5. 이름순 정렬");
			System.out.println("6. 성적높은순 정렬");
			System.out.println("7. 성적낮은순 정렬");
			System.out.println("8. 파일가져오기");
			System.out.println("9. 파일저장");
			System.out.println("10. 등수처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("=======================================");
			choice = scan.nextInt();
			System.out.println();

			switch (choice) {
			case 1:// 학생성적입력
				s.stuInput();
				break;

			case 2:// 학생성적출력
				s.stuOutput();
				break;

			case 3:// 학생성적수정
				s.stuUpdate();
				break;
			case 4:// 학생성적삭제
				s.stuDelete();
				break;
			case 5: // 이름순정렬
				s.stuNameSort();
				break;
			case 6:// 성적높은순정렬
				s.stuTotalHighSort();
				break;
			case 7:// 성적낮은순정렬
				s.stuTotalLowSort();
				break;
			case 8:// 파일가져오기
				s.stuFOpen();
				break;
			case 9:// 파일저장
				s.stuFSave();
				break;
			case 10:// 등수처리
				s.stuRank();
				break;
			case 0:// 프로그램종료
				System.out.println("프로그램종료");
				System.out.println();
				break loop;

			}// switch

		} // while

	}// main

}// class
