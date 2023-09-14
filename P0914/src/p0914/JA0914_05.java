package p0914;

import java.util.ArrayList;

public class JA0914_05 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add("하이");
		list.add(5.4);
		Tv t = new Tv();
		list.add(t);
//		list.remove(5); //해당 삭제
		
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
	}

}
