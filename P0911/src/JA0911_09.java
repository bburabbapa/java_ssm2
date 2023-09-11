
public class JA0911_09 {

	public static void main(String[] args) {
		Data d  =new Data();
		d.x = 10;
		System.out.println("d.x: "+d.x); //10
		System.out.println(d);//주소값
		change(d);
		System.out.println("두번째 d.x: "+d.x);//1000
		
		
	}

	
	static void change (Data d) {
		d.x = 1000;
		System.out.println("change x: "+d.x);
		
		
		
		
	}
	
	
	
}
