import java.util.Scanner;

public class JA0905_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		Math.random(); // 0.0 < = x < 1.0 랜덤숫자를 생성하는 메소드

//		int random = (int) (Math.random() * 100) + 1;
//
//		for (int i = 0; i < 3; i++) {
//			System.out.println("숫자를 입력하세요");
//			int num = scan.nextInt();
//
//			if (random == num) {
//				System.out.println("정답입니다!");
//				break;// 반복문을 중간에 종료 시에 사용하는 명령어
//			} else {
//				System.out.println("오답입니다!");
//			}
//			System.out.println("랜덤숫자: " + random);
//
//		}

		int random = (int) (Math.random() * 10) + 1;

		int i = 0;
		int sum = 0;

		for (i = 0; i < 100; i++) {
			sum = sum + i;
			System.out.printf("순번: %d,  ", i); // 전 단계 순번 - 1
			System.out.println("합계: " + sum); // 합계는 합계 - 순번
			if (sum >= 200) {
				break;
			}

			System.out.printf("정답: %d, %d \n", i, sum);
			System.out.printf("이전단계: %d, %d \n", i - 1, sum - i);

		}

	}

}
