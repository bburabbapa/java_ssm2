
public class Card {

	Card() {
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;

	}

	final int NUMBER_MAX = 13;
	String kind;
	int number;
	int flag;
	String[] CardShape = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K" };

	public String toString() {
		return String.format("[%s,%s]\n", kind, CardShape[number]);
	}

}
