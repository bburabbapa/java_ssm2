
public class JA0912_08_card {

	public static void main(String[] args) { // 접근제어자
//		Card c = new Card();
//		c.kind = "Spade";
//		c.number = 1;
//		
//		
//		Card c2 = new Card();
//		c2.kind = "Spade";
//		c2.number = 2;
//
//		System.out.println(c);
//		System.out.println(c2);

//		String[] shape = { "Heart", "Spade", "Diamond", "Clover" };
//		Card[] c = new Card[52]; //객체선언
//		for (int i = 0; i < c.length; i++) {
//			c[i] = new Card();
//			c[i].kind = shape[i / 13];
//			c[i].number = (i % 13) + 1;
//			System.out.println(c[i]);
//
//		}

		Deck d = new Deck();
		d.cardPrint();
		d.shuffle();
		System.out.println("===========================");
		d.cardPrint();
		System.out.println("===========================");
		System.out.println("카드 한장 출력: ");
		System.out.println(d.pick());

		//this. = 인스턴스변수를 가리키는 참조변수
		//this() = 다른 생성자 호출
		//super는 조상의 멤버와 자신의 멤벌르 구별하는 데 사용
	}//main

}//class
