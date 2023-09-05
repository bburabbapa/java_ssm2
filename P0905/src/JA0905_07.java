import java.util.Scanner;

public class JA0905_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 므한반복
//		int i = 0;
//		for(;;i++) {
//		 System.out.println(i);
//		}

		// 무한반복
//		int i = 0;
//		while(true) {
//			System.out.println(i);
//			i++;
//		}

		int random = (int) (Math.random() * 100) + 1;
		System.out.println("[숫자맞추기게임]");
		while (true) {
//			System.out.println("임시값: "+random);
			System.out.println("1부터 100사이의 숫자를 입력하세요");
			int num = scan.nextInt();
			if (random == num) {
				System.out.println("정답입니다");
				break;
			} else if (random > num) {
				System.out.println("입력한 숫자보다 큰수입니다.");
				System.out.println();
			} else {
				System.out.println("입력한 숫자보다 작은수입니다.");
			}

		}
		System.out.println("랜덤숫자: " + random);

		
		
		
		
		
		
		
	}

}
