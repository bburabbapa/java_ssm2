
public class JA0919_02_equals {

	public static void main(String[] args) {
		KorPerson k1 = new KorPerson("880001-1210212","손승민");
		KorPerson k2 = new KorPerson("880001-1210212","손승민");
		KorPerson k3 = new KorPerson("920001-1321112","손흥민");
		
		if(k1.equals(k2)) {
			System.out.println("k1과 k2는 같은 사람입니다.");
			
			
		}else {
			System.out.println("k1과 k2는 다른 사람입니다.");
		}
		System.out.println(k1);
		System.out.println(k2);
		System.out.println("=======================================");
		if(k1.equals(k3)) {
			System.out.println("k1과 k2는 같은 사람입니다.");
			
			
		}else {
			System.out.println("k1과 k2는 다른 사람입니다.");
		}
		System.out.println(k1);
		System.out.println(k3);
		System.out.println("=======================================");
		String str1 = "손승민";
		String str2 = "손승민";
		String str3 = "손흥민";
		if(str1.equals(str2)) {
			System.out.println("k1과 k2는 같은 사람입니다.");
			
			
		}else {
			System.out.println("k1과 k2는 다른 사람입니다.");
		}
		System.out.println(str1);
		System.out.println(str2);
		if(str1.equals(str3)) {
			System.out.println("k1과 k2는 같은 사람입니다.");
			
			
		}else {
			System.out.println("k1과 k2는 다른 사람입니다.");
		}
		System.out.println(str1);
		System.out.println(str3);
	}

}
