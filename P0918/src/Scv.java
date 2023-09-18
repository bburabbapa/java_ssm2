

public class Scv extends GroundUnit implements Repairable{

	Scv() {
		super(40); // 탱크의 객체선언시 체력을 150으로 만들어줌
		hitPoint = MAX_HP;
		name = "Scv";
	}

	void repair(Repairable g) { //인터페이스 리페어러블로 바꿈
		if (g instanceof Unit) {
			Unit u = (Unit)g; // 형변환
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
		}

	}

	@Override
	void move(int x, int y) {
		System.out.printf("%s: [x:%d, y:%d] 좌표로 이동!\n",name,x,y);
	}

}
