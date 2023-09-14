
public class Deck {

	String[] cardShape = { "Heart", "Spade", "Diamond", "Clover" };
	Card[] c = new Card[52];

	Deck() { // 기본생성자

		for (int i = 0; i < c.length; i++) {
			c[i] = new Card(); // 객체선언= 참조변수명.변수명
			c[i].kind = cardShape[i / 13];
			c[i].number = (i % 13) + 1; // 15%13
			System.out.println(c[i]);
			
			//c[i] = new Card(shape[i/13],i%13+1); 
		}
	} //카드출력

	void cardPrint() {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

	// 특정번호 카드 가져오기
	Card pick(int no) {
		if (no > 52) {
			System.out.println("숫자를 잘못 입력하셨습니다.");
			return c[0];
		} // if
		return c[no];
	}

	// 랜덤으로 카드 가져오기
	Card pick() {
		int random = (int) (Math.random() * 52);
		return c[random];

	}
	// 카드 섞기
	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int random = (int) (Math.random() * 52);
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		} // for

	}// main

}// class
