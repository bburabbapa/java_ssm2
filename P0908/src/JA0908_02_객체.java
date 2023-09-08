import java.util.Scanner;

public class JA0908_02_객체 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 객체지향언어
		// 기존 프로그래밍언어와 다르지 않다
		// 코드 재사용성이 높다 관리가 쉽다 신뢰성이 높다
		// 클래스: 객체를 정의한 것
		// 클래스: 제품설계도 객체: 제품

		// 배열선언
		int[] num = new int[3];
		int[] hour = new int[3];
		int[] minute = new int[3];
		double[] second = new double[3];

		// 정수형선언
		int a = 0;

		// 배열데이터 입력
		hour[0] = 12;
		minute[0] = 12;
		second[0] = 12.25;

		// 객체선언: 저장할 공간이 생김 //객체: 제품
		Time t = new Time();
		Time t2 = new Time();
		Time t3 = new Time();

		t.hour = 12;
		t.minute = 12;
		t.second = 12.25;

		System.out.println(num); // 주소값
		System.out.println(hour[0]); // 데이터값
		System.out.println(t);// 주소값
		System.out.println(t.hour);// 데이터값

		// 변수에 데이터 넣기
		int i = 10;
		// 배열선언후 데이터 넣기
		int[] arr = new int[3];
		arr[0] = 10;
		// 객체선언
		Time time = new Time();
		// 객체선언 후 데이터 넣기
		time.hour = 10;

		// 객체 -속성 기능
		// 속성은 변수로 기능은 메서드로
		// 속성: 크기 길이 높이 색상 볼륨 채널
		// 기능: 켜기 끄기 볼륨높이기 채널높이기

	}// main

}// class
