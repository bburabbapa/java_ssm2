import java.util.ArrayList;
import java.util.HashMap;

public class JA0922_03_중요 {

	public static void main(String[] args) {
		int n1 = 1000;
		int n2 = 125;
		int a = 1;

		JAction j = new JAction();// 객체선언

		// 매개변수 2개를 리턴 배열로 받음
//		int[] result = j.cal(n1, n2);
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}

		// 매개변수 2개를 리턴 int 타입으로 받음
//		int result = j.cal(n1,n2,a);//매개변수로 값을 넘겨줌
//		System.out.println("곱셉결과값: "+result);

		// 매개변수 2개를 리턴 객체타입으로 받음
//		String color = "white";
//		int door = 5;
//		Car c = j.cal(color, door);
//			System.out.printf("%s,%d\n",c.getColor(),c.getDoor());		

		// 매개변수 2개를 리턴 list타입으로 받음
		String[] color = { "white", "red", "blue" };
		int[] door = { 5, 4, 5 };
//		ArrayList<Car> list = j.cal(color, door);
//		for (int i = 0; i < list.size(); i++) {
//			Car c = list.get(i);
//			System.out.printf("%s,%d\n", c.getColor(), c.getDoor());
//			System.out.println(c.getColor() + ", " + c.getDoor());
//		} // for

		// 매개변수 6개를 리턴map으로 받음
		String[] name = { "홍길동", "유관순", "이순신" };
		int[] kor = { 100, 90, 80 };
		int[] eng = { 90, 90, 80 };
		int[] math = { 80, 90, 80 };

		j.cal(color, door,name, kor, eng, math);

		HashMap<String, Object> map = new HashMap<String, Object>();

		ArrayList<Car> list = (ArrayList<Car>) map.get("list");
		for (int i = 0; i < list.size(); i++) {
			Car c = list.get(i);
//			System.out.printf("%s,%d\n", c.getColor(), c.getDoor());
			System.out.println(c.getColor() + ", " + c.getDoor());
		} // for

		ArrayList<StuScore> list2 = (ArrayList<StuScore>) map.get("list2");
		for (int i = 0; i < list2.size(); i++) {
			StuScore s = list2.get(i);
			System.out.println(s.getStuNum() + "," + s.getName() + "," + s.getKor() + ","
					+ s.getEng() + "," + s.getMath() + "," + s.getTotal() + "," + s.getAvg() + "," + s.getRank());
		} // for

	}// main

}// class
