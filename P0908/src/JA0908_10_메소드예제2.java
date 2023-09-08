
public class JA0908_10_메소드예제2 {

	public static void main(String[] args) {
		// 3개의 점수를 입력받아 합계와 평균을 구해라

		int kor = 100;
		int eng = 99;
		int math = 98;

		System.out.println("합계: " + total(kor, eng, math));
		System.out.println("평균: " + avg(kor, eng, math));

	}// main
		// 리턴타입 메소드명 (매개변수명,매개변수명,매개변수명)

	static int total(int kor, int eng, int math) {
		return kor + eng + math;// 리턴타입과 리턴결과타입이 무조건 일치== int값은 int 값
		// 리턴호출
	}

	static double avg(int kor, int eng, int math) {
		return (kor + eng + math) / 3.0; // ==더블값은 더블값
		// 리턴호출

	}

}// class
