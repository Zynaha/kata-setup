package parrot;

public class NorwegianParrot extends Parrot {
    private double voltage;
    private boolean isNailed;
	public NorwegianParrot(double voltage, boolean isNailed) {
		super(ParrotTypeEnum.NORWEGIAN_BLUE, 0, voltage, isNailed);
		this.voltage=voltage;
		this.isNailed=isNailed;
	}

}
