import java.util.Scanner;

public class JA0831_11_성적입력출력 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// ctrl+space

		// 이름, 국어, 영어, 수학, 합계, 평균
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;

		// 입력부분
		System.out.println("이름을 입력하세요.");
		name = scan.next();// 넥스트

		System.out.println("국어점수를 입력하세요.");
		kor = scan.nextInt();// 넥스트인투

		System.out.println("영어점수를 입력하세요.");
		eng = scan.nextInt();// 넥스트인투

		System.out.println("수학점수를 입력하세요.");
		math = scan.nextInt();// 넥스트인투

		// 합계 평균은 하단에 위치
		int total = kor + eng + math;
		double avg = total / 3.0;

		// 출력부분
		System.out.printf("평균:%f\n", avg);// 실수형
		System.out.printf("합계:%d\n", total);// 정수형
		System.out.printf("국어:%d\n", kor);
		System.out.printf("영어:%d\n", eng);
		System.out.printf("수학:%d\n", math);
		System.out.printf("국어:%d, 영어:%d, 수학:%d\n", kor, eng, math);

		final int MAX = 100;// 상수 지정은 파이널 표시
		char ch = 'A';// char는 문자 하나만

		float f = 1.6f;
		int i = (int) f;

	}

}
