import java.util.Scanner;

public class JA0911_04 {

	public static void main(String[] args) {
		int a = 0; // 지역변수
		int b = 0;

		while (true) {

			Scanner scan = new Scanner(System.in);
			System.out.println("두 수를 입력하세요.");
			a = scan.nextInt();

			if (a == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("두 번째 수를 입력하세요.");
			b = scan.nextInt();
		} // while

		JA0911_04 j = new JA0911_04(); // 객체선언
		int result = max(a, b);//클래스명.메소드명==같은 클래스내에 선언되면 클래스명은 생략가능(j.max)
		System.out.println("큰 수: " + result);

	}// main
		// static이 있으면 클래스변수 객체선언없이 클래스명.변수명
		// static이 없으면 인스턴스변수 객체선언 후 참조변수명.변수명
		// 메소드는 소괄호에 중괄호가 시작되면 메소드(for반복문예외)
		// static이 있으면 클래스메소드(static) 객체선언없이 클래스명.메소드명
		// static이 없으면 인스턴스메소드 객체선언 후 참조변수명.메소드명
	static int max(int a, int b) { // 메소드 내에 있는 모든 변수는 지역변수
		//오버로딩: 메소드이름은 같지만 매개변수의 타입이나 개수가 다른 것

		if (a > b) {
			return a;
		} else {
			return b;
		} // if
	}// add


	
	
	
}// class
