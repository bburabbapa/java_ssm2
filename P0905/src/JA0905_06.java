
public class JA0905_06 {

	public static void main(String[] args) {
		// 1부터 100까지의 순번과 합계를 for문으로 출력하시오
		// 1부터 100까지의 순번과 합계를 while문으로 출력하시오

//		int random = (int) (Math.random() * 100) + 1;
//
//		int i = 0;
//		int sum = 0;
//
//		for (i = 0; i <= 100; i++) {
//			sum = sum + i;
//			System.err.printf("순번: %d, 합계: %d \n", i, sum);
//		}
//	}


	
		
		
		int i = 0;
		int sum = 0;
		i = 1;
		while (i <= 100) {
			sum += i; // 현재 숫자를 합계에 더함
			System.out.printf("순번: %d, 합계: %d \n", i, sum);
			i++;
		}

//	        int sum3 = 0;
//	        int i3 = 1;
//	        while (i3<=100) {
//	        	sum = sum + i;
//	        	System.out.println("순번: "+i+", 합계: "+sum);
//	        	i++;

	}

}
