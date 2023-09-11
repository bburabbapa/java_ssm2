
public class JA0908_03_객체예제1 {

	public static void main(String[] args) {

		Tv t = new Tv(); // t 에 주소가 저장됨
		// Tv = t;
		// Tv t = new Tv();
		t.channel = 7;
		t.channel = 9;
		t.channelUp();
		t.channelUp();
		System.out.println(t.channel);// 출력

		t.color = "white";
		t.color = "black";
		System.out.println(t.color);// black출력
		System.out.println(t.power);// false출력
		t.power(); // false의 반대
		System.out.println(t.power);

		int[] hour = new int[3]; // hour라는 주소를 생성해서 0 1 2입력
		int[] minute = new int[3];
		int[] second = new int[3];

		Time[] t1 = new Time[3]; // t1이라는 주소를 생성
		t1[0] = new Time();
		t1[1] = new Time();
		t1[2] = new Time();

		class Time {
			int hour;
			int minute;
			int second;

		}

	}// main

}// class
