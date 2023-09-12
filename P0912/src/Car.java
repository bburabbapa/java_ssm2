
public class Car {
	String color; // 인스턴스 변수
	String gearType;
	int door;

	Car() {// 기본생성자
		this("white", "auto", 5); // 다른생성자 호출시 사용
								//this()는 항상 첫째 줄에 사용
	}
	Car(Car c){
		this(c.color,c.gearType,c.door);//다른생성자호출
	}
	
//	Car (Car c){ //인스턴스의 복사를 위한 생성자(위에 문구와 같다)
//		color = c.color;
//		gearType = c.gearType;
//		door = c.door;
//	}
	

	Car(String color, String gearType, int door) {// 매개변수가 있는 생성자
		this.color = color;//인스턴스변수의 color를 가리키려면 this를 붙여준다
		this.gearType = gearType; //인스턴스변수의 gearType을 가리키려면 this를 붙여준다
		this.door = door;//인스턴스변수의 door를 가리키기위해 this를 붙여준다
	}

}
