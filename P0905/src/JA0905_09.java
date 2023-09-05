
public class JA0905_09 {

	public static void main(String[] args) {

//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			if (i % 3 == 0) {
//				continue;//반복문을 완전히 멈춤
////				break;  1번멈춤
//			}
//			System.out.println(i);
//		}

		for (int i = 2; i <= 9; i++) {
//			if(i%2==1) {		
//			}		
			System.out.printf("[%d 단]\n", i);
			for (int j = 1; j <= 9; j++) {
				if (j % 2 == 0) {
					continue;
				}
				System.out.printf("%d * %d = %d \n", i, j, i * j);
			}
		}

		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		
		
		
	}
}
