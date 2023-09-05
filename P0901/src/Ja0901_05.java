
public class Ja0901_05 {

	public static void main(String[] args) {

		// 소수점 셋째자리까지 자르기
		double pi = 3.141592;
		double pi2 = (int) (pi * 1000) / 1000.0;
		System.out.println(pi);
		System.out.println("Pi: " + pi2);

		// 소수점 4자리 이하 자르기
		double d = 124.1532145;
		double d2 = (int) (d * 10000) / 10000.0;
		System.out.println(d2);
		System.out.println("d: " + d2);

		// 소수점 2자리 이하 자르기
		double a = 2563.12121245;
		double a2 = (int) (a * 100) / 100.0;
		System.out.println(a2);
		System.out.println("a: " + a2);

		int num = 12345;
		int result = 12345 * 1000 / 10000;
		System.out.println(result);

		// Math.round() - 반올림
		// Math.ceil() - 올림
		// Math.floor() - 버림

		double n = 12.598;
		System.out.println(Math.round(n));// 소수점 첫째자리 반올림

		double x = 2.321;
		System.out.println(Math.ceil(x));// 소수점 첫째자리 올림

		double y = 12.598;
		System.out.println(Math.floor(y));// 소수점 첫째자리 버림

		// double n3 = (int)(n*100)/100.0;
		double n3 = Math.round(n * 10) / 10;
		System.out.println("둘째자리 반올림: " + n3);

		double x1 = 156.7854294;
		double x2 = Math.round(x1 * 1000) / 1000.0;
		System.out.println("넷째자리 반올림: " + x2);

	}

}
