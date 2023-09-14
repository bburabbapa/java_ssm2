package p0914;

import java.util.ArrayList;

public class Buyer {

	Buyer() {
	}

	Buyer(String id, String name) {
		this.id = id;
		this.name = name;

	}

	String id;
	String name;
	int money = 10000000;
	int bonusPoint = 0;
//	Product[] cart = new Product[10];
	
	//컬렉션선언
	ArrayList list = new ArrayList();// 컬렉션프레임워크: 다수의 여러객체를 다루기 위한 표준화된 프로그래밍

	// 다형성: 조상의 참조변수로 자손의 타입 객체를 다룸
	int i = 0; // 인스턴스변수

	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p); //자동으로 증가시켜서 넣어줌
//		cart[i] = p; // p를 Product[]배열에 담음
//		i++;
	}
//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
//	
//	void buy(Washing w) {
//		money -= w.price;
//		bonusPoint += w.bonusPoint;
//	}

}
