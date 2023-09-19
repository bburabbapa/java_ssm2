import java.util.Scanner;

public class JA0919_03_강의내용 {

	public static void main(String[] args) {
		// 컴파일에러: 컴파일할 때 발생하는 에러
		// 런타임에러: 실행할 때 발생하는 에러
		// ctrl+shift+del = 작업관리자 =세부정보 = PID번호 확인 후 작업끝내기!!
		// 예외: 수숩될 수 있는 다소 미약한 오류
		// 에러: 수습될 수 없는 심각한 오류
		// 예외처리: 예외 발생에 대비한 코드를 작성 try - catch
		Scanner scan = new Scanner(System.in);

		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("for문을 실행할까요?(1.예 2.아니오)");
		int choice = scan.nextInt();
		if (choice == 1) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i + 10);
				try {//예외가 발생이 될 것 같은 부분을 넣어줌
					System.out.println(10 / 0); // 0으로 나눠서 예외가 발생하여 try catch문을 넣음
				} catch (Exception e) {
					e.printStackTrace();//에러코드를 알려줌+
					System.out.println("예외가 발생하였지만 프로그램을 계속 진행합니다.");
				} // try-catch문의 끝
			} // for
		} // if
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");

	}// main

}// class
