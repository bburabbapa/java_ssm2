
public class JA0831_14 {

	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		// long c=a*b; 오버플로우 발생!! int*int=int
		long c = (long) a * b;
		System.out.println(c);// long*int=long*long

		long x = 1000000 * 1000000;
		long y = 1000000 * 1000000l;
		System.out.println(x);
		System.out.println(y);

		long num = (long) a * x / y;
		System.out.println(num);
		long num2 = (long) a / x * y;
		System.out.println(num2);

		a = a + b;
		a += b;

		a = a - b;
		a -= b;

		a = a * b;
		a *= b;

		a = a / b;
		a /= b;

		a = a & b;
		a &= b;

		a = a | b;
		a |= b;

		a = a >> b;
		a >>= b;
		a = a << b;
		a <<= b;
		a = a >>> b;
		a >>>= b;

	}

}
