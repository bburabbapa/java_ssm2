
public class Child extends Parent {
	
	int x = 20; // 인스턴스변수
	void method(int x) { // 인스턴스메소드
		
		
		System.out.println("x: " +x);
		System.out.println("this.x: " + this.x);
		System.out.println("super.x: " + super.x);
		

	
	}

}
