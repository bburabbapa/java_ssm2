import java.util.Scanner;

public class JA0904_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double temp = Math.random();
		System.out.println("난수값: " + temp);

		// Math.ceil(올림) Math.floor(버림) Math.round(반올림)

		// 1부터 10까지 랜덤 정수 값
		int num = (int) (Math.random() * 10) + 1;
		System.out.println("랜덤값: " + num);

		// 1쿠터 100까지 랜덤 정수 값
		int num2 = (int) (Math.random() * 100) + 1;
		System.out.println();

		// 0부터 0까지 랜덤 정수 값
		int num3 = (int) (Math.random() * 10);
		System.out.println("랜덤정수값: " + num3);

		// 1부터 45까지 랜덤 정수 값
		int num4 = (int) (Math.random() * 45) + 1;
		System.out.println("랜덤정수값: " + num4);

		// 0부터 9999까지 랜덤 정수 값
		int num5 = (int) (Math.random() * 10000);
		System.out.println("랜덤정수값: " + num5);

		// 1부터 20까지 랜덤 정수 값
		int num6 = (int) (Math.random() * 20) + 1;
		System.out.println("랜덤정수값: " + num6);

	}

}
