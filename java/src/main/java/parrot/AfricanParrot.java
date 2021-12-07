package parrot;

public class AfricanParrot extends Parrot {
	
    private int numberOfCoconuts;
	public AfricanParrot(int numberOfCoconuts) {
		super(ParrotTypeEnum.AFRICAN, numberOfCoconuts, 0, false);
	}
	public double getSpeed() {
		return Math.max(0, getBaseSpeed() - getLoadFactor() * this.numberOfCoconuts);
	}
    private double getLoadFactor() {
        return 9.0;
    }

}
