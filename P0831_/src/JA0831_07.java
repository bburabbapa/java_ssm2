
public class JA0831_07 {

	public static void main(String[] args) {
		// 형변환
		double d = 1.6;
		int i = (int) d;// int 타입으로 형변환- 강제형변환
		System.out.println(i);

		int x = 10;
		double d2 = x; // 형변환 생략가능- 자동형변환
		System.out.println(d2);

		// char,byte,short < int < long < float < double < String

		System.out.println(10 / 3.0);
		System.out.printf("%.1f\t", 10 / 3.0); // \n 줄바꿈 \t 띄어쓰기
		System.out.println("안녕하세요");

		// 실수형값 %f . 정수형값 %d, 문자열값 %s 불리언형식 %b 문자 %c

		System.out.printf("%s\n", "손승민입니다.");
		System.out.printf("%d\n", 500);
		System.out.printf("%f\n", 1.5);
		System.out.printf("%,012d", 100000000); // 천단위표시(,) 남는자릿수채우기(0)
		System.out.printf("국어: %d, 심리학: %d, 정사론: %d\n", 100, 99, 88);

	}

}
