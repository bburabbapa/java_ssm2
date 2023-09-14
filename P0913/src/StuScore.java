
public class StuScore {

	
	public StuScore() {} //기본생성자
	public StuScore(int stuNo, String name, int kor, int eng, int math) { //매개변수생성자              
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	

	private int stuNo;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}// class

//	public int getStuNo() {
//		return stuNo;
//
//	}
//
//	private void setStuNo(int stuNo) {
//		this.stuNo = stuNo;
//
//	}
//
//	public String getName() {
//		return name;
//
//	}
//
//	private void setName(String name) {
//		this.name = name;
//
//	}
//
//	public int getKor() {
//		return kor;
//
//	}
//
//	private void setKor(int kor) {
//		this.kor = kor;
//
//	}
//
//	public int geteng() {
//		return eng;
//
//	}
//
//	private void setEng(int eng) {
//		this.eng = eng;
//
//	}
//
//	public int getmath() {
//		return math;
//
//	}
//
//	private void setMath(int math) {
//		this.math = math;
//
//	}
//
//	public int getotal() {
//		return total;
//
//	}
//
//	private void setTotal(int total) {
//		this.total = total;
//
//	}
//
//	public double getAvg() {
//		return avg;
//
//	}
//
//	private void setAvg(double avg) {
//		this.avg = avg;
