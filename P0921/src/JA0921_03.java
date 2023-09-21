import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JA0921_03 {

	public static void main(String[] args) throws IOException {
		// 이름, 국어, 영어, 수학 점수를 StuScore 객체에 담아 ArrayList에 데이터를 저장하세요

		Scanner scan = new Scanner(System.in);
		ArrayList<StuScore> list = new ArrayList();
		

		while (true) {
			System.out.println("학번을 입력하세요.(0.프로그램종료)");
			int stuNum = scan.nextInt();
			if (stuNum == 0) {
				System.out.println("프로그램종료");
				break;

			}//if
			System.out.println("이름을 입력하세요");
			String name = scan.next();
			System.out.println("국어점수를 입력하세요");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			int math = scan.nextInt();
			int total = kor + eng + math;
			double avg = total / 3.0;
			int rank = 0;

			// 객체를 생성해서 list에 담기( 컬렉션프레임워크)
			
			list.add(new StuScore(stuNum,name,kor,eng,math));
//			StuScore []  s = new StuScore [10];
			
			
			//입력한 데이터를 문자열로 변경
			String data = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\r\n",stuNum,name,kor,eng,math,total,avg,rank);

//		System.out.println(data);
//
//		String[] arrData = data.split(data); //배열 분리

			
			// 파일에 저장
			FileWriter fw2 = new FileWriter("c:/aaa/stu2.txt", true);// 이어쓰기 false:덮어쓰기
			BufferedWriter bw2 = new BufferedWriter(fw2);
			bw2.write(data);
			bw2.close();

			System.out.println("입력한 데이터를 파일에 저장했습니다.");
		} // while

	}// main

}// class