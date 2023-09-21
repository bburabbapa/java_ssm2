import java.util.ArrayList;

public class ColAction2 {

	ColAction2() {
	}

	Card[] card = new Card[52];
	String[] shape = { "Spade", "Heart", "Diamond", "Clover" };
	ArrayList<Card> list = new ArrayList<Card>();

	// 1-13
	// Spade,Heart,Diamond,Clover
	// 52장의 카드를 생성하시오.

	void cardAll() {

		for (int i = 0; i < card.length; i++) {
			int number = i % 13 + 1;
			String kind = shape[i / 13];
			card[i] = new Card(number, kind);
		}
	}

	Card[] cardInsert() {
		cardAll();
		return card;

	}

}
