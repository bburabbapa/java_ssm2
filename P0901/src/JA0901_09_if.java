import java.util.Scanner;

public class JA0901_09_if {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// if문
//		System.out.println("사원번호를 입력하세요.");
//		int number = scan.nextInt();
//
//		// 1001 = CEO 그 외에는 매출액 메뉴를 볼 수 없음
//
//		System.out.println("[네비게이션 메뉴]");
//		System.out.println("1.회원정보보기");
//		System.out.println("2.상품정보보기");
//		System.out.println("3.회사소개");
//
//		if (number == 1001) {
//			System.out.println("4.매출액 보기");
//		} else
//			System.out.println("매출액 볼 수 없음");
//
//		
//		

		// if else문
		System.out.println("점수를 입력하세요.");
		int number = scan.nextInt();
		if (number >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		if (number >= 60) // 한 줄이면 중괄호 필요없음 두 줄이면 중괄호 포함
			System.out.println("합격");
		else // 두개의 조건이라면 사용
			System.out.println("불합격");

		System.out.println("점수를 입력하세요.");
		int num = scan.nextInt();

		if (num >= 90) {
			System.out.println("A학점");
		} else if (num <= 89 && num >= 80) { // (num>=80) 앞에 생략가능
			System.out.println("B학점");
		} else if (num <= 79 && num >= 70) { // (num>=70) 앞에 생략가능
			System.out.println("C학점");
		} else if (num <= 69 && num >= 60) { // (num>=60) 앞에 생략가능
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}

		System.out.println("점수를 입력하세요.");
		int num2 = scan.nextInt();
		if (num2 >= 80) {
			System.out.println("퇴사");
		} else if (num2 >= 70) {
			System.out.println("꺼져");

		} else {
			System.out.println("바이바이");
		}

		
		
		
		
		
		
	}

}
