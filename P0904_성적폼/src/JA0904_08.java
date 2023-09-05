import java.util.Scanner;

public class JA0904_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1부터 10까지 랜덤숫자르 생성하시오
		int random = (int) (Math.random() * 10) + 1;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		System.out.println("1번째 숫자를 입력하세요.");
		num1 = scan.nextInt();
		if (random == num1) {
			System.out.println("정답입니다!");
		} else {
			System.out.println("오답입니다!");
		}

		System.out.println("2번째 숫자를 입력하세요.");
		num2 = scan.nextInt();
		if (random == num2) {
			System.out.println("정답입니다!");
		} else {
			System.out.println("오답입니다!");
		}

		System.out.println("3번째 숫자를 입력하세요.");
		num3 = scan.nextInt();
		if (random == num3) {
			System.out.println("정답입니다!");
		} else {
			System.out.println("오답입니다!");
		}
		System.out.printf("입력번호: %d, %d, %d \n", num1, num2, num3);
		System.out.println("정답번호: " + random);

		// 1부터 100까지의 5개의 랜덤 숫자를 생성해서 변수에 저장 후 출력하시오

//		int num1 = (int) (Math.random() * 100) + 1;
//		int num2 = (int) (Math.random() * 100) + 1;
//		int num3 = (int) (Math.random() * 100) + 1;
//		int num4 = (int) (Math.random() * 100) + 1;
//		int num5 = (int) (Math.random() * 100) + 1;
//
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
//		System.out.println(num5);

		// 1부터 10까지 랜덤 숫자를 1개 생성 후 출력하시오

		// 3개의 숫자를 입력받아서 정답을 맞추는 프로그램을 구현하세요
		// 1개를 입력받아서 맞으면 정답 틀리면 오답으로 출력하세요
		// 3개의 입력값을 출력 입력번호는 1, 9, 7
		// 정답번호: 5

	}

}
