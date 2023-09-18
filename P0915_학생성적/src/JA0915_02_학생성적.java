import java.util.Scanner;

public class JA0915_02_학생성적 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int stuCount = 1;
		String[] title = { "번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

		// 객체 선언
		StuAction stuAction = new StuAction();

		while (true) {
			// 메인화면 출력부분
			int choice = stuAction.mainPrint();

			switch (choice) {
			case 1:// 1. 학생성적입력메소드
				stuCount = stuAction.stuInput(stuCount);
				break;

			case 2:// 2. 학생성적출력메소드
				stuAction.stuOutput();
				break;
			case 3: // 3.학생성적수정메소드
				System.out.println();
				System.out.println("찾고자 하는 학생이름을 입력하세요.(0.이전페이지");
				String name = scan.next();
				if (name.equals("0")) { // 이전페이지로 이동
					System.out.println(">>이전페이지로 이동합니다!!");
					System.out.println();
					break;
				} // if

				// 손승민
				int count = 0;
				for (int i = 0; i < stuAction.list.size(); i++) {
					StuScore s = (StuScore) stuAction.list.get(i);
					if (name.equals(s.getName())) {
						count = i;
						System.out.printf("%s 학생을 찾았습니다.\n", name);
						System.out.println("[ 수정과목 선택 ]");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("=================================================");
						System.out.println("원하는 번호를 선택하세요.");
						choice = scan.nextInt();

						switch (choice) {
						case 1:
							System.out.println("[ 국어점수 ]");
							System.out.println("=============================================");
							System.out.println("현재점수: " + s.getKor());
							System.out.println("변경할 점수를 입력하세요");
							s.setKor(scan.nextInt());
							s.setTotal(s.getKor() + s.getEng() + s.getMath());
							s.setAvg(s.getTotal() / 3.0);
							System.out.println("국어점수가 변경되었습니다.");
							System.out.println();

							break;

						}// switch

					} // for
				} // for

			}// switch

		} // while

	}// main
}// class
