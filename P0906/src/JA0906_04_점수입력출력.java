import java.util.Scanner;

public class JA0906_04_점수입력출력 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		int[] arrKor = new int[5];
		int[] arrEng = new int[5];
		String[] name = new String[5];

		// 입력부분
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + " 번째 번호 입력: ");
			num[i] = scan.nextInt();
			System.out.println((i + 1) + "번째 이름입력: ");
			name[i] = scan.nextLine();
			System.out.println((i + 1) + "번째 국어점수입력: ");
			arrKor[i] = scan.nextInt();
			System.out.println((i + 1) + "번째 영어점수입력: ");
			arrEng[i] = scan.nextInt();
			scan.nextLine();
		} // for
		System.out.println("==========출력===========");
		// 츨력부분
		System.out.println("번호\t이름\t국어\t영어\n");
		System.out.println("----------------------------");
		System.out.printf("%d\t%s\t%d\t%d\n", num[0], name[0], arrKor[0], arrEng[0]);
		System.out.printf("%d\t%s\t%d\t%d\n", num[1], name[1], arrKor[1], arrEng[1]);
		System.out.printf("%d\t%s\t%d\t%d\n", num[2], name[2], arrKor[2], arrEng[2]);
		System.out.printf("%d\t%s\t%d\t%d\n", num[3], name[3], arrKor[3], arrEng[3]);

		for (int i = 0; i < 3; i++) {
			System.out.printf("%d\t %s\t %d\t %d\n", i + 1, num[i], name[i], arrKor[i], arrEng[i]);

		}

		
	}

}
