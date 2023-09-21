import java.util.ArrayList;

public class JA0921_11_Card2 {

	public static void main(String[] args) {
		ColAction2 col2 = new ColAction2();

		Card[] card = col2.cardInsert();
		for (int i = 0; i < card.length; i++) {
			System.out.println(card[i].getNumber() + ", " + card[i].getKind());
		}

	}// main
}// class
