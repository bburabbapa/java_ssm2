import java.util.Scanner;

public class JA0907_09_학생성적연습 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int choice = 0;
//		int count = 0;
//		String[] subject = { "국어", "영어", "수학" };
//		String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균" };
//		int[] stuNo = new int[10]; //학생번호
//		String[] name = new String[10]; //이름
//		int[][] score = new int[10][3]; //점수
//		int[] total = new int[10]; //합계
//		double[] avg = new double[10]; //평균
//
//		loop:while (true) {
//			System.out.println("학생성적 프로그램");
//			System.out.println("1. 성적입력");
//			System.out.println("2. 성적출력");
//			System.out.println("3. 성적수정");
//			System.out.println("4. 종료");
//			System.out.println("번호입력");
//			choice = scan.nextInt();
//
//			switch (choice) {
//			case 1:
//
//				for (int i = count; i < 10; i++) {
//					stuNo[i] = count + 1;
//					System.out.println((count + 1) + "번째 이름 입력(이전화면:0번)");
//					name[i] = scan.next();
//					if (name[i].equals("0")) {
//						System.out.println();
//						break;
//					} // for
//					for (int j = 0; j < 3; j++) {
//						System.out.println(subject[j] + "점수 입력");
//						score[i][j] = scan.nextInt();
//
//					} // for
//					total[i] = score[i][0] + score[i][1] + score[i][2];
//					avg[i] = total[i] / 3.0;
//					count++;
//
//				} // for
//				System.out.println();
//				break;
//				
//			case 0: 
//				System.out.println("프로그램종료");
//				System.out.println();
//				break loop;
				
		int choice = 0;
		int count = 0;
		String [] subject = {"국어","영어","수학"};
		String [] title = {"학번","이름","국어","영어","수학","합계","평균"};
		int [] stuNo = new int [10];
		String [] name = new String [10];
		int [][] score = new int[10][3];
		int [] total = new int [10];
		double avg [] = new double [10];
				
		while(true) {
			for (int i = count; i < 10; i++) {
				stuNo[i] = count+i;
				System.out.println((count+1)+"번째 이름 입력(이전화면:0번");
				name[i] = scan.next();
				if (name[i].equals("0")) {
					System.out.println();
					break;
				}//for
				for (int j = 0; j < 3; j++) {
					System.out.println(subject[j]+"점수 입력");
					score[i][j] =scan.nextInt();
					
				}//for
				System.out.println();
				break;
				
		
			
			
			
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}//while
		
		
				
		}		
				
				
				


	}// main

}// class
