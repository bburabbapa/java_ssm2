package p0914;

import java.util.ArrayList;
import java.util.Scanner;

public class JA0914_11_쇼핑몰 {
	Scanner scan = new Scanner(System.in);

	ArrayList list = new ArrayList();

	list.add(new Mem("aaa","1111","손승민","서울","010-9903-3947"));list.add(new Mem("bbb","2222","손현민","부산","010-9103-3947"));list.add(new Mem("ccc","3333","손왕민","대구","010-9303-3947"));list.add(new Mem("ddd","4444","손흥민","인천","010-9403-3947"));list.add(new Mem("eee","5555","손전민","경기","010-9603-3947"));

	System.out.println("[ 하이마켓 쇼핑몰 로그인 ]");
	String id = "";
	String pw = "";
	String name = "";

	loop:while(true)
	{
		System.out.println("아이디를 입력하세요.");
		id = scan.next();
		System.out.println("패스워드를 입력하세요.");
		pw = scan.next();

		int check = 0;
		for (int i = 0; i < list.size(); i++) {
			Member mm = (Member) list.get(i);
			if (id.equals(mm.getId()) && pw.equals(mm.getPw())) {
				System.out.println("로그인 되었습니다.");
				name = mm.getName();
				System.out.println();
				check = 1;
				break loop;
			}
		} // for

		// check = 1;
		if (check == 0) {
			System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
			System.out.println();
		}
	}// while

	Buyer b1 = new Buyer(id, name);
	int choice = 0;while(true)
	{
		System.out.println("[ 하이마켓 가전 쇼핑몰 ]");
		System.out.println("1. TV");
		System.out.println("2. 컴퓨터");
		System.out.println("3. 오디오");
		System.out.println("4. 세탁기");
		System.out.println("5. 현재잔액조회");
		System.out.println("9. 총구매목록");
		System.out.println("0. 프로그램종료");
		System.out.println("----------------");
		System.out.println("구매를 원하는 번호를 입력하세요.");
		choice = scan.nextInt();

		switch (choice) {
		case 1:
			 productBuy("TV",b1 );
			break;

		case 2:
			 productBuy("컴퓨터",b1 );
				break;
		case 3:
			 productBuy("오디오",b1 );
				break;
		case 4:
			 productBuy("세탁기",b1 );
				break;
				
		case 5:
			System.out.println("[ 잔액 조회 ]");
			System.out.println("---------------");
			System.out.printf("%s님 현재잔액 : %,d 원 \n", b1.name, b1.money);
			System.out.println();
			break;
		case 9:
			System.out.println("[ 금액 충전 ]");
			System.out.println("---------------");
			System.out.println("충전하려는 금액을 입력하세요.");
			int coin = scan.nextInt();
			//카드사 연결 url만 넣으면 됨.
			b1.money += coin;
			System.out.println("---------------");
			System.out.printf("충전 금액 : %,d 원 \n",coin);
			System.out.printf("충전후 잔액 : %,d 원 \n",b1.money);
			System.out.println("---------------");
			System.out.println();
			break;

		}// switch

	}// while
}//main
   		//void: 리턴타입이 없음 매개변수 2개
		static void productBuy(String pName,Buyer b1 ) {
			Scanner scan = new Scanner (System in);
			System.out.printf("[ TV 구매 ]\n",pName);
			System.out.println("결제를 진행할까요?(1.예 2.아니오)");
			int choice = scan.nextInt();
			if (choice==1) {
			int check = 0;
			if(pName.equals("TV"))
				check = b1.buy(new TV());
			else if (pName.equals("컴퓨터"))
				check = b1.buy(new Computer());
			else if (pName.equals("오디오"))
			check = b1.buy(new Audio());
			else if (pName.equals("세탁기"))
			check = b1.buy(new Washing());
					if  (choice == 0) return;
				System.out.printf("TV를 구매하셨습니다.",pName);
				b1.buy(new Tv());
				System.out.printf("구매후 잔액 : %,d 원 \n",b1.money);
				System.out.println();
			} else {
				System.out.printf("TV구매를 취소하셨습니다.",pName);
				System.out.println();
			}
			
			
			
			
		
		

		


	

}// class