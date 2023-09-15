
public class Product {
	String name; //상품명
	int price;//상품가격
	int bonusPoint;//보너스포인트

	public String toString() {
		return String.format("%s,%d,%d,", name, price, bonusPoint);
	}
	
}
