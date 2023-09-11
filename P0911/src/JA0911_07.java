import java.util.Scanner;

public class JA0911_07 {

//	static Scanner scan = new Scanner (System.in);//객체선언 scan 인스턴스 변수// static이 없을 시에는 따르 스캐너스캔을 사용해야함
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학번입력: ");
		int stuNum = scan.nextInt();
		String name = nameInput();
		int kor = korInput();

		System.out.println("학번: " + stuNum);
		System.out.println("이름: " + name);
		System.out.println("국어점수: " + kor);

	}// main
		// static이 있으면 클래스메소드: 객체선언없이 클래스명.메소드명

	static String nameInput() {
		Scanner scan = new Scanner(System.in);// 상단의 static을 사용 시에는 따로 스캐너스캔을 쓸 필요가 없음
		String name = "";// 지역변수
		System.out.print("이름입력: ");
		name = scan.next();
		return name;

	}

	static int korInput() {
		Scanner scan = new Scanner(System.in);
		int kor = 0;
		System.out.print("국어점수입력: ");
		kor = scan.nextInt();
		return kor;

	}

}// class
