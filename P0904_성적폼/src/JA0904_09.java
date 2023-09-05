import java.util.Scanner;

public class JA0904_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 6;
		switch (num) {
		case 1:
		case 7:
			System.out.println("LG");
			break;
		case 6:
		case 8:
			System.out.println("SK");
			break;
		case 9:
			System.out.println("KT");
			break;
		default:
			System.out.println("해당사항없음");
			break;
		}

		if (num == 1 || num == 7) {
			System.out.println("LG");
		} else if (num == 6 || num == 8) {
			System.out.println("SK");
		} else if (num == 9) {
			System.out.println("KT");
		} else {
			System.out.println("해당사항없음");
		}

		// 두 수를 입력받고 +-*/ 를 선택해서 그 값을 자바로 출력하시오

		int num1 = 0;
		int num2 = 0;
		char chioce = ' ';
		System.out.print("첫 번째 숫자를 입력하세요: ");
		num1 = scan.nextInt();

		System.out.print("두 번째 숫자를 입력하세요: ");
		num2 = scan.nextInt();

		// 연산자 입력
		System.out.println("연산자를 선택하세요 (+, -, *, /): ");
		char choice = scan.next().charAt(0);

		double result = 0.0;

		// 입력한 연산자에 따라 계산
		switch (choice) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("올바른 연산자를 선택해주세요.");
			return;
		}
		System.out.println("결과값: " + result);

		
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
			break;
		}

	}

}
