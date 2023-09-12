import java.util.Scanner;

public class JA0912_02_학생성적 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		StuScore s = new StuScore();
//		s.stuNo = 1;
//		s.name ="손승민";
//		s.kor = 100;
//		s.eng = 100;
//		s.math = 88;
//		s.total = s.kor+s.eng+s.math;
//		s.avg = s.total/3.0;
//		
//		
//		StuScore s2 = new StuScore(2,"손흥민",100,88,98);
//		System.out.println("합계: "+s2.total);
//		System.out.printf("평균: %.2f\n",s2.avg);

		int stuNo = 0;
		String name = "";
		int[] score = new int[3];
		int kor = 0, eng = 0, math = 0;
		String[] subject = { "국어", "영어", "수학" };

		// 배열선언
		StuScore[] s = new StuScore[3];
		// 객체선언
//		s[0]  = new StuScore();

		for (int i = 0; i < s.length; i++) {
			stuNo = i + 1;
			System.out.println("이름입력");
			name = scan.next();
		}
		for (int j = 0; j < score.length; j++) {
			System.out.println(subject[j] +"점수입력");
			score[j] = scan.nextInt();

		} // for
		s[1] = new StuScore(stuNo, name, score[0], score[1], score[2]);

//			System.out.println("국어점수입력");
//			kor = scan.nextInt();
//			System.out.println("영어점수입력");
//			eng = scan.nextInt();
//			System.out.println("수학점수입력");
//			math = scan.nextInt();
//			s[i] = new StuScore(stuNo, name, kor, eng, math);

		for (int i = 0; i < s.length; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t&.2f\n", s[i].stuNo, s[i].name, s[i].kor, s[i].eng, s[i].math,
					s[i].total, s[i].avg);
		} // for

	}// main

}// class
