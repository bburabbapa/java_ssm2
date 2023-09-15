package p0915_test;

public class JMethod {
	
	JMethod(){}

	int calculate(int n1,int n2) {//인스턴스메소드와 이름이 달라도 됨
	//입력받은 2개의 숫자를 사칙연산	
//		System.out.println("a: "+a);
//		System.out.println("b: "+b);
		int result = n1+n2;
		int result2 = n1-n2;
		int result3 = n1*n2;
		int result4 = n1/n2;
		//리턴으로 호출
		return result+result2+result3+result4;//void는 리턴이 불가
		                                      //int로 바꿔줘야함
	}
}//class
