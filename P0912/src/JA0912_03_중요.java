import java.util.Scanner;

public class JA0912_03_중요 {

	public static void main(String[] args) {
		// 3명의 성적을 입력 출력받으시오 StuScore2
		Scanner scan = new Scanner(System.in);

		int stuNo = 0;
		String name = "";

		int[] score = new int[3];
		int kor = 0, eng = 0, math = 0;
		String[] subject = { "국어", "영어", "수학" };

		StuScore2[] s = new StuScore2[3];

		for (int i = 0; i < 3; i++) {
			stuNo = i + 1;
			System.out.println("이름을 입력하세요.");
			name = scan.next();

			System.out.println("국어점수를 입력하세요.");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			math = scan.nextInt();
			s[i] = new StuScore2(stuNo, name, kor, eng, math);

		}
		// 위에 방식아니면 아래 방식으로 할 수 있음
//		for (int j = 0; j < 3; j++) {
//			System.out.println(subject[j] + "점수를 입력하세요.");
//			score[j] = scan.nextInt();
//			s[j] = new StuScore2(stuNo, name, score[0], score[1], score[2]);
//
//		} // for
		for (int i = 0; i < s.length; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n,"
					+stuNo,name,kor,eng,math);
		}
		
		

		for (int i = 0; i < s.length; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", s[i].stuNo, s[i].name, s[i].kor, s[i].eng, s[i].math,
					s[i].total, s[i].avg);
		} // for

	}// main

}// class

	
