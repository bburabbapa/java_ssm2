
public class Product {
	static int count = 0; // 클래스변수
	int serialNo; // 인스턴스변수
	String pName;
	int price;

	{
		count++;
		serialNo = count;
	}
	
	Product() { // 기본생성자
	}

	Product(String pName) {
//		count++;
//		serialNo = count;
		this.pName = pName;
	}

	Product(String pname, int price) {
//		count++;
//		serialNo = count;
		this.pName = pName;
		this.price = price;

	}

}
