package p0915_test;

import java.util.Scanner;

public class J01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		System.out.println("첫번째 숫자를 입력하세요.");
		int n1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int n2 = scan.nextInt();
		
		//사칙연산 총합을 구해서 출력
		//인스턴스메소드: 객체선언 후 참조변수명.메소드명
		//매개변수로 보냄
		JMethod j = new JMethod();
		j.calculate(n1,n2);
		int result = 0;
		System.out.println("결과값: "+result);
		
		
		
		
	}//main

}//class
