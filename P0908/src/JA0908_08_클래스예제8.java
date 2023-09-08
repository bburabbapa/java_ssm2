
public class JA0908_08_클래스예제8 {

	public static void main(String[] args) {
		// Spade Heart Diamond Clover 13장씩 = 52장

		Card[] c = new Card[52];
		String[] shape = { "Spade", "Heart", "Diamond", "Clover" };
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card();
			c[i].number = (i % 13) + 1;
			c[i].kind = shape[i / 13];
			// shape: 스페이드0~12 허트13~25 다이아몬드 39~51 클로버 39~51

		} // for
		System.out.println("Card Number: ");
		for (int i = 0; i < c.length; i++) {
			System.out.printf("%d,%s \n", c[i].number, c[i].kind);

		} // for
		System.out.println("================================");

//      배열선언
//		int[] num = new int[13];
//		for (int i = 0; i < 13; i++) {
//			num[i] = i + 1;
//
//		} // for
//		System.out.println();
//		System.out.println("================================");
//
//		System.out.print("num: ");
//		for (int i = 0; i < num.length; i++) {
//			System.out.printf("%d", num[i]);
//		} // for

	}// main

}// class
