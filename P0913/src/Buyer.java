
public class Buyer {
	String id = "aaa";
	String name = "Son";
	int money = 10000000;
	int bonusPoint = 0;


//	void buy(Tv t) {
//		money = money - t.Price;
//		bonusPoint += t.bonusPoint;
//
//	}

//	void buy(Computer c) {
//		money -= c.Price;
//		bonusPoint += bonusPoint;
//
//	}
//
//	void buy(Audio a) {
//		money -= a.Price;
//		bonusPoint += a.bonusPoint;
//
//	}

	// Tv를 구매했을 때 사용하는 메소드
	void buy(Product p) {
		money = money - p.Price;
		bonusPoint += p.bonusPoint;

	}

}
