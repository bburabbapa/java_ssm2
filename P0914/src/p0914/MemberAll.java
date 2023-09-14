package p0914;

import java.util.ArrayList;

public class MemberAll {

	ArrayList list = new ArrayList();

	void memberRead() {
		// 객체선언 = 클래스참조변수 = new 클래스명
		Member m = new Member("aaa", "1111", "손승민", "서울", "010-9903-3947");
		list.add(m);
		Member m2 = new Member("bbb", "2222", "손흥민", "부산", "010-9403-3947");
		list.add(m2);
		Member m3 = new Member("ccc", "3333", "손형민", "대구", "010-9403-3947");
		list.add(m3);
		Member m4 = new Member("ddd", "4444", "손현민", "인천", "010-9603-3947");
		list.add(m4);
		Member m5 = new Member("eee", "5555", "손영민", "경기", "010-9703-3947");
		list.add(m5);

		return list;
	}
}
