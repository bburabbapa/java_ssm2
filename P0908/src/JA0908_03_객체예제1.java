
public class JA0908_03_객체예제1 {

	public static void main(String[] args) {
		

		Tv t = new Tv(); 
		t.channel = 7;
		t.channel = 9;
		t.channelUp(); 
		t.channelUp();
		System.out.println(t.channel);

		
		t.color="white";
		t.color="black";
		System.out.println(t.color);
		System.out.println(t.power);
		t.power(); //false의 반대
		System.out.println(t.power);
		
		
		
		
		
	}// main

}// class
