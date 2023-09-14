package p0914;

import java.util.ArrayList;

public class JA0914_10 {
	public static void main(String[] args) {
		Mem[] m = new Mem[5];
		m[0] = new Mem("aaa", "1111", "손승민", "서울", "010-9903-3947");
		m[1] = new Mem("bbb", "2222", "손현민", "부산", "010-9103-3947");
		m[2] = new Mem("ccc", "3333", "손왕민", "대구", "010-9303-3947");
		m[3] = new Mem("ddd", "4444", "손흥민", "인천", "010-9403-3947");
		m[4] = new Mem("eee", "5555", "손전민", "경기", "010-9603-3947");

		for (int i = 0; i < m.length; i++) {
			System.out.printf("[%s,%s,%s,%s,%s]\n", m[i].id, m[i].pw, m[i].name, m[i].address, m[i].phone);
		} // for

		ArrayList list = new ArrayList();
		list.add(new Mem("aaa", "1111", "손승민", "서울", "010-9903-3947"));
		list.add(new Mem("bbb", "2222", "손현민", "부산", "010-9103-3947"));
		list.add(new Mem("ccc", "3333", "손왕민", "대구", "010-9303-3947"));
		list.add(new Mem("ddd", "4444", "손흥민", "인천", "010-9403-3947"));
		list.add(new Mem("eee", "5555", "손전민", "경기", "010-9603-3947"));

		for (int i = 0; i < list.size(); i++) {
			Mem me = (Mem) list.get(i);
			System.out.printf("[%s,%s,%s,%s,%s]\n", me.getId(), me.getPw(), me.getClass(), me.getAddress(),
					me.getPhone());

		} // for

	}// main

}// class
