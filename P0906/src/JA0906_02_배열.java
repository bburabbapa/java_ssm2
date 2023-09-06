import java.util.Scanner;

public class JA0906_02_배열 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int[] arrNum = new int[100];
//		int random = 0;
//		random = (int)(Math.random()*100)+1;

		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = i + 1;

		}
		System.out.println("입력된 숫자: ");
		
		for (int i = 0; i < arrNum.length; i++) {
			if (i == 0) {
				System.out.print(arrNum[i]);

			} else {
				System.out.print("," + arrNum[i]);
			}

		}
//		for (int i = 0; i < arrNum.length; i++) {
//			if(i==0) {
//				System.out.print(arrNum[i]);
//				continue;
	}

}
