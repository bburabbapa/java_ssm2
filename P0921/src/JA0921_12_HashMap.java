import java.util.ArrayList;
import java.util.HashMap;

public class JA0921_12_HashMap {

	public static void main(String[] args) {
		ColAction3 col3 = new ColAction3();
		HashMap<String, Object>map = col3.scoreAll();
		
		//StuScore
		ArrayList<StuScore> list =(ArrayList<StuScore>) map.get("list");
		for(int i=0;i<list.size();i++) {
			StuScore s = list.get(i);
			System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d\n",
					s.getStuNum(),s.getName(),s.getKor(),
					s.getEng(),s.getMath(),s.getTotal(),
					s.getAvg(),s.getRank());
		}//for
					
		//Car	
		ArrayList<Car> list2 = (ArrayList<Car>)map.get("list2");
		for (int i = 0; i < list.size(); i++) {
			Car c = list2.get(i);
			System.out.printf("%s,%d\n",c.getColor(),c.getDoor());
		}//for
		
		
		
		
		
		
	}//main

}//class
