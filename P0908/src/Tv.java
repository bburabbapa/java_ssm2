
public class Tv {
	
	//클라스 선언

	
	String color; //색깔
	boolean power;//전원상태
	int channel;//채널

	void power() {
		power = !power; //전원스위치 on.off
	}

	void channelUp() {
		channel++; //채널 높이기
	}

	void channelDown() {
		channel--; //채널 낮추기
	}

}
