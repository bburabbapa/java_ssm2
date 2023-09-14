
public class JA0913_08 {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		System.out.println("현재 잔액: " + b1.money);
		Tv t = new Tv();
		System.out.println(t.Price);
		b1.buy(t);// Tv구매
		System.out.println("현재 잔액: " + b1.money);
//	Computer c = new Computer();
		b1.buy(new Computer());// 컴퓨터구매
		b1.buy(new Audio());// 오디오구매

		
		
		
		
		
		
	}// main

}// class
