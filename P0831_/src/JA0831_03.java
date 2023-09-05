
public class JA0831_03 {

	public static void main(String[] args) {
		boolean power = true;
		boolean power2 = false;

		char ch = 'A';
		char ch02 = 'a';
		char ch03 = '\u0041';// 대문자 A
		char tab = '\t';
		byte b = 127;
		short s = 32767;

		int num = 97; // A=65 a=97
		int num2 = 0100;

		int number = 0;
		System.out.println(number);// 지역변수는 값을 입력해야 사용할 수 있음

		System.out.println(ch);
		System.out.println(ch02);
		System.out.println(ch03);
		System.out.println(tab);
		System.out.println(b);
		System.out.println(s);

		System.out.println("--------------");
		System.out.println(num);
		System.out.println((char) num);// num을 숫자형태로 변환하기
		System.out.println(num2);

	}

}
