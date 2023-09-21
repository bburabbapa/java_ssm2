import java.util.ArrayList;
import java.util.HashMap;

public class ColAction3 {
	String[] shape = {"Spade","Heart","Diamond","Clover"};
	ArrayList<StuScore> list = new ArrayList();
	ArrayList<Car> list2 = new ArrayList();
	HashMap<String, Object> map = new HashMap();
	
	
	//학생3명 리턴
//	ArrayList<Car> scoreAll() {
	HashMap<String, Object> scoreAll(){
		//3명
		list.add(new StuScore("홍길동",100,100,99));
		list.add(new StuScore("유관순",80,80,89));
		list.add(new StuScore("이순신",90,90,91));
		
		//3대
		list2.add(new Car("white",5));
		list2.add(new Car("red",4));
		list2.add(new Car("black",5));

//		return list2;
		return map;
	}
	
	
	
	
	
	
	
}//class
