
public class Tank extends GroundUnit implements Repairable  {

	Tank() {
		super(150); // 탱크의 객체선언시 체력을 150으로 만들어줌
		hitPoint = MAX_HP;
		name = "Tank";
	}

	@Override
	void move(int x, int y) {
		System.out.printf("%s: [x:%d, y:%d] 좌표로 이동!\n", name, x, y);
	}
}
