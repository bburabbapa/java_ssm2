
public class KorPerson {
	KorPerson() {
	}

	KorPerson(String juminNo, String name) {
		this.juminNo = juminNo;
		this.name = name;

	}

	String juminNo;
	String name;

	@Override
	public boolean equals(Object obj) {// k2가 object임
		boolean temp = false;

		KorPerson k = (KorPerson) obj; // 형변환
		if (juminNo.equals(k.juminNo)) {
			temp = true;
		} else {
			temp = false;
		}
		return temp;
	}

	@Override
	public String toString() {
		return String.format("[%s,%s]", juminNo, name);
	}

}




