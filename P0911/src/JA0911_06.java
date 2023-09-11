
public class JA0911_06 {

	public static void main(String[] args) {
		Data d = new Data();// 객체선언 후 참조변수명.변수명
		d.x = 10;
		System.out.println("d.x: " + d.x);
		change(d.x); // 10
		System.out.println("2d.x: "+d.x);

	}// main

//	static void change(int x) { // static 있으면 클래스메소드: 객체선언 없이 클래스명.메소드명
//		x = 1000;
//		System.out.println("메소드x: " + x); }
	
	
	
	static int change(int x) {
		x=1000;
		System.out.println("메소드x: "+x);//1000
		return x;//리턴
	}
	

	

}// class
