
public class JA0831_12 {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		j = ++i; // 전위형은 값이 참조되기 전에 증가한다
		// System.out.println(i); //6
		// System.out.println(j); //6

		int a = 5;
		int b = 0;
		a++;
		b = a;// 후위형은 값이 참조된 후에 증가된다 b=a++;(X) 대입연산잔를 함께 사용하지 말 것 분리해서 사용할 것
		// System.out.println(a); //6
		// System.out.println(b); //5

		int x = 5;
		int y = 0;
		int z = 5;
		x++; // 5+1=6
		y = x; // 6=6
		System.out.println(x == y);// true
		System.out.println(x != y);// false
		System.out.println(x != z);// true

		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);// 잘못된 등식 - 8가지 기본형 타입은 등가비교를 사용함
		System.out.println(str1.equals(str2));// 올바른 등식 - 참조변수는 equals 명령어 사용해야함

		boolean power = false;
		power = !power;

		int g = 3;
		++a;
		// System.out.println(g);

		int a1 = 3;
		int b1 = ++a1;
		// System.out.println(a1);
		// System.out.println(b1);

		int a2 = 3;
		int b2 = ++a1;
		// System.out.println(a1);
		// System.out.println(b1);

	}

}
