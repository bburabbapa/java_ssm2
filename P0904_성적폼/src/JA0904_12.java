import java.util.Scanner;

public class JA0904_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 6;
		switch (num) {
		case 1:
		case 2:
			System.out.println("kt");
			break;
		case 6:
		case 8:
			System.out.println("lg");
			break;
		default:
			System.out.println("sk");
			break;
		}

		if (num == 1 || num == 2) {
			System.out.println();
		} else if (num == 6 || num == 8) {
			System.out.println("lg");
		} else {
			System.out.println("sk");
		}

		System.out.println("점수를 입력하세요");
		int score=scan.nextInt();
		if(score>=90) {
			System.out.println("A학점");
		}else if(score>=98) {
			System.out.println("+");
		}else {
			System.out.println("-");
		}
		

		
	}

}
