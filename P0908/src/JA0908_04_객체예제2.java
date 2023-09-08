
public class JA0908_04_객체예제2 {

	public static void main(String[] args) {
		// 학생성적프로그램

		
		StuScore s1 = new StuScore();
		s1.stuNo = 1;
		s1.name = "손승민";
		s1.kor = 100;
		s1.eng = 90;
		s1.math = 80;
		s1.total();
		s1.avg();

		StuScore s2 = new StuScore();
		s2.stuNo = 2;
		s2.name = "손흥민";
		s2.kor = 98;
		s2.eng = 100;
		s2.math = 80;
		s2.total();
		s2.avg();
		
		
		s2=s1; //s1의 내용을 s2로 복사
		
		

		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", s1.stuNo, s1.name, s1.kor, s1.eng, s1.math, s1.total,
				s1.avg);
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", s2.stuNo, s2.name, s2.kor, s2.eng, s2.math, s2.total,
				s2.avg);

		
		
		
	}

}




