
public class JA0905_04 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.printf("[ %d 단 ] \t", i);
		}
		System.out.println();

		for (int i = 1; i <= 9; i++) {
//			System.out.printf("[%d 단] \t", i);
			for (int j = 2; j <= 9; j++) {
//				System.out.printf("%d * %d = %d \n", i, j, i * j);
//				System.out.print(i + "*" + j + "=" + (i * j)+" ");
				System.out.printf("%d * %d = %d\t", j, i, i * j);

			}
			System.out.println();

		}

	}
}

//		       for (int i = 2; i <= 9; i++) {
//		            for (int j = 2; j <= 9; j++) {
//		                System.out.print(j + " x " + i + " = " + (j * i) + "\t");
//		            }
//		            System.out.println(); // 다음 줄로 넘어감
//		        }
