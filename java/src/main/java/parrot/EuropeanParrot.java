package parrot;

public class EuropeanParrot extends Parrot {

	public EuropeanParrot() {
		super(ParrotTypeEnum.EUROPEAN, 0, 0, false);
	}
	public Double getSpeed() {
		return 12.0;
	}

}
