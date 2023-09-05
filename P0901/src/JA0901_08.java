import java.util.Scanner;

public class JA0901_08 {

	public static void main(String[] args) {
//		//절댓값 삼항식
//		int x = -10;
//		int absX = x >= 0 ? x : -x; 
//		System.out.println("절댓값: "+ absX);
//		System.out.println("입력값: "+x);

//		// 두 수를 입력받아 큰 수를 출력하세요
//		Scanner scan = new Scanner(System.in);
//		System.out.println("첫번째 숫자를 입력하세요.");
//		int num1 = scan.nextInt();
//		System.out.println("두번째 숫자를 입력하세요.");
//		int num2 = scan.nextInt();
//
//		int result = (num1 >= num2) ? num1 : num2;
//		System.out.printf("첫번째 숫자: %d, 두번째 숫자: %d \n", num1, num2);
//		System.out.println("두 숫자 중 더 큰 수: " + result);

		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int num1 = scan.nextInt();
		String status = (num1 >= 60) ? "합격" : "불합격";
		System.out.println("합격여부: " + status);
		System.out.println("입력점수: " + num1);

		int score = 88;
		String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
		System.out.println("당신의 학점은: " + grade);

		int 점수 = 65; // 여기에 자신의 점수를 넣어주세요.

		if (점수 >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		System.out.println("점수를 입력하세요.");
		int num2 = scan.nextInt();
		String str = (score >= 60) ? "합격" : "불합격";
		System.out.println("합격여부 " + status);
		System.out.println("불합격여부 " + score);

		int i = 0;
		i = i + 1;
		i += 1;
		i++;
		++i;

		i = i - 1;
		i -= 1;
		i--;
		--i;

		i = i * 1;
		i *= 1;
		i = i / 1;
		i /= 1;

		
		

	}

}
