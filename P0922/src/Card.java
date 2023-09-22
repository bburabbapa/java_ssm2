
public class Card {

	Card(){}
	
	private Card(int number, String kind) {
		super();
		this.number = number;
		this.kind = kind;
	}

	private int number;
	private String kind;
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
}//class
