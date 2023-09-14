package p0914;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JA0914_02 {

	public static void main(String[] args) {
		Date d = new Date();//객체선언
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yy-MM-dd hh시mm분ss초");		
		System.out.println(sdf3.format(d));
		
		Calendar cal  = Calendar.getInstance();//클래스명.메소드명();
//		Calendar c = new Calendar();//객체선언 ===에러
		System.out.println(sdf.format(cal.getTime()));
		
		

	}

}
