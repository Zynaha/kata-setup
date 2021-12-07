package parrot;

public abstract class Parrot {

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        
    }

    public abstract double getSpeed();
    
    public double getBaseSpeed() {
        return 12.0;
    }

}
