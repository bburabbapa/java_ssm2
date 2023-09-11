
public class Calculate {

	public static void main(String[] args) {

		Cal1 c1 = new Cal1();
		c1.value = 10;
		System.out.println(c1.value);
		Cal2 c2 = new Cal2(10);// c2.value=10;생략됨
		System.out.println(c2.value);
	}// main

}// class

class Cal1 {
	int value;// 인스턴스변수
}// Cal1() {} 기본생성자

class Cal2 {
	int value;// 인스턴스변수
	
	// cal2 기본생성자 안만들어짐
	Cal2 (){}//기본생성자 생성을 반드시 해야한다
	Cal2(int x) {//매개변수가 있는 생성자
		value = x;
	}
}
