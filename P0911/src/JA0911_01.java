
public class JA0911_01 {

	public static void main(String[] args) {
//		boolean char byte short int long float double 

		int num = 0;// 인스턴스변수
//		static int number   = 0; 클래스변수

		// 1. 기본형타입: 변수이름에 데이터를 직접 저장
		int a = 0;// 지역변수
		char ch = 'c';
		long l = 0;
		double d = 0.5;

		// 2. 배열 : 변수이름에 주소값을 저장
		int[] n = new int[3];
		// 배열의 []에 변수이름에 데이터를 직접 저장
		n[0] = 0;
		n[1] = 1;
		n[2] = 2;

		// 3. 객체선언 변수 이름에 주소값을 저장
		JA0911_01 j = new JA0911_01();

		// 객체의 변수이름에 데이터를 직접 저장
//		j.num = 0; 참조변수명.변수명

		
		
		//인스턴스변수: 객체선언 후 참조변수.인스턴스변수명
		//클래스변수: 객체선언 없이 클래스명.클래스변수명
		//지역변수: 메소드 블럭을 벗어나면 소멸 메소드 내에서 선언되며 종료와 함께 소멸
		
		
		
		
	}

}
