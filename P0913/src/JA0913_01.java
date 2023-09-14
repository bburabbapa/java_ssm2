
import java.text.SimpleDateFormat;
import java.util.*; //대체가능

//import java.util.Arrays;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.Scanner;

public class JA0913_01 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(a));
		java.lang.String str = new String("a"); // java.lang패키지는 생략가능
		// 날짜 객체
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
		System.out.println(sdf.format(today));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		System.out.println(sdf2.format(today));
		// 날짜 객체
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년mm월dd일 hh시mm분ss초");
		System.out.println(sdf3.format(cal.getTime()));

	}

}
