
public class JA0905_08 {

	public static void main(String[] args) {
		int i = -10;
//		while(i>0) {
//			System.out.println(i);
//			i--;
		do {
			System.out.println(i);
		} while (i > 0);

		int i2 = 0;
		int sum = 0;
		while (true) {
			if (sum > 100) {
				break;
			}
			System.out.println("i: "+i);
			System.out.println("sum: " + sum);

			i++;
			sum += i;
		}

		for (i = 1; i <= 100; i++) {
			System.out.println("i: "+i);
			System.out.println("sum: " + sum);
			if (sum > 100) {
				break;

			}

		}

		
		
		
		
		

	}

}
