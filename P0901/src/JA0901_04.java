import java.util.Scanner;

public class JA0901_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자 2개를 입력하세요.");// 27입력 시 -- 2와 7을 분리해야함
		String number = scan.next();

		// String 분리
		char ch1 = number.charAt(0); // 279에서 (0-1-2) 0번째 문자 가져오라
		char ch2 = number.charAt(1);
		char ch3 = number.charAt(2);

		// char타입을 int타입으로 변경
		int n1 = ch1 - '0';// 0=48
		int n2 = ch2 - '0';
		int n3 = ch3 - '0';
		int result = n1 + n2 + n3;

		System.out.println(ch1);//소수점 첫째자리 반올림
		System.out.println(ch2);//소수점 첫째자리 올림
		System.out.println(ch3);//소수점 첫째자리 버림
		System.out.println("두수의 더하기 값: " + result);

		
		
		
		
	}

}
