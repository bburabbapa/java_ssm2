package p0830;

public class JA0830_02 {
// 변수넣기 
	public static void main(String[] args) {
		boolean bo = true;
		boolean bo2 = false;
		char ch = 'a';// 문자형은 반드시 문자하나만 해당함
		char ch2 = 'b';
		byte by = 1; // 바이트 쇼트는 잘 사용하지 않는다 정수형은 무조건 int사용
		short sh = 2;
		int b = 20;
		int in = 2100000000;// int는 21억개 이하 까지만
		long lo = 1000000000L;// lomg은 21억개 이상일 때 사용(반드시 뒤에 접미사 L을 넣는다)
		float fl = 1.2f;// float은 뒤에 접미사 f사용 실스형은 보통 더블을 사용
		double a = 1.1;// 뒤에 접미사 d를 붙여도되고 안붙여도 되고
		System.out.println(a);
		System.out.println(b);
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}
}
