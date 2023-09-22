import java.util.ArrayList;
import java.util.HashMap;

public class JAction {

	// 리턴타입: int
//	int cal(int n1, int n2,int a) { //인스턴스메소드
//		 int result = n1 * n2;
//	        return result; // 곱셈 결과 리턴

	// 리턴타입: int배열
//	int[] cal(int n1, int n2) { // 인스턴스메소드
//		int[] result = new int[4];
//		result[0] = n1 + n2;
//		result[1] = n1 - n2;
//		result[2] = n1 * n2;
//		result[3] = n1 / n2;
//		return result; // 리턴1개만가능

	// 리턴타입: 객체
//	Car cal(String color, int door) { // 인스턴스메소드
//		Car c = new Car(color, door);
//		return c;
//	}

	// 리턴타입: list컬렉션프레임워크
//	ArrayList<Car> list = new ArrayList<Car>();
//	ArrayList<Car> cal(String [] color, int [] door) { // 인스턴스메소드
//		list.add(new Car(color[0],door[0]));
//		list.add(new Car(color[1],door[1]));
//		list.add(new Car(color[2],door[2]));
//		return list;
//	}

	// 리턴타입: mao컬렉션프레임워크

	ArrayList<Car> list = new ArrayList<Car>();
	ArrayList<StuScore> list2 = new ArrayList<StuScore>();
	HashMap<String, Object> map = new HashMap<String, Object>();

	HashMap<String, Object> cal(String[] color, int[] door, String[] name, int[] kor, int[] eng, int[] math) { // 인스턴스메소드
		list.add(new Car(color[0], door[0]));
		list.add(new Car(color[1], door[1]));
		list.add(new Car(color[2], door[2]));

		list2.add(new StuScore(name[0], kor[0], eng[0], math[0]));
		list2.add(new StuScore(name[1], kor[1], eng[1], math[1]));
		list2.add(new StuScore(name[2], kor[2], eng[2], math[2]));

		map.put("list", list);
		map.put("list2", list2);

		return map;
	}

}// class
