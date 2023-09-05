import java.util.Scanner;

public class JA0904_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 10과5 두 수를 입력해서 큰 수를 출력하시오
//		System.out.print("첫 번째 숫자를 입력하세요: ");
//		int num1 = scan.nextInt();
//
//		System.out.print("두 번째 숫자를 입력하세요: ");
//		int num2 = scan.nextInt();
//
//		if (num1 > num2) {
//			System.out.println("큰 수는 " + num1 + "입니다.");
//		} else if (num1 < num2) {
//			System.out.println("큰 수는 " + num2 + "입니다.");
//		} else {
//			System.out.println("두 수는 같습니다.");
//		}

		// 첫 번째 공식
		System.out.println("1번째 숫자를 입력하세요");
		int num1 = scan.nextInt();

		System.out.println("2번째 숫자를 입력하세요");
		int num2 = scan.nextInt();

		System.out.printf("1: %d, 2: %d \n", num1, num2);

		if (num1 > num2) {
			System.out.println("큰 수는" + num1 + "입니다");
		} else if (num1 < num2) {
			System.out.println("큰 수는" + num2 + "입니다");
		} else {
		}
		System.out.println("두 수는 같습니다");

		// 두 번째 공식
		System.out.println("큰 수를 입력하세요.");
		int num3 = scan.nextInt();
		System.out.println("작은 수를 입력하세요.");
		int num4 = scan.nextInt();

		if (num3 > num4) {
			System.out.println("큰 수는 " + num1 + "입니다");
		} else if (num3 < num4) {
			System.out.println("작은 수는 " + num2 + "입니다");

		} else {
			System.out.println("두 수는 같습니다.");
		}

		// 0~9사이 숫자면 숫자 이상이면 숫자아님
		System.out.println("숫자를 입력하세요");
		int ch = scan.nextInt();
		// if (!ch>='0' && ch<='9') {}
		// if(ch<'0' || ch>'9') {}
		if (ch >= '0' && ch <= '9') {
			System.out.println("범위의 숫자입니다.");
		} else {
			System.out.println("범위의 숫자가 아닙니다.");

		}

	}

}
