
public class JA0913_07 {

	public static void main(String[] args) {
		FireEngine f1 = new FireEngine();
		f1.go();// car
		f1.stop();// car
		f1.water();// FireEngine
		
		Ambulance a1 = new Ambulance();
		a1.go(); // car
		a1.stop();// car
		a1.siren();// Ambulance

		// 다형성
		Car c1 = new FireEngine();
		c1.go();
		c1.stop();
//		c1.water(); //공간은 있으나 사용은 불가

		Car c2 = new Ambulance();
		c2.go();
		c2.stop();
//		c2.siren();// 자손의 메소드

		Car c3;
//		c3.water();// 공간이 있어도 참조변수로 사용할 수 없음
		c3 = f1;// 조상 참조변수 = 자손 참조변수

		FireEngine f2; //선ㅇ너
		f2 = (FireEngine) c3;
		System.out.println("f2: ");
		f2.water();

		Ambulance a2;
		FireEngine f3;
		if (c3 instanceof FireEngine) {
			System.out.println("c3는 FireEngine으로 형변환 가능합니다.");
			f3 = (FireEngine) c3;
			f3.water();
		}
		if (c3 instanceof Ambulance) {
			System.out.println("c3는 Ambulance로 형변환 가능합니다.");
			a2 = (Ambulance) c3;
			a2.siren();
		}

		Object o1;
		o1 = f1;
		o1 = a1;

//		a2 = (Ambulance)c3; // c3에는 FireEngine의 객체
//		a2.siren(); // 타입이 다르기에 컴파일시 에러

	}// main

}// class
