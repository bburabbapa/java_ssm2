
public class JA0831_13_오버플로우 {

	public static void main(String[] args) {
		int a = 0;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		// System.out.println(a);

		int b = 10;
		int c = 10;
		b--;
		b--;
		--b;
		--b;
		--b;
		c = b--; // c=5 b=4
		c = b;
		// System.out.println(c);
		// System.out.println(b);

		boolean power = true;
		System.out.println(power);
		power = !power;// false !는 반대
		System.out.println(power);
		power = !power;// true !는 반대
		System.out.println(power);

		char ch = 'A';// 65
		char ch2 = 'a';// 97
		System.out.println(ch + ch2);
		System.out.printf("%c,%c\n", ch, ch2); // %c: 문자형출력

	}

}
