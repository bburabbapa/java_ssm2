
public class JA0911_03 {

	public static void main(String[] args) {

		// 카드 객체 4개를 선언해서 하트 스페이드 다이아몬드 클로버를 출력하시오

		String[] shape = { "Heart", "Spade", "Diamond", "Clover" };
		Card[] c = new Card[13];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card();
			c[i].kind = shape[0];
			c[i].number = i + 1;
			c[i].cardPrint();
		}

		String[] shape2 = { "Heart", "Spade", "Diamond", "Clover" };
		Card[] c1 = new Card[26];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card();
			c[i].number = (i % 13) + 1;// 13장의 카드를 하트 13장 스페이드1~13
			// 15%13 나머지 2
			c[i].kind = shape[i / 13]; // 15%13 몫 1
			c[i].cardPrint();

		}

		String[] shape3 = { "Heart", "Spade", "Diamond", "Clover" };
		Card[] c2 = new Card[52];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card();
			c[i].number = (i % 13) + 1;
			c[i].kind = shape[i / 13];
			c[i].cardPrint();

		}

		String[] shape4 = { "Heart", "Spade", "Diamond", "Clover" };
		Card[] c4 = new Card[52];
		for (int i = 0; i < c2.length; i++) {
			c[i] = new Card();
			c[i].number = (i % 13) + 1;
			c[i].kind = shape[i / 13];
			c[i].cardPrint();
		}

//		System.out.print("카드숫자 합계: ");
//		int result =(c[0].number , c[5].number); //코드의 중복을 막기위해 05번을 가지고 옴
//		
//		System.out.println("result");
	

	}// main

}// class

//		String[] shape3 = { "Heart", "Spade", "Diamond", "Clover" };
//		Card[] c5 = new Card[4];
//		
//
//		Card c1 = new Card();
//		c1.kind = "Heart";
//		c1.number = 1;
//		c1.cardPrint();
//
//		Card c2 = new Card();
//		c2.kind = "Spade";
//		c2.number = 2;
//		c2.cardPrint();
//
//		Card c3 = new Card();
//		c3.kind = "Diamond";
//		c3.number = 3;
//		c3.cardPrint();
//
//		Card c4 = new Card();
//		c4.kind = "Clover";
//		c4.number = 4;
//		c4.cardPrint();
