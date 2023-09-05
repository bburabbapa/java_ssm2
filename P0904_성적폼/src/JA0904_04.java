import java.util.Scanner;

public class JA0904_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		if (score >= 90) {
			System.out.print("A");
			if (score >= 98) {
				System.out.println("+");

			} else if (score <= 93) {
				System.out.println("-");

			} else {
				System.out.println();
			}
		} else if (score >= 80) {
			System.out.print("B");
			if (score >= 88) {
				System.out.println("+");
			} else if (score <= 83) {
				System.out.println("-");
			} else {
				System.out.println();
			}
		} else if (score >= 70) {
		}
		System.out.print("C");
		if (score >= 78) {
			System.out.println("+");
		} else if (score <= 73) {
			System.out.println("-");
		} else {
			System.out.println();
		}
		System.out.println("점수: " + score);

	}

}
