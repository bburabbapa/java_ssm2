import java.util.Arrays;
import java.util.Scanner;

public class JA0907_04_복권당첨 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 주택복권 1조 12345
		// 0~9까지 조 00000-99999
		// 5번 1000원 45번 10000원 345번 1000000원 2345 10000000원 12345 3만원
		// 1의 12345번 1억

		// 1조 - 0~9

		int fNo = (int) (Math.random() * 9) + 1; // 1~9

		int sNo = (int) (Math.random() * 10000); // 0~99999

		// String.format ===포맷을 넣어서 스트링타입으로 변경
		String strNo = String.format("%05d", sNo);
		System.out.println(sNo);
		System.out.println(strNo);

		String winNo = fNo + "조" + strNo;
		System.out.printf("당첨번호: %s\n", winNo);
		// %d(정수) %f(실수) %s(문자열) %c(문자)

		
		System.out.printf("당첨번호: %s\n", winNo);
		System.out.println("조 단위를 입력하라.(1~9조까지)");

		int input1 = scan.nextInt();
		System.out.println("뒤에 5자리 입력하라.(00000-99999까지)");

		String input2 = scan.next();
		System.out.println("=============================");
		String inputNo = input1 + "조" + input2;
		System.out.println("입력번호: " + inputNo);
		System.out.printf("당첨번호: %s\n", winNo);

		int count = 0;
		if (inputNo.charAt(6) == winNo.charAt(6)) { count++;
			if (inputNo.charAt(5) == winNo.charAt(5)) { count++;
				if (inputNo.charAt(4) == winNo.charAt(4)) { count++;
					if (inputNo.charAt(3) == winNo.charAt(3)) { count++;
						if (inputNo.charAt(2) == winNo.charAt(2)) { count++;
							if (inputNo.charAt(0) == winNo.charAt(0)) { count++;
							}
						}
					}
				}
			}
		}

		if (count == 0) 
			System.out.println("꽝!!");
		else if (count == 1) 
			System.out.println("1개당첨! 1,000원당첨!");
		else if (count == 2) 
			System.out.println("2개당첨! 10,000원당첨!");
		else if (count == 2) 
				System.out.println("3개당첨! 100,000원당첨!");
		else if (count == 2) 
					System.out.println("4개당첨! 1,000,000원당첨!");
		else if (count == 2) 
						System.out.println("2개당첨! 100,000,000원당첨!");


	}// main

}
// class
