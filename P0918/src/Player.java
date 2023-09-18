
abstract public class Player {
	//현재 위치 저장 변수
	int currentPos;
	
	Player(){
		currentPos = 0;
	}
	abstract void play(int pos);
	abstract void stop();
	
	void play() {
		play(currentPos);//void play 추상메소드를 호출하는 것임
		
	}
	
	
	
}
