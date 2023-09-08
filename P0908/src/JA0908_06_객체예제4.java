import java.util.Scanner;

public class JA0908_06_객체예제4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 배열선언
//		int[] hour = new int[3];
//		int[] minute = new int[3];
//		double[] second = new double[3];

		
		
		
		
		
		// 객체선언
		Time [] t = new Time[3];
		t[0] = new Time();
		t[1] = new Time();
		t[2] = new Time();

		for (int i = 0; i < 3; i++) {
			System.out.print("시 입력: ");
			t[i].hour = scan.nextInt();
			System.out.print("분 입력: ");
			t[i].minute = scan.nextInt();
			System.out.print("초 입력: ");
			t[i].second = scan.nextDouble();

		} // for

		for (int i = 0; i < 3; i++) {
			System.out.printf("%d : %d : %.2f\n", t[i].hour, t[i].minute, t[i].second);
		} // for

	}// main

}// class
