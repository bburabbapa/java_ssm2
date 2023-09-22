import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		StuAction s = new StuAction(); // 객체선언
		ArrayList<StuScore> list = new ArrayList<StuScore>();
		int choice = 0;
		// 시작시 파일 가져오기
		s.stuFOpen();
		s.stuOutput();

		System.out.println("=====================================");
		System.out.println("학생성적처리프로그램");
		System.out.println("=====================================");
		System.out.println("1.학생성적입력");
		System.out.println("2.학생성적출력");
		System.out.println("3.학생성적수정");
		System.out.println("4.학생성적삭제");
		System.out.println("5.이름순정렬");
		System.out.println("6.성적높은순정렬");
		System.out.println("7.성적낮은순정렬");
		System.out.println("8.파일가져오기");
		System.out.println("9.파일저장");
		System.out.println("10.등수처리");
		System.out.println("0.프로그램종료");
		System.out.println("=====================================");
//		String strChoice = JOptionPane.showInputDialog("원하는 번호를 입력하세요.");
//		choice = Integer.parseInt(strChoice);
		choice = scan.nextInt();
		System.out.println();

		loop: while (true) { // 무한반복
			switch (choice) {
			case 1:
				s.stuInput();// 학생성적입력
				break;
			case 2:
				s.stuOutput();// 학생성적출력
				break;
			case 3:
				while (true) {
					System.out.println("학생성적수정");
					System.out.println("수정할 학생이름을 입력하세요.(0.이전페이지이동)");
					String Input = scan.next();
					if (inputName.equals("0")) {
						System.out.println("이전페이지로이동합니다.");
						System.out.println();
						break;
					}

					System.out.println("입력된 이름으로 검색 중.....");
					// list 안에 이름이 모두 있음
					int i = 0; // 검색되었을때 위치점을 지정하는 변수
					int count = 0;// 찾는 학생이 있는지 확인하는 변수
					for (int i = 0; i < s.list.size(); i++) {
						StuScore s = s.list.get(i);
						if (inputName.equals(st.getName()))
							System.out.println("입력된 이름으로 학생이 검색되었습니다.");
						count = 1;
						break;
					} // if
				} // for
				if (count == 0) {// 검색된 이름이 없으면 실행
					System.out.println("학생이 검색되지 않았습니다. 다시 입력하세요.");
					continue;
				} // switch

				System.out.println("=====================================");
				System.out.println("1.국어점수");
				System.out.println("2.영어점수");
				System.out.println("3.수학점수");
				System.out.println("=====================================");
				System.out.println("원하는번호를 입력하세요.");
				choice = scan.nextInt();
				switch (choice) {
				case 1:
					System.out.println("국어점수수정");
					System.out.println("===========================================");
					System.out.println("현재국어점수: " + s.list.get(i).getkor());
					System.out.println("변경할 국어점수를 입력하세요.");
					int kor = scan.nextInt();
					s.list.get(i).setkor(scan.nextInt());
					s.list.get(i).settotal(s)
					System.out.println("==================================");
					System.out.println( s.list.get(i).getkor()+"국어점수가 수정되었습니다.");
					System.out.println();
					break;
				case 2:
					System.out.println("영어점수수정");
					System.out.println("===========================================");
					System.out.println("현재영어점수: " + s.list.get(i).geteng());
					System.out.println("변경할 영어점수를 입력하세요.");
					int eng = scan.nextInt();
					s.list.get(i).seteng(scan.nextInt());
					System.out.println("==================================");
					System.out.println( s.list.get(i).geteng()+"영어점수가 수정되었습니다.");
					System.out.println();
					break;
				case 3:
					System.out.println("수학점수수정");
					System.out.println("===========================================");
					System.out.println("현재수학점수: " + s.list.get(i).getmath());
					System.out.println("변경할 수학점수를 입력하세요.");
					int math = scan.nextInt();
					s.list.get(i).setmath(scan.nextInt());
					System.out.println("==================================");
					System.out.println( s.list.get(i).getmath()+"수학점수가 수정되었습니다.");
					System.out.println();
					break;
				}// switch

			case 5:
				// s.stuNameSort(); //학생이름순정렬
				s.stuInput();
				break;
			case 6:// 학생성적정렬
					// s.stuTotalHighSort();
				s.stuFOpen();
				break;
			case 7:// 학생성적정렬
					// s.stuTotalLowSort();
				s.stuInput();
				break;
			case 8: // 파일가져오기
				s.stuFOpen();
				break;
			case 9:// 파일저장
				s.stuFOpen();
				break;
			case 0:
				System.out.println("프로그램종료");
				System.out.println();
				break loop;

			}// switch

		} // while

	}// main

}// class
