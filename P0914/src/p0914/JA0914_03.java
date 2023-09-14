package p0914;

public class JA0914_03 {

	public static void main(String[] args) {
		Car c;
		FireEngine f1 = new FireEngine();
		System.out.println("[ f1기능 ]");
		f1.go();
		f1.stop();
		f1.water();

		c = f1; // c=(Car)f1; 형변환을 생략함
		Ambulance a1 = new Ambulance();
		c = a1;

		System.out.println("[ c기능 ]");
		c.go();
		c.stop();
//		c.water();//c에는 water()라는 공간은 있지만 c참조변수는 water()사용할 수 없음

		System.out.println("[ f2기능 ]");
		FireEngine f2;
		Ambulance a2;
		if (c instanceof FireEngine) {
			System.out.println("[ f2기능 ]");
			f2 = (FireEngine) c;
			f1.go();
			f1.stop();
			f1.water();
		}

		if (c instanceof Ambulance) {
			System.out.println("[ a1기능 ]");
			a2 = (Ambulance) c;
			a2.go();
			a2.stop();
			a2.siren();
		}

		a2 = (Ambulance) c; // FireEngine
		f2 = (FireEngine) c; // FireEngine 형변환 생략불가

		f2.go();
		f2.stop();
		f2.water();

	}

}
