package p0914;

import java.util.ArrayList;
import java.util.Iterator;

public class JA0914_08_ArrayList {

	public static void main(String[] args) {
		
		// 배열을 사용하면 배열크기 제한이 있으며 같은 타입만 가능하며 삭제 및 추가가 불가하다
		Card[] c = new Card[4];
		c[0] = new Card("Spade", 1);
		c[1] = new Card("Heart", 1);
		c[2] = new Card("Diamond", 1);
		c[3] = new Card("Clover", 1);

		for (int i = 0; i < c.length; i++) {
			System.out.printf("[%s,%d]\n", c[i].kind, c[i].number);
		}

		// ArrayList를 사용하면 배열 크기 제한이 없고 타입이 자유롭고 삭제 및 추가가 자유롭다
		ArrayList list = new ArrayList();
		list.add(new Card("Spade", 1));
		list.add(new Card("Heart", 1));
		list.add(new Card("Diamond", 1));
		list.add(new Card("Clover", 1));

		for (int i = 0; i < list.size(); i++) {
			Card ca = (Card) list.get(i); // 형변환해줘야함
			System.out.printf("[%s,%d]\n", ca.kind, ca.number);
		}

	}

}
