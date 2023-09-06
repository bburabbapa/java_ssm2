import java.util.Scanner;

public class JA0906_03_점수입력출력 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		int[] arrKor = new int[5];
//
//		for (int i = 0; i < arrKor.length; i++) {
//			System.out.println((i + 1) + "점수를 입력하세요: ");
//			arrKor[i] = scan.nextInt();
//		}
//		
//		
//		System.out.println("입력된 숫자: ");
//		for (int i = 0; i < arrKor.length; i++) {
//			System.out.println((i + 1) + "국어점수: " + arrKor[i]);
//		}

//			if(i==0) {
//				System.out.println(arrKor[i]);
//			}else {
//				System.out.println(","+arrKor[i]);
//			}
//			System.out.println();
//	
//		int[] arrKor = new int[5];
//
//		for (int i = 0; i < arrKor.length; i++) {
//			System.out.println("점수 입력: ");
//			arrKor[i] = scan.nextInt();
//
//		}
//
//		System.out.println("입력된 숫자: ");
//		for (int i = 0; i < arrKor.length; i++) {
//			System.out.println((i + 1) + "국어점수: " + arrKor[i]);
//
//		}

		String[] name = new String[10];
		int[] num = new int[10];
		int[] arrKor = new int[10];
		int[] arrEng = new int[10];
		int[] arrMath = new int[10];
		int[] total = new int[10];
		double[] avg = new double[10];
		int count = 0; // 입력된 학생의 변수

		// 입력부분
		for (int i = 0; i < name.length; i++) {
//			System.out.println((i + 1) + "번째 번호 입력: (중지:0번)");
//			num[i] = scan.nextInt();
			System.out.println((i + 1) + "번째 이름입력: (중지:0번)"); // "0" String
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
		System.out.println("=======================================================");
		// 츨력부분
		System.out.println();
		System.out.println("[ 학생 성적표 ]");
		System.out.println();
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("--------------------------------------------------------");
//		System.out.printf("%d\t%s\t%d\t%d\n", num[0], name[0], arrKor[0], arrEng[0],total[0], avg[0]);
//		System.out.printf("%d\t%s\t%d\t%d\n", num[1], name[1], arrKor[1], arrEng[1],total[1], avg[1]);
//		System.out.printf("%d\t%s\t%d\t%d\n", num[2], name[2], arrKor[2], arrEng[2],total[2], avg[2]);
//		System.out.printf("%d\t%s\t%d\t%d\n", num[3], name[3], arrKor[3], arrEng[3],total[3], avg[3]);

		for (int i = 0; i < count; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", (i + 1), name[i], arrKor[i], arrEng[i],
					arrMath[i], total[i], avg[i]);

		}//for

//		System.out.print("입력 국어점수: ");
//		for (int i = 0; i < 5; i++) {
//			if (i == 0) { // 쉽표 넣기
//				System.out.print(arrKor[i]);
//				continue;
//			}
//			System.out.print(", " + arrKor[i]);
//		}
//		System.out.println();
//		System.out.print("입력 영어점수: ");
//		for (int i = 0; i < 5; i++) {
//			if (i == 0) { // 쉽표 넣기
//				System.out.print(arrEng[i]);
//				continue;
//			}
//			System.out.print(", " + arrEng[i]);
//		}
//		System.out.println();
//		System.out.print("입력 이름: ");
//		for (int i = 0; i < 5; i++) {
//			if (i == 0) { // 쉽표 넣기
//				System.out.print(name[i]);
//				continue;
//			}
//			System.out.print(", " + name[i]);
//		}

	}

}
