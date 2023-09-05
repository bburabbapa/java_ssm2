import java.util.Scanner;

public class JA0905_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int i = 0;
//		int sum = 0;
//
//		for (i = 1; i <=100; i++) {
//			System.out.println(i);
//			sum = sum + i;
//		}
//		System.out.println("i: " + (i - 1)); // ("i: +(i));
//		System.out.println("sum: " + sum);

		int random = (int) (Math.random() * 100) + 1;
		int i = 0;
		int sum = 0;

		for (i = 1; i <= 100; i = i + 2) {
			sum += i;
			System.out.printf("순번: %d \n", i);
			System.out.println("합계: " + sum);

			int ran = (int) (Math.random() * 100) + 1;
			int sum2 = 0;
			int j = 0;
			sum = sum + i;
			for (j = 0; j <= 100; j++) {
				System.out.printf("순번: %d \n", i);
				System.out.println("합계:" + sum);

			}

		}

	}

}
