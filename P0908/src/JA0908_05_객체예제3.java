import java.util.Scanner;

public class JA0908_05_객체예제3 {

	public static void main(String[] args) {
		// 배열선언
		Scanner scan = new Scanner(System.in);

		StuScore[] s = new StuScore [2];

		// 입력부분
		for (int i = 0; i < 5; i++) {
			s[0] = new StuScore ();// 객체선언을 한번 더 해줘야함.

			s[i].stuNo = i + 1;// 자동입력
			System.out.print("이름입력: ");
			s[i].name = scan.next();
			System.out.print("국어점수: ");
			s[i].kor = scan.nextInt();
			System.out.print("영어점수: ");
			s[i].eng = scan.nextInt();
			System.out.print("수학점수: ");
			s[i].math = scan.nextInt();
			s[i].total();
			s[i].avg();

		} // for

		// 출력부분
		for (int i = 0; i < s.length; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", s[i].stuNo, s[i].name, s[i].kor, s[i].eng, s[i].math,
					s[i].total, s[i].avg);
			
			
			
			
			
			
			
		} // for

	}// main

}// class
