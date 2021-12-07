package parrot;

public class Parrot {

    private ParrotTypeEnum type;
    private int numberOfCoconuts;
    private double voltage;
    private boolean isNailed;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public Parrot getNationalityParrot(String typeParrot) {
        switch (type) {
            case EUROPEAN:
                return new EuropeanParrot();
            /*case AFRICAN:
                return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
            case NORWEGIAN_BLUE:
                return (isNailed) ? 0 : getBaseSpeed(voltage);*/
            default:
                throw new RuntimeException("Should be unreachable");
        }
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }

    private double getBaseSpeed() {
        return 12.0;
    }
    public Double getSpeed(String typeParrot) {
    	Parrot parrot= getNationalityParrot(typeParrot);
    	return parrot.getSpeed();
    }

	

}
