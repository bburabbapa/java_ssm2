import java.util.ArrayList;

public class JA0921_06 {

	public static void main(String[] args) {
//		ArrayList<Car> list = new ArrayList();

//		list.add(new Car("white", 5));
//		list.add(new Car("red", 5));
//		list.add(new Car("black", 5));
//		list.add(new Car("gray", 5));
//		list.add(new Car("blue", 4));
//
//		for (int i = 0; i < list.size(); i++) {
//			Car c = (Car) list.get(i);
//			System.out.println(list.get(i).getColor() + "," + list.get(i).getDoor());
//			System.out.println(list.get(i).getColor();
//			System.out.println(list.get(i).getDoor();
//		} // for

		ArrayList<Car> list = new ArrayList();
		list.add(new Car("Blue", 3));
		list.add(new Car("Blue", 4));
		list.add(new Car("Blue", 4));
		list.add(new Car("Blue", 4));
		list.add(new Car("Blue", 4));

//		for (int i = 0; i < list.size(); i++) {
//			Car c = (Car) list.get(i);
//			System.out.print(list.get(i).getColor());
//			System.out.println(list.get(i).getDoor());
//		}//for

		for (int i = 0; i < list.size(); i++) {
			Car c = list.get(i);
			System.out.print(c.getColor() + ", "); // 쉼표 추가
			System.out.println(c.getDoor());
		} // for

	}// main

}// class
