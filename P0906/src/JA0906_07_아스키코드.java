import java.util.Arrays;

public class JA0906_07_아스키코드 {

	public static void main(String[] args) {

		char ch0 = '0'; // 아스키코드 48번
		char ch1 = '9';
		System.out.println(ch1 - '0');
		System.out.println(ch0 - '0');
		System.out.println("'0' 아스키코드: " + (int) ch0); // 아스키코드: 48
		System.out.println("'2' 아스키코드: " + (int) ch1);

		char ch2 = 'A'; // 아스키코드: 65
		System.out.println((char) (ch2 + 32));

		char ch3 = 'a'; // 아스키코드: 97
		System.out.println((char) (ch3 - 32));

		int[][] score1 = new int[5][3];// 5행 3열의 2차원 배열을 생성한다

		int[] score = { 1, 2, 3, 4, 5 };
		int[] num = {1,2,3}; // 중괄호를 넣어야함 
		// 또는 == int [] num = new int [0]
		num = score; //주소를 복사 값을 복사한것은 아니다
		// num 값을 score 주소에 복사
		

		
		System.out.println(Arrays.toString(score));
		System.out.println("score: "+score);
		System.out.println("num: "+num);


		
		for (int j = 0; j < score.length; j++) {
			System.out.println(score[j]);

		}
		System.out.println(score);
		System.out.println(num);

		num[0] = 10000;
		System.out.println(num[0]);
		System.out.println(score[0]);

		
		
		
	}

}
