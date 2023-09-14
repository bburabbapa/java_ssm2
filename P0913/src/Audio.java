
public class Audio extends Product {

	String SpeakerPower;

	Audio() {
		this("브릿지스피커7000", 200000, 2000, "15w");

	}

	Audio(String pName, int price, int bonusPoint, String SpeakerPower) {
		this.pName = pName;
		this.Price = price;
		this.bonusPoint = bonusPoint;
		this.SpeakerPower = SpeakerPower;
	}

}
