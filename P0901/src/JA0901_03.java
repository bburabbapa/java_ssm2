
public class JA0901_03 {

	public static void main(String[] args) {
		// byte char short --int
		// long c=(long)a*b;
//		
//		int a=1000000;
//		int b=1000000;
//		long c=(long)a*b;
//		System.out.printf("%,d",c);

		char c1 = 'a';
		System.out.println(c1);
		char c2 = 97;// 아스키코드 a=97
		System.out.println(c2);

		char c3 = 65;// 아스키코드 A=65
		System.out.println(c3);

		char c4 = 65 + 1;// 아스키코드 A+1=B c4+1(x) (char)(c2+1);(o)
		System.out.println(c4);

		char c5 = 71;
		System.out.println(c5);

		char c6 = ++c2; // (=97+1)
		System.out.println(c6);

		char c7 = '0'; // 문자 0이출력됨
		System.out.println(c7);
		System.out.println(c7 + 1);// c7이 int로 변환되어서 아스키코드로 출력됨--49

		char c8 = (char) (c6 + 1);
		System.out.println(c8);

		int i = '2' - '0';// 아스키코드 (2=50) - (0=48)
		System.out.println(i);

		char i2 = '4' - '0';
		System.out.println(i2);

		char i3 = '7' - '0';// 문자형 숫자를 int 타입으로 변경시 0을 빼주면 됨
		System.out.println(i3);

	}

}
