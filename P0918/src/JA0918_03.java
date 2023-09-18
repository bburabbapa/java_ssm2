
public class JA0918_03 {

	public static void main(String[] args) {
		Tank t = new Tank(); // 탱크1개
		System.out.println("탱크가 폭탄을 맞았습니다.");
		t.hitPoint -= 10;
		System.out.println("탱크가 폭탄을 맞음");
		t.hitPoint -= 10;
		System.out.println("총알을 맞음");
		t.hitPoint -= 2;
		System.out.println("탱크의 체력: " + t.hitPoint);
		Scv s = new Scv(); //SCV 한대
		Marine m = new Marine();//marine 한대
		s.repair(t); //탱크수리
		System.out.println("탱크의 체력: " + t.hitPoint);
		Dropship d = new Dropship();// 드랍쉽한대
		System.out.println("Dropship 총알맞음:");
		d.hitPoint -= 20;
		System.out.println("Dropship 체력: "+d.hitPoint);
		s.repair(d);//수송선수리
		System.out.println("Marine 총알 맞음");
		m.hitPoint -= 30;
		System.out.println("Marine 체력: "+m.hitPoint);
		//s.repair(m);
		System.out.println("Marine 체력: "+m.hitPoint);
		
		
		
	}

}
