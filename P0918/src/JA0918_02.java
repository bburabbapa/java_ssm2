
public class JA0918_02 {

	public static void main(String[] args) {
		Unit []  group = new Unit[5]; //부모클래스
		group [0] = new Marine();
		group [1] = new Tank();
		group [2] = new Marine();
		group [3] = new Dropship();
		group [4] = new Tank();
	
		
		
		for (int i = 0; i < group.length; i++) {
			group [i].move(100,200);
			
		}
		
		
		
		
		
		
		
		
	
	}

}
