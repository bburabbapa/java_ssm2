import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		// 아이디. 패스워드, 국어, 영어, 수학점수

		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		String id = scan.next();
		System.out.println("아이디 " + id);

		System.out.println("비밀번호를 입력하세요.");
		String pw = scan.next();
		System.out.println("비밀번호 " + pw);

		System.out.println("국어점수를 입력하세요.");
		String kor = scan.next();
		System.out.println("국어점수: " + kor);

		System.out.println("토익점수를 입력하세요.");
		String toeic = scan.next();
		System.out.println("토익점수: " + toeic);

	}

}
