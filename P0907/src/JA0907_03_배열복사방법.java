import java.util.Arrays;
import java.util.Scanner;

public class JA0907_03_배열복사방법 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		


		int[] num = { 1, 2, 3, 4, 5 };//1,2,3,4,5
		int[] score = new int[5]; // 0,0,0,0,0

		
		
		// score =num; ==== num을 score에 넣은 얕은복사임 이렇게 하지마라
		// 1. 배열복사방법
		for (int i = 0; i < num.length; i++) {
			score[i] = num[i];
		}

	
		
		// 2. 배열복사방법 arraycopy메소드를 사용 데이터값 전체를 다른장소에 복사
		//(1) 원본배열 (2) 위치 (3) 복사대상배열 (4) 위치 (5) 복사개수
		
		//System.arraycopy(num, 1, score, 0, 3);
		


		num[0] = 10;
		System.out.println(Arrays.toString(num)); // 안에 있는 명령어를 모두 보여줌
		System.out.println(Arrays.toString(score));

//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score.length; j++) {
//				score [i][j] = i+1;

		
		
		
		
		
		
		
		
		
	}

}
