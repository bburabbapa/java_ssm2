import java.util.Scanner;

public class JA0901_06 {

	public static void main(String[] args) {

//		System.out.println(10/8);
//		System.out.println(10%8);

		Scanner scan = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		int result = num % 3; // 0 또는 1

		// 조건문
		if (result == 0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		System.out.println("입력한 숫자: " + num);

		// 8*2의2승 = 8<<2
		// 8/2의2승 = 8>>2

		// x=y - y를 x에 대입
		// x==y (같다) x!=y(다르다)

		//'0'(48)== 0 false 
		
		// 'A'(65)!=65 false
		
		// ||(or) 둘 중 하나라도 참이면 참
		//&&(and) 둘다 모두 참이어야함
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}