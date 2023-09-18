
public class Marine extends GroundUnit{

	Marine () {
		super(60);
		hitPoint = MAX_HP;
		name = "Marine";
		
	}
	
	
	@Override
	void move(int x, int y) {
		System.out.printf("%s: [x:%d, y:%d] 좌표로 이동!\n",name,x,y);

	}

}
