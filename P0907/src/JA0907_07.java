
public class JA0907_07 {

	public static void main(String[] args) {
		
		String str = "123";
		String str2 = "100";
		
		int no = Integer.parseInt(str2); // 문자열을 정수로 바꿈
		int no2 = Integer.parseInt(str2); 
		
		System.out.println("문자열 더하기: "+(str+str2));
		System.out.println("정수 더하기: "+(no+no2));
		
		String s = no+""; 
		
		 
		int start =1 ; 
		start = start + 1; //정수형 n에 1을 더해서 N방에 2를 입력
							// 100번 반복해도 1개의 방만 만들어짐
		
		s = s+"안녕"; //100번 반복하면 100개의 방이 만들어짐

		
		
		
		
		
		
		
		int[] num = { 1, 2, 3, 4, 5 };
	
		
		// 기본for문( 초기식;조건식;증감식)

		for (int i = 0; i < num.length; i++) {
			System.out.println(i + "번째 방: " + num[i]);
		} // for

		for (int i : num) {
			System.out.println(i);
		} // for

		
		//단순for문
		int n = 0;
		for (int i : num) {
			System.out.println(n + "번째 방: " + i);
			n++;
		} // for
		


	}// main

}// class



