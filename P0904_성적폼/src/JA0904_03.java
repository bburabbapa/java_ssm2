import java.util.Scanner;

public class JA0904_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		System.out.println("프로그램을 종료하시려면 x 또는 X를 입력하세요.");
//		char result = scan.next().charAt(0); // 문자열을 문자로 변경하는 명령어
//
//		if (result == 'x' || result == 'X') {
//			System.out.println("프로그램을 종료합니다.");
//		} else {
//			System.out.println("프로그램을 종료하시려면 x 또는 X를 입력하세요.");
//		}

		System.out.println("2자리 문자를 입력하세요.");
//		String result = scan.next();

		char result1 = scan.next().charAt(0);

		if (result1 >= 0 && result1 <= 9) {
			System.out.println("숫자가 입력되었습니다.");
		} else {
			System.out.println("숫자가 아닙니다.");
		}

		result1 = scan.next().charAt(1);
		if (result1 >= 0 && result1 <= 9) {
			System.out.println("숫자가 입력되었습니다.");
		} else {
			System.out.println("숫자가 아닙니다.");
		}

		
			
		
		
		
		
		
	}

}
