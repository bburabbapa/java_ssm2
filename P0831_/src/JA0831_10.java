import java.util.Scanner;

public class JA0831_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		String id = scan.next(); // next():문자열 , nextInt():정수, nextDouble():실수
		System.out.println("아이디: " + id);

		System.out.println("패스워드를 입력하세요.");
		String pw = scan.next();
		System.out.println("패스워드: " + pw);

		System.out.println("국어점수를 입력하세요.");
		String kor = scan.next();
		System.out.println("국어점수: " + kor);

		System.out.println("토익점수를 입력하세요.");
		String toeic = scan.next();
		System.out.println("토익점수: " + toeic);

	}
}