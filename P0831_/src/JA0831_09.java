import java.util.Scanner;

public class JA0831_09 {

	public static void main(String[] args) {
		// 출력: println, print, printf
		// 입력: Scanner
		// String str = new String("abc");
		Scanner scan = new Scanner(System.in);// 입력: 현재시스템 화면에서 입력받음
		int number = scan.nextInt();
		System.out.println("당신이 원하는 숫자를 입력하세요.");
		System.out.println("입력한 숫자: " + number);

	}
}
