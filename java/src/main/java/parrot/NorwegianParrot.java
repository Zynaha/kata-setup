package parrot;

public class NorwegianParrot extends Parrot {
    private double voltage;
    private boolean isNailed;
	public NorwegianParrot(double voltage, boolean isNailed) {
		super();
		this.voltage=voltage;
		this.isNailed=isNailed;
	}
	public double getSpeed() {
		 return (isNailed) ? 0 : getBaseSpeed(voltage);
	}
    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }
}
