package p0915_test;

import java.util.Scanner;

public class J02 {

	public static void main(String[] args) {
		// 4개의 숫자를 입력받아 JMethod cal2메소드 생성
		// 4개의 숫자 더하기와 곱하기를 한 결과값을 main에서 출력하시오
		Scanner scan = new Scanner(System.in);
		//1번째 방법
//		System.out.println("첫번째 숫자입력");
//		int a1 = scan.nextInt();
//		System.out.println("두번째 숫자입력");
//		int a2 = scan.nextInt();
//		System.out.println("세번째 숫자입력");
//		int a3 = scan.nextInt();
//		System.out.println("네번째 숫자입력");
//		int a4 = scan.nextInt();
//	
//
//		JMethod2 j = new JMethod2();
//		int result= j.calculate(a1, a2, a3, a4);
//		System.out.println("결과값: " + result);
		
		
		
		//2번째 방법
		int[] n = new int[4];
		for (int i = 0; i < n.length; i++) {
			System.out.printf("%d번째 숫자를 입력하세요.", i + 1);
			n[i] = scan.nextInt();
		}

		JMethod2 j = new JMethod2();
		int result = j.calculate(n[0], n[2], n[3], n[4]);
		System.out.println("결과값: " + result);

	}// main

}// class
