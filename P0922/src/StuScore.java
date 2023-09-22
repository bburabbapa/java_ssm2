
public class StuScore {

	static int count = 1;
	{ // 초기화블럭

		this.stuNum = count;
		count++;

	}

	StuScore() {
	} // 기본생성자

	StuScore(String name, int kor, int eng, int math) { // 4개의 매개변수
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;

	}

	public StuScore(int stuNum, String name, int kor, int eng, int math, int total, double avg, int rank) {
		super();// 전체생성자
		this.stuNum = stuNum;// 2번 stuNum이 입력됨
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.rank = rank;
	}

	private int stuNum;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
		setTotal(kor+eng+math);
		setAvg(total/3.0);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		setTotal(kor+eng+math);
		setAvg(total/3.0);
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;

		} else if (kor < 0) {
			this.kor = 0;

		} else {
			this.kor = 100;

		}
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		setTotal(kor+eng+math);
		setAvg(total/3.0);
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		setTotal(kor+eng+math);
		setAvg(total/3.0);
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
		setTotal(kor+eng+math);
		setAvg(total/3.0);
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
		setTotal(kor+eng+math);
		setAvg(total/3.0);
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
		setTotal(kor+eng+math);
		setAvg(total/3.0);
	}

	public void stuInput() {
		// TODO Auto-generated method stub

	}

	public void stuOutput() {
		// TODO Auto-generated method stub

	}

	public void stuFOpen() {
		// TODO Auto-generated method stub

	}

}
