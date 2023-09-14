
public class Tv extends Product {

//	int size;
//
//	Tv() {
//		this("삼성TV70", 1000000, 10000, 70);
//
//	}
//
//	Tv(String pName, int price, int bonusPoint, int size) {
//		this.pName = pName;
//		this.Price = price;
//		this.bonusPoint = bonusPoint;
//		this.size = size;

	int size;

	Tv(String pName, int price, int bonusPoint, int size) {
		this.pName = pName;
		this.Price = price;
		this.bonusPoint = bonusPoint;
		this.size = size;
	}

	Tv() {
		this("삼성", 1000000, 1000, 70);
	}

}
