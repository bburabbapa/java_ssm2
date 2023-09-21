import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class JA0921_07 {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		
//		list.add(0);
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		list.add(7);
//		list.add(8);
//		list.add(9);

////		list.remove(5);
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		for (int i = list.size()-1; i > 0; i--) {//0부터 거꾸로 모두 지우기
//			list.remove(i);
//		}
//		
//		System.out.println("===============================================");
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		// list: 순서o 중복o
		// set: 순서X 중복X
		// map: 순서x 중복(키x,값o)
		HashSet<String> set = new HashSet<String>();
		set.add("c");
		set.add("b");
		set.add("a");
		set.add("e");
		set.add("d");
		// Iterator 신버전: 콜렉션에 저장된 데이터를 접근하는데 사용되는 인터페이스 1회성임 한 번만 출력 가능
		
		Iterator<String>it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		} // while
		
		Iterator<String>it2 = set.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		} // while
		
		System.out.println("완료");
		
		
		ArrayList list = new ArrayList();

		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);

		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);

		//Iterator 구버전임 : 
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		} // while

	}// main

}// class
