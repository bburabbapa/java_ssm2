import java.util.Scanner;

public class JA0906_05_성적폼 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] name = new String[10];
//		int[] num = new int[10];
		int[] arrKor = new int[10];
		int[] arrEng = new int[10];
		int[] arrMath = new int[10];
		int[] total = new int[10];
		double[] avg = new double[10];
		int count = 0; // 입력된 학생의 변수

		loop: while (true) { // 무한반복
			System.out.println("[학생성적 프로그램]");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적수정");
			System.out.println("4.프로그램종료");
			System.out.println("-------------");
			System.out.println("원하는 번호를 입력하세요");
			int choice = scan.nextInt();
			scan.nextLine();

			switch (choice) {
			case 1:
				System.out.println("[[ 성적입력을 선택 ]]");
				System.out.println("----------------------------------");
				for (int i = count; i < name.length; i++) { // i=count 입력 시 0번부터가 아니라 입력된 숫자 이후로 출력
//					System.out.println((i + 1) + "번째 번호 입력: (중지:0번)");
//					num[i] = scan.nextInt();
					System.out.println((i + 1) + "번째 이름입력: (이전화면:0번)"); // "0" String
					name[i] = scan.nextLine();
					if (name[i].equals("0")) {
						System.out.println("입력을 중지합니다.");
						break;
					}
					System.out.println((i + 1) + "번째 국어점수입력: ");
					arrKor[i] = scan.nextInt();
					System.out.println((i + 1) + "번째 영어점수입력: ");
					arrEng[i] = scan.nextInt();
					System.out.println((i + 1) + "번째 수학점수입력: ");
					arrMath[i] = scan.nextInt();
					scan.nextLine();
					total[i] = arrKor[i] + arrKor[i] + arrMath[i];
					avg[i] = total[i] / 3.0;

					count++;
				} // for

				System.out.println("");

				break;
			case 2:
				System.out.println("[[성적출력을 선택]]");
				System.out.println("----------------------------------------");
				System.out.println();
				System.out.println("[ 학생 성적표 ]");
				System.out.println();
				System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\n");
				System.out.println("--------------------------------------------------------");
				for (int i = 0; i < count; i++) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", (i + 1), name[i], arrKor[i], arrEng[i],
							arrMath[i], total[i], avg[i]);

				} // for

				System.out.println();

			case 3:
				System.out.println("성적수정을 선택하셨습니다.");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}// switch

		} // while
	}// main

}//
