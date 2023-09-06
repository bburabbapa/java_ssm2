import java.util.Iterator;


public class JA0906_01_랜덤뽑기 {

	public static void main(String[] args) {

		int[] num = new int[50];// 0~49까지출력
		int[] random = new int[5];
		random[0] = (int) (Math.random() * 45);// 1~44
//		random = (int)(Math.random()*45)+1;//1~45
		random[2] = (int) (Math.random() * 45);
		random[3] = (int) (Math.random() * 45);
		random[4] = (int) (Math.random() * 45);
		random[5] = (int) (Math.random() * 45);

		for (int i = 0; i < 5; i++) {
			random[i] = (int) (Math.random() * 45);
		}

		for (int i = 0; i < num.length; i++) { // 0~50까지출력
			num[i] = i + 1; // 0번쨰 =0 1번째=1 ......
//			num[i] = 10*i; //0,10,20,30,40
//			num[i] = i+1; // 1~45 int값 45로 바꿈
			System.out.println("랜덤뽑기: " + num[random[0]]);
			System.out.println("랜덤뽑기: " + num[random[2]]);
			System.out.println("랜덤뽑기: " + num[random[3]]);
			System.out.println("랜덤뽑기: " + num[random[4]]);
			System.out.println("랜덤뽑기: " + num[random[5]]);
		}
		for (int i = 0; i < random.length; i++) {
			System.out.println(num[random[i]]); // 2n + 1 = 2 * n + 1

		}

		int n = 0;
		for (int i = 0; i < random.length; i++) {
			n = random[i];
			System.out.println("랜덤뽑기: " + num[n]);

		}

	}

}
