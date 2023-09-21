
public class StuScore {
	static int count = 1;

	{
		stuNum = count;
		count++;

	}

	public StuScore() {

	}

	public StuScore(String name, int kor, int eng, int math, int stuNum) {
		super();
		this.stuNum = stuNum;
		this.Name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	
	}
	public StuScore(int stuNum, String name, int kor, int eng, int math) {
		super();
		this.stuNum = stuNum;
		this.Name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	



	private StuScore(int stuNum, String name, int kor, int eng, int math, int total, double avg, int rank) {
		super();
		this.stuNum = stuNum;
		Name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.rank = rank;
	}




	private int stuNum;
	private String Name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;

	public int getStuNo() {
		return stuNum;
	}

	public void setStuNo(int stuNo) {
		this.stuNum = stuNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
