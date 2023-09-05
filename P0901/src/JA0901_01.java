import java.util.Scanner;

public class JA0901_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// int 선언
		int number = 0;// 정수형 타입을 생성해서 0의 값을 입력
		String name = "";// 문자열 타입을 생성해서 빈 공백을 입력
		int kor = 0;// 국어점수를 입력할 수 있는 변수 선언
		int eng = 0;
		int math = 0;
		int total = 0;// 합계점수를 입력할 수 있는 변수 선언
		double avg = 0.0;// 실수형 타입을 생성해서 0의 값을 입력

		// 키보드를 통한 값 입력★
		System.err.println("학번을 입력하세요.");
		number = scan.nextInt();
		System.out.println("이름을 입력하세요.");
		name = scan.next();
		System.out.println("국어점수를 입력하세요.");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		math = scan.nextInt();
		System.out.println("총점을 입력하세요.");
		total = scan.nextInt();
		System.out.println("평균을 입력하세요.");
		avg = scan.nextDouble();

		// 데이터 직접입력☆
		number = 1;
		name = "손승민";
		kor = 100;
		eng = 100;
		math = 100;
		total = kor + eng + math;
		avg = total / 3.0;// 소수점이 사라지기 때문에 d를 붙여줌 또는 (double)3; / 3d;

		System.out.println("[학생성적프로그램]");
		System.out.println("--------------");
		System.out.printf("번호: %d \t",number);
		System.out.printf("이름: %s \t",name);
		System.out.printf("국어: %d \t",kor);
		System.out.printf("영어: %d \t",eng);
		System.out.printf("수학: %d \t",math);
		System.out.printf("합계: %d \t",total);
		System.out.printf("평균: %.2f \n",avg);// 실수형 %f.2f\n 정수형%d 문자%c 문자형%s 16진수%x
		
		

	}

}
