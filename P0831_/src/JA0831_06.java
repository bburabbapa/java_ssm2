
public class JA0831_06 {

	public static void main(String[] args) {
		int x = 2147483647;
		int total = 0;
		total = x + 5;

		System.out.println(total); // 오버플로우 x값보다 이상이 됨

		int a = 1000000;
		long b = 1000000l;
		System.out.println(a + b);
		System.out.println(a * b);// 오버플로우 x값보다 이상이 됨

		float f = 1.6f;

	}

}
