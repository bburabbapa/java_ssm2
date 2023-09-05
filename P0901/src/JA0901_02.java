import java.util.Scanner;

public class JA0901_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("학번을 입력하세요.");
		int number = scan.nextInt();// 엔터키 입력 받지 않음 =

		scan.nextLine();// 입력된 엔터키까지 적용
		System.out.println("이름을 입력하세요.");

		String name = scan.nextLine();// 엔터키까지 입력받음= 손 승민
		// String name=scan.next();//띄어쓰기가 불가함 믄장만 입력가능 = 손
		System.out.println("이름: " + name);

		System.out.println("국어점수를 입력하세요.");
		String k = scan.nextLine();// nextLine은 문자열을 입력받는 명령어
		int kor = Integer.parseInt(k);// 스트링을 int로 변경
		
		System.out.println("영어점수를 입력하세요.");
		String e = scan.nextLine();
		int eng=Integer.parseInt(e);//스트링을 int로 변경
		
		System.out.println("합계: " + (kor + eng));
		
		
		

	}

}
