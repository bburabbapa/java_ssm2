
import java.util.Iterator;
import java.util.Scanner;

public class JA0904_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		int i = 0;
//		long sum = 0;
//		for (int i = 1; i< 10000; i++) {
//			System.out.println(i);
//			sum = sum + i;
//		}
//		System.out.println("for문 밖i: " + i);
//		System.out.println("for문 밖sum: " + sum);

		// 1부터 100까지 합을 출력하세오
//		int i = 0;
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum = sum + i;
//
//		}
//		System.out.printf("1부터 %d 까지 합계: %d \n", i - 1, sum);

		// 1부터 100까지의 합을 구해서 조건문을 통해 SUM이 200이상일 때를 자바로 구해줘요

		int sum = 0;
		int i = 0;

		// 1부터 100까지의 합 구하기
		for (i = 1; i <= 100; i++) {
			sum = sum + i;
			if (sum >= 200) {
				System.out.println("1부터 100까지의 합은" + sum + "이며, 200 이상입니다.");
				i = 101;
			}
		}
	}

}
