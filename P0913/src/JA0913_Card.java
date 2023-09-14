
public class JA0913_Card {

	public static void main(String[] args) {

		// 카드 52장 생성해서 카드를 섞으시오 (객체선언으로 구성)
		Deck d = new Deck();
		d.cardPrint(); // 섞기 전 순차적으로 출력
		System.out.println("=============================");
		d.shuffle();
		d.cardPrint();
		System.out.println("=============================");
		System.out.println("[5장 카드 뽑기]");
		for (int i = 0; i < 5; i++) {
			System.out.println(d.pick(i));
		}

		System.out.println("==============================");

		// a 5장 a라는 배열을 만든 후 5장을 저장해서 출력
		// b 5장 b라는 배열을 만든 후 5장을 저장해서 출력

		Card[] a = new Card[5];
		Card[] b = new Card[5];
		System.out.println("a: 카드 5장");
		for (int i = 0; i < 5; i++) {
			a[i] = d.pick(i);// 객체선언: 저장할 수 있는 공간
			System.out.println(a[0]);
		}
		System.out.println("b: 카드 5장");
		for (int i = 0; i < 5; i++) {
			b[i] = d.pick(i + 5);
			System.out.println(b[i]);

		}

	}

}
