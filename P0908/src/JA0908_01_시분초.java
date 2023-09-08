import java.util.Scanner;

public class JA0908_01_시분초 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 시분초
		int[] hour = new int[3];
		int[] minute = new int[3];
		double[] second = new double[3];

		for (int i = 0; i < 3; i++) {
			System.out.print("시 입력: ");
			hour[i] = scan.nextInt();
			System.out.print("분 입력: ");
			minute[i] = scan.nextInt();
			System.out.print("초 입력: ");
			second[i] = scan.nextDouble();
		} // for

		System.out.printf("%d:%d:%.2f\n", hour[1], minute[1], second[1]);
		// 14:14:14.55초로 변경
		hour[1] = 14;
		minute[1] = 14;
		second[1] = 14.55;
		System.out.printf("%d:%d:%.2f\n", hour[1], minute[1], second[1]);

		// 3번째 시간 second를 59.10으로 변경해서 시분초 모두 출력하시오
		second[2] = 59.10;
		System.out.printf("%d:%d:%.2f\n", hour[1], minute[1], second[1]);

	}// main

}// class




