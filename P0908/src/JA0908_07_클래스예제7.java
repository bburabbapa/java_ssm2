
public class JA0908_07_클래스예제7 {

	public static void main(String[] args) {
		
		
		Card c1 = new Card();
		c1.kind = "heart"; //클래스명.클래스변수명
		c1.number = 1;
		
		
		Card c2 = new Card();
		c2.kind = "Diamond"; //클래스명.클래스변수명
		c2.number=2;
		
		Card c3 = new Card();
		c3.kind = "Clover";
		c3.number=3;
		
		Card c4 = new Card();
		c4.kind = "Spade";
		c4.number=4;
		
		System.out.println("c1: "+c1.kind+","+c1.number);
		System.out.println("c2: "+c2.kind+","+c2.number);
		System.out.println("c2: "+c3.kind+","+c3.number);
		System.out.println("c2: "+c4.kind+","+c4.number);
		
		
		
		
		
		
		
		
	}

}
