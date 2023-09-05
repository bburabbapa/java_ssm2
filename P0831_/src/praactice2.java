import java.util.Scanner;

public class praactice2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;

		System.out.println("이름");
		name = scan.next();
		System.out.println("국어점수");
		kor = scan.nextInt();
		System.out.println("영어");
		eng = scan.nextInt();
		System.out.println("수학");
		math = scan.nextInt();

		int total = kor + eng + math;
		double avg = total / 3.0;
		// %f: 실수형 %d:정수형 %c:문자형

		System.out.printf("평균:%f\n", avg);
		System.out.printf("합계:%d\n", total);
		System.out.printf("국어:%d,영어:%d,수학:%d \n", kor, eng, math);

		int num = scan.nextInt();
		System.out.println("당신이 원하는 숫자를 입력하세요.");
		System.err.println("입력한 숫자: " + num);

	}

}
