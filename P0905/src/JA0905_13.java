import java.util.Arrays;
import java.util.Scanner;

public class JA0905_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] num = new int[10];
		// 1부터 100까지 랜덤숫자를 생성
		// while 무한 반복
		// num 숫자 입력 받기
		// if를 사용해서 랜덤숫자와 입력숫자가 맞는 지 비교
		// 큰 수 작은 수 정답 break

		int random = (int) (Math.random() * 100) + 1;
		int i = 0;
		while (i < 10) {
			System.out.println("랜덤숫자입력");
			int input = scan.nextInt();
			num[i] = input;
			if (random == input) {
				System.out.println("정답");
				break;
			} else if (random > input) {
				System.out.println("큰 수");
			} else {
				System.out.println("작은 수");
			}
			if (i == 9) {
				break;
			}
			i++;

		} // while

		System.out.print("입력한 숫자: ");
		for (int j = 0; j <= 1; j++) {
			System.out.printf("%d  ", num[j]);
		}
		System.out.println();
		System.out.println("랜덤숫자: " + random);

	}// main
}// class
