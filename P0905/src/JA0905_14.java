import java.util.Scanner;

public class JA0905_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		int[] num = new int[10];
//
//		int random = (int) (Math.random() * 100) + 1;
//		int i = 0;
//
//		while (i < 10) {
//			System.out.println("랜덤숫자입력");
//			int input = scan.nextInt();
//			num[i] = input;
//			if (random == input) {
//				System.out.println("정답");
//			} else if (random < input) {
//				System.out.println("큰수");
//			} else {
//				System.out.println("작은수");
//			}
//			i++;
//		}
//		System.out.print("입력숫자: ");
//		for (int j = 0; j < 10; j++) {
//			System.out.printf("%d ", num[j]);
//		}System.out.println();
//		System.out.println("랜덤숫자: " + random);

	
		int[] num = new int[10];
		int i = 0;
		// 1부터 100까지 랜덤숫자 생성
		int random = (int) (Math.random() * 100) + 1;
		// 무한반복
		while (i < 10) {
			// 숫자 입력 받기
			int input = scan.nextInt();
			System.out.println("랜덤숫자입력");
			num[i] = input;
			if (random == input) {
				System.out.println("정답");
			} else if (random < input) {
				System.out.println("큰 수");
			} else {
				System.out.println("작은 수");
			}
			if (i == 9) {
				break;
			}
			i++;
		}
		System.out.println("입력한 숫자: ");
		for (int j = 0; j < 10; j++) {
			System.out.printf("%d ", num[j]);
		}
		System.out.println();
		System.out.println("랜덤숫자: " + random);

	}// main
}// class
