package P0922;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StuAction {
	Scanner scan = new Scanner(System.in);
	ArrayList<StuScore> list = new ArrayList<StuScore>();
	private String line;
	private char[] strData;

	void stuInput() {// 학생성적입력
		while (true) {
			int count = list.size()+1;
			System.out.println("학생성적입력");
			System.out.println(count + "번째 학생이름을 입력하세요.(0.이전페이지이동)");
			String name = scan.next();

			if (name.equals("0")) {
				System.out.println("이전페이지이동");
				break;
			} // if

			System.out.println("국어성적입력");
			int kor = scan.nextInt();
			System.out.println("영어성적입력");
			int eng = scan.nextInt();
			System.out.println("수학성적입력");
			int math = scan.nextInt();
			list.add(new StuScore(name, kor, eng, math));
			System.out.println("학생성적 저장완료");
			System.out.println();
		} // while
	}// stuInput

	void stuOutput() {// 학생성적출력
		System.out.println("학생성적출력");
		System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t순위\n");
		for (int i = 0; i < list.size(); i++) {
			StuScore st = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", 
					st.getStuNo(), st.getName(), st.getKor(),
					st.getEng(), st.getMath(), st.getTotal(), st.getAvg(), st.getRank());
		} // for
		System.out.println();
	}// stuOutput

	void stuUpdate() {
		while (true) {
			System.out.println("학생성적수정");
			System.out.println("수정할 이름 입력(0.이전페이지이동)");
			String inputName = scan.next();

			if (inputName.equals("0")) {
				System.out.println("이전페이지이동");
				System.out.println();
				break;
			}
			System.out.println("입력된 이름 검색 중.....");
			int i = 0;
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				StuScore st = list.get(i);
				if (inputName.equals(st.getName())) {
					System.out.println("입력된 이름으로 학생성적 수정완료");
					count = 1;
					break;
				} // if
			} // for

			if (count == 0) {
				System.out.println("학생 검색 불가. 재입력 요망 ");
				continue;
			} // if

			System.out.println("=================================");
			System.out.println("1. 국어점수");
			System.out.println("2. 영어점수");
			System.out.println("3. 수학점수");
			System.out.println(" 원하는 번호 입력 ");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("국어점수수정");
				System.out.println("현재국어점수: " + list.get(i).getKor());
				System.out.println("변경할 국어점수 입력");
				list.get(i).setKor(scan.nextInt());
				list.get(i).setTotal(list.get(i).getKor() + list.get(i).getEng() + list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal() / 3.0);
				System.out.println(list.get(i).getKor() + " 점으로 국어점수 수정완료");
				break;
			case 2:
				System.out.println("영어점수수정");
				System.out.println("현재영어점수: " + list.get(i).getEng());
				System.out.println("변경할 국어점수 입력");
				list.get(i).setEng(scan.nextInt());
				list.get(i).setTotal(list.get(i).getKor() + list.get(i).getEng() + list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal() / 3.0);
				System.out.println(list.get(i).getEng() + " 점으로 영어점수 수정완료");
				break;
			case 3:
				System.out.println("수학점수수정");
				System.out.println("현재수학점수: " + list.get(i).getMath());
				System.out.println("변경할 수학점수 입력");
				list.get(i).setMath(scan.nextInt());
				list.get(i).setTotal(list.get(i).getKor() + list.get(i).getEng() + list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal() / 3.0);
				System.out.println(list.get(i).getMath() + " 점으로 수학점수 수정완료");
				break;

			}// switch
		} // while
	}// stuUpdate

	void stuDelete() {
		System.out.println("학생성적삭제");
		System.out.println("삭제하려는 학생이름 입력");
		String name = scan.next();

		while (true) {
			System.out.println("학생성적수정");
			System.out.println("수정할 학생이름 입력(0.이전페이지이동)");
			String inputName = scan.next();

			if (inputName.equals("0")) {
				System.out.println("이전페이지이동");
				break;
			} // if
			System.out.println("입력된 이름으로 검색 중....");
			int i = 0;
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				StuScore st = list.get(i);
				System.out.println("입력된 이름으로 학생 검색완료");
				count = 1;
				break;

			} // for

			if (count == 0) {
				System.out.println("학생 검색 불가. 재입력 요망");
				continue;
			} // if
			System.out.println("1. 학생성적삭제");
			System.out.println("2. 학생성적삭제취소");
			System.out.println("원하는 번호 입력");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("학생성적삭제");
				System.out.println(inputName + " 학생성적삭제완료");
				list.remove(i);
				System.out.println();
				break;
			case 2:
				System.out.println("학생성적취소");
				System.out.println(inputName + " 학생성적취소완료");
				System.out.println();
				break;
			}// switch
		} // while
	}// stuDelete

	void stuNameSort() {
		Collections.sort(list, new Comparator<StuScore>() {
			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
	}// stuNameSort

	void stuTotalHighSort() {
		Collections.sort(list, new Comparator<StuScore>() {
			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s1.getTotal() - s1.getTotal();
			}
		});
	}// stuTotalHighSort

	void stuTotalLowSort() {
		Collections.sort(list, new Comparator<StuScore>() {
			@Override
			public int compare(StuScore s1, StuScore s2) {
				return s2.getTotal() - s1.getTotal();
			}
		});
		System.out.println("성적이 높은순 정렬이 완료되었습니다!!");

	}// stuTotalLowSort

	void stuFOpen() throws Exception {
		FileReader fr = new FileReader("c:/aaa/stu1.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			String[] data = line.split(",");
			int stuNo = Integer.parseInt(data[0]);
			String Name = data[1];
			int kor = Integer.parseInt(data[2]);
			int eng = Integer.parseInt(data[3]);
			int math = Integer.parseInt(data[4]);
			int total = Integer.parseInt(data[5]);
			double avg = Double.parseDouble(data[6]);
			int rank = Integer.parseInt(data[7]);
			list.add(new StuScore(stuNo, Name, kor, eng, math, total, avg, rank));
		} // while
		br.close();
		System.out.println("저장된 파일을 가져왔습니다!!");
		System.out.println();

	}// stuFOpen

	void stuFSave() throws Exception {
		FileWriter fw = new FileWriter("c:/aaa/stu1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String strData = "";

		for (int i = 0; i < list.size(); i++) {
			StuScore st = list.get(i);
			String line = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d", st.getStuNo(), st.getName(), st.getKor(),
					st.getEng(), st.getMath(), st.getTotal(), st.getAvg(), st.getRank());
			strData += line + "\r\n";
		} // for
		bw.write(strData);
		bw.close();
		System.out.println("학생성적을 파일에 저장했습니다!!");
		System.out.println();

	}// stuFSave

	void stuRank() {
		System.out.println("학생등수처리");
		list.size();
		int count = 1;
		for (int i = 0; i < list.size(); i++) {
			StuScore st1 = list.get(i);
			for (int j = 0; j < list.size(); j++) {
				StuScore st2 = list.get(i);
				if (st1.getTotal() < st2.getTotal())
					count = 1;

			} // for
			st1.setRank(count);
			System.out.println("1명의 학생 등수 처리완료");

		} // for
		System.out.println("학생성적등수처리완료");

	}// stuRank

}// class
