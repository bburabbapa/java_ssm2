import java.util.Scanner;

public class JA0904_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String grade = "";

		System.out.println("점수를 입력하세요");
		int score = scan.nextInt(); // 여기에 성적을 입력하세요.

		if (score >= 90) {
			grade = "A";
			if (score >= 98) {
//				System.out.println("+");
				grade += "+";
			} else if (score <= 93) {
//				System.out.println("-");
				grade += "-";
			} else {
//				System.out.println();
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 88) {
//				System.out.println("+");
				grade += "+";
			} else if (score <= 83) {
//				System.out.println("-");
				grade += "-";
			} else {
//				System.out.println();
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 78) {
//				System.out.println("+");
				grade += "+";
			} else if (score <= 73) {
//				System.out.println("-");
				grade += "-";
			} else if (score >= 60) {
				grade = "D";
				if (score >= 68) {
//					System.out.println("+");
					grade += "+";
				} else if (score <= 63) {
//					System.out.println("-");
					grade += "-";
				} else {
					System.out.println("F");
				}

				System.out.println("학점: " + grade);
				System.out.println("점수: " + score);

			}
		}
	}
}
