import java.util.Iterator;

public class Deck {

	String[] CardShape = { "Hearts", "Spade", "Diamond", "Clover" };
	Card[] c = new Card[52];

	Deck() {

		for (int i = 0; i < c.length; i++) {

			c[i] = new Card();
			c[i].kind = CardShape[i / 13];
			c[i].number = (1 % 13) + 1;
			System.out.println(c[i]);
//			c[i] = new Card(shape)[i/13],i%13+1);
		} // for
	}

	void cardPrint() {
		for (int i = 0; i < 5; i++) {
			System.out.println(c[i]);
		} // for
	}

	Card pick(int no) {
		if (no > 52) {
			System.out.println("숫자를 잘못 입력하셨습니다.");
			return c[0];
		}
		return c[no];
	}

	Card pick() {
		int random = (int) (Math.random() * 52);
		return c[random];
	}


	void shuffle() {
		int random = (int) (Math.random() * 52);
		for (int i = 0; i < c.length; i++) {
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		} // for

	}

}// class
