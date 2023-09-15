package p0915_test;

public class JMethod2 {

	JMethod2() {
	}

	int calculate(int a1, int a2, int a3, int a4) {
		int result = a1 + a2 + a3 + a4;
		int result2 = a1 * a2 * a3 * a4;

		return result + result2;

	}
	
	int calculate (int[]n) {
		int result = n[0]+n[1]+n[2]+n[3];
		int result2 = n[0]*n[1]*n[2]*n[3];
		
		return result + result2;
		
	}

}
