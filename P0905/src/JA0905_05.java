
public class JA0905_05 {

	public static void main(String[] args) {
//		int i = 10;
//		while (i >= 10) {
//			System.out.println(i);
//			i--;
//		}
//
//		for (i = 10; i >= 0; i--) {
//			System.out.println(i);
//		}
//      초기화는 while 문 안에 넣으면 안됨
//		int i =10;
//		while (i >= 0) {
//			System.out.println(i);
//			i--;
//		}
//
//		int i = 10;
//		while (i <= 10 && i >= 0) {
//			System.out.println(i);
//			i--;
//
//		}

//		for (int j = 2; j <= 9; j++) {
//			for (int k = 1; k <= 9; k++) {
//				System.out.printf("%d * %d = %d \n", j, k, j * k);
//			}
//
//		}

		// 구구단 while

		int i = 2; // 초기화
		while (i <= 9) { // 조건식
			int j = 1; // 초기화
			while (j <= 9) { // 조건식
				System.out.printf("%d * %d = %d \n", i, j, i * j);
				j++; // 증감식
			}
			i++;
		}

	}

}
