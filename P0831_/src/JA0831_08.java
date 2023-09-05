
public class JA0831_08 {

	public static void main(String[] args) {
		int age = 20;
		String address = "서울특별시 은평구 불광동";
		// 당신의 나이는 20세, 사는 곳은 서울특별시 은평구 불광동 입니다."
		System.out.println("당신의 나이는 " + age + "세, 사는 곳은 " + address + " 입니다.");
		System.out.printf("당신의 나이는 %d, 사는 곳은 %s 입니다.\n", age, address);
		// 실수형값 %f . 정수형값 %d, 문자열값 %s 불리언형식 %b 문자 %c

		// 국어 영어 수학 평균 출력 소수점 둘째자리 까지 출력하시오

		int kor = 100;
		int eng = 100;
		int math = 99;
		int total = kor + eng + math;
		double avg = total / 3.0;
		System.out.println(avg);
		System.out.printf("평균: %.2f\n,avg");

		System.out.printf("%05.2f", 5.8);

		System.out.println("당신의 나이는 " + age + "세, 사는 곳은 " + address + "입니다.");
		System.out.printf("당신의 나이는 %d,사는 곳은 %s 입니다.\n", age, address);

		System.out.println("당신의 나이는 " + age + "세, 사는 곳은 " + address + " 입니다.");
		System.out.printf("당산의 나이는 %d세, 사는 곳은 %s 입니다.\n", age, address);

	}

}
