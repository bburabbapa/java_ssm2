import java.util.Scanner;

public class JA0904_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("LOVE의 뜻이 무엇입니까?");
		String result = scan.next();

		if (result.equals("사랑")) { // 스트링 문자열인 경우 등가비교가 아닌 equals 사용
			System.out.println("정답입니다");
		} else {
			System.out.println("오답입니다");
		}
		System.out.println("정답: " + result);

		System.out.println("5*4는 얼마일까요?");

		int score = scan.nextInt();

		if (score == 20) {

			System.out.println("정답입니다");

		} else {
			System.out.println("오답입니다");

		}

		// 두 수를 입력받아 두수의 곱을 맞추는 프로그램을 제작 하시오
		// 두 수를 입력받아 출력하시오
		// 두 수의 곱의 정답을 입력해서 맞으면 정답, 틀리면 오답이라고 출력사이오

		System.out.println("1번째 숫자를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요");
		int num2 = scan.nextInt();
		// System.out.printf("%d*%d 는 얼마일까요? \n",num1,num2);
		System.out.println("1번째 숫자*2번째 숫자는 얼마일까요?");
		int score2 = scan.nextInt();

		if (score2 == (num1 * num2)) {
			System.out.println("정답입니다");

		} else {
			System.out.println("오답입니다");

		}

		System.out.println("사랑이 영어로 무엇입니까?");
		String result2 = scan.next();

		if (result2.equalsIgnoreCase("love")) { // 대소문자 구분없이 - equalsIgnoreCase 사용
			System.out.println("정답입니다");
		} else {
			System.out.println("오답입니다");
		}
		System.out.println("정답: " + "LOVE");

	}
}
