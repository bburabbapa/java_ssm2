
public class JA0831_02 {

	public static void main(String[] args) {
		char ch01 = 'a'; // == 같다 =뒤에 있는 값을 앞에 넣어라(대입연산자) 홑따옴표
		char ch02 = 'b';
		char ch03 = 'c';

		System.out.println(ch01);
		System.out.println(ch02);
		System.out.println(ch03);

		char ch04 = '가';// char는 무조건 한 글자만 가능하다

		String str = new String("abc");// 스트링 문자열을 통해서 여러 문자 출력이 가능하다 (쌍따옴표)
		String str2 = "가나다라";
		System.out.println(str);
		System.out.println(str2);

		final int MAX = 100;// 상수는 파이널 표시 (잘 사용하지는 않는다)

	}
}
