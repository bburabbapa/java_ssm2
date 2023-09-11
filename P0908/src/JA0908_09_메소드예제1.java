
public class JA0908_09_메소드예제1 {

	int result = 0;// 인스턴스변수

	public static void main(String[] args) {// void는 리턴이 없을 때 사용

		int result = 0; // 지역변수

		// result = 10 + 3;
		// result = 222 + 234;
		System.out.println(add(10, 3));

		// result = 222 + 234;
		System.out.println(add(222, 234));

		// result = 21 + 99;
		System.out.println(add(21, 99));

		// result = 787 + 676;
		System.out.println(add(787, 676));

		// result = 1127 + 458;
		System.out.println(add(1127, 458));

	}// main

	// 메소드정의
	static int add(int a, int b) { // int a=10; int b=3;
		int result = 0;
		result = a + b;
		return result; // 리턴 호출

//		static int add (int a, int b) {
//			int result= 0;
//			
//			result = a+b;
//			return result;

	}// add

}// class
