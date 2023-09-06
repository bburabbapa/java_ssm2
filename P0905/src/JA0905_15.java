import java.util.Scanner;

public class JA0905_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		int[] num = new int[10];
//		int i = 0;
//		// 1부터 100까지 랜덤숫자 생성
//		int random = (int) (Math.random() * 100) + 1;
//		// 무한반복
//		while (i < 10) {
//			// 숫자 입력 받기
//			System.out.println("랜덤숫자입력");
//			int input = scan.nextInt(); // input= 50,40,30,20...
//			num[i] = input;// num[0]=50 num[1]=40 ......
//
//			// if를 사용해서 랜덤숫자와 입력숫자가 맞는 지 비교
//			// 큰 수 작은 수 정답 브레이크
//			if (random == input) {
//				System.out.println("정답");
//			} else if (random < input) {
//				System.out.println("큰 수");
//			} else {
//				System.out.println("작은 수");
//			}
//			if (i == 9) {
//				break;
//			}
//			i++;
//		}
//		System.out.println("입력한 숫자: ");
//		
//		for (int j = 0; j < 10; j++) {
//			System.out.printf("%d ", num[j]);
//		}
//		System.out.println();
//		System.out.println("랜덤숫자: " + random);

//		int random = (int) (Math.random() * 100) + 1;
//		int i = 0;
//		int [] num = new int[10];
//		while (i < 10) {
//			System.out.println("랜덤숫자입력");
//			int input = scan.nextInt();
//			if (random == input) {
//				System.out.println("정답");
//			} else if (random < input) {
//				System.out.println("큰 수");
//			} else {
//				System.out.println("작은 수");
//			}
//			if (i == 9) {
//
//			}
//			i++;
//		}
//		System.out.println("입력한 숫자: ");
//		System.out.println();
//		for (int j = 0; j < 10; j++) {
//			System.out.printf("%d ", num[j]);
//
//		}
//		System.out.println();
//		System.out.println("랜덤숫자: " + random);

//		for (int i = 2; i <= 9; i++) {
//			System.out.printf("[ %d 단 ] \t ", i);
//		}
//		System.out.println();
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 2; j <= 9; j++) {
//				System.out.printf("%d * %d = %d \t ", j, i, i * j);
//
//			}
//			System.out.println();
//
//		}

		// 1부터 100까지 랜덤숫자생성
		// 2.입력
		// 3.비교
		// 4. 출력

//		int[] arrNum = new int[10];
//		int random = 0;
//		int count = 0;
//		int number = 0;
//
//		random = (int) (Math.random() * 100) + 1;
//		System.out.println("랜덤숫자: " + random);
//
//		// 무한 반복
//		while (true) {
//			System.out.println("숫자입력");
//			number = scan.nextInt();
//			arrNum[count] = number; // 입력된 숫자를 저장
//
//			if (random == number) { // 숫자가 맞는지 비교
//				System.out.println("정답입니다.");
//				break;
//			}
//			count++; // 도전횟수 1증가
//
//			if (count > 9) { // 도전횟수가 10회인지 확인
//				System.out.println("10번을 모두 완료하였기에 프로그램을 종료한다.");
//				count--;
//				break;
//			}
//		}
//		System.out.println("도전횟수: " + (count + 1));// 배열출력방법
//		System.out.println("입력한 숫자: ");
//		for (int i = 0; i < count; i++) {
//			System.out.print(arrNum[i] + "  ");
//		}
//		System.out.println();
//		System.out.println("랜덤숫자: " + random);

		int[] arrNum = new int[10];// 입력된 숫자 저장배열
		int number = 0;// 입력 숫자
		int count = 0;// 도전 횟수
		int random = 0;// 랜덤 숫자

		random = (int) (Math.random() * 100) + 1; // 2~10 = 10-2+1 1~100 = 100-1+1 100개 범위의 랜덤숫자를 생성
		while (true) {
			System.out.println((count + 1) + "번째 숫자를 입력하세요");
			number = scan.nextInt();
			arrNum[count] = number; // 배열된 숫자를 저장
			System.out.println("도전횟수: " + (count + 1)); // 꼭 가로 쳐줘야함
			System.out.println("입력숫자: " + number);
			count++;

			if (random == number) { // 숫자가 맞는지 비교
				System.out.println("정답입니다.");
				break;
			} else if (random > number) {
				System.out.println("입력숫자보다 큽니다");
			} else {
				System.out.println("입력숫자보다 작습니다");
			}

			if (count > 9) { // 입력횟수가 10회인지 확인
				System.out.println("10번째 완료되어 프로그램을 종료합니다");
				count--;
				break;

			}
		}
		// 입력한 숫자를 출력
		System.out.println("입력한 숫자: ");
		for (int i = 0; i < count; i++) {
			if (i == 0) {
				System.out.println(arrNum[i]);
				continue;
			}
			System.out.println("," + arrNum[i]);

		}
		// 도전횟수를 출력
		System.out.println("도전횟수: " + (count + 1));
		// 랜덤숫자를 출력
		System.out.println();
		System.out.println("랜덤숫자: " + random);

	}// main

}// class
