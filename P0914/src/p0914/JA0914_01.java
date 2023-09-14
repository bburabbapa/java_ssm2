package p0914;

public class JA0914_01 {

	public static void main(String[] args) {

		//1. 기본생성자호출해서 값을 입력하는 방법
		StuScore s1 = new StuScore();
		s1.setStuNo(1);
		System.out.println("학생번호: "+s1.getStuNo());
//		s1.setName("손승민");
//		s1.setKor(100);
//		s1.setEng(100);
//		s1.setMath(100);
//		s1.setTotal(s1.getKor() + s1.getEng() + s1.getMath());
//		s1.setAvg(s1.getTotal() / 3.0);

		//2. 전체 매개변수 생성자
//		StuScore s2 = new StuScore(1,"손승민",100,100,100);
//		System.out.println("학생번호: "+s2.getStuNo());
		
		//3. 2개 매개변수 생성장
//		StuScore s1 = new StuScore(1, "손승민");
//		s1.setKor(100);
//		s1.setEng(100);
//		s1.setMath(100);

	}// main

}// class
