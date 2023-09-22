
public class JA0922_02_enum {

	public static void main(String[] args) {
//		kind = "HEART";
//		kind = "heart";
//		kind = "hEart";

//		String [] kind = { "Heart","HEART","heart","hEart"};
//		for (int i = 0; i < kind.length; i++) {
//			if(kind[i].equals("Heart")) {
//				System.out.println("♥");
//			}//if
//		}//for
		
		Week w = Week.FRIDAY;//객체선언
		String w2 = "FRIDAY";
		String weekName = w.name();//w 참조변수 데이터이름을 가져옴
		System.out.println(weekName);
		System.out.println(w.name());
		System.out.println(w2);
		
	}//main

}//class
