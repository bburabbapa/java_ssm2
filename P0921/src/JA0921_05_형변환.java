import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class JA0921_05_형변환 {

	
	public static void main(String[] args) {
//		ArrayList list = new ArrayList(); //싱글스레드로써 벡터보다는 많이 사용한다.
//		Vector list2 =  new Vector(); //벡터는 ArrayList와 비슷하지만 멀티스레드이다
//		
//		// set은 4개까지 list는 넣은 만큼 쭈욱!
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(1);
//		list.add(2);
//		list.add(5);
//		
//	for (int i = 0; i < list.size(); i++) {
//		System.out.println(list.get(i));
//	}
//		
		ArrayList<Card>list = new ArrayList();
		
		
		list.add(new Card(1,"spade"));
		list.add(new Card(2,"spade"));
		list.add(new Card(3,"spade"));
		list.add(new Card(4,"spade"));
		list.add(new Card(5,"spade"));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getKind());
			System.out.println(list.get(i).getNumber());
//			Card c = (Card)list.get(i);//형변환
//			System.out.println(list.get(i).getNumber()+","+list.get(i).getKind());//arrayList<Card>를 넣었기에 형변환필요가 없음
		}
		
		
		
		
		
	}
}
