
public class JA0911_02 {

	public static void main(String[] args) {
		// 배열선언 후 반복문을 이용하여 데이터를 추가해서 출력하는 방법

		String[] shape = { "Heart", "Spade", "Diamond", "Clover" };
		Card[] c = new Card[4];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card();// 객체선언 후 참조변수명.변수명
			c[i].kind = shape[i];
			c[i].number = 1;
			c[i].cardPrint();
		}

		// 각각의 카드객체를 선언 후 데이터를 추가해서 출력하는 방법
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 1;
		c1.cardPrint();
//		System.out.printf("kind: %s, number: %d \n",c1.kind,c1.number);

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 2;
		c2.cardPrint();
//		System.out.printf("kind: %s, number: %d \n",c2.kind,c2.number);

		Card c3 = new Card();
		c3.kind = "Diamind";
		c3.number = 3;
		c3.cardPrint();
//		System.out.printf("kind: %s, number: %d \n",c3.kind,c3.number);

		Card c4 = new Card();
		c4.kind = "Clover";
		c4.number = 4;
		c4.cardPrint();
//		System.out.printf("kind: %s, number: %d \n",c4.kind,c4.number);
		

		// 기본형 타입 선언 후 사용법
		String kind = "heart";
		int number = 1;

		int a; // 변수선언 후 값을 지정하지 않고 사용하면 에러
		System.out.println();

	}

}