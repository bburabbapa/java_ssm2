import java.util.HashMap;

public class JA0921_08 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap();
		map.put("id", "aaa");
		map.put("page", "11");
		map.put("count", "105");
//      Iterator 를 사용하여 전체를 출력
//		Iterator it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

		System.out.println("아이디: " + map.get("id"));
		System.out.println("총 개수: " + map.get("count"));
		System.out.println("현재페이지수: " + map.get("page"));

	}// main

}// class
