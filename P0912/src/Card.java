
public class Card {
	Card() {//기본생성자
	}

	Card(String kind, int number) {//메인변수생성자
		this.kind = kind;
		this.number = number;
	}

	final int NUM_MAX = 13;
	String kind;
	int number;
	String[] cardShape = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	public String toString() { 
		return String.format("[%s,%d]", kind, number);

		// J=11 Q=12 K=13

	}

}

