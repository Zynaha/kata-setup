package parrot;

public abstract class Parrot {

    public abstract double getSpeed();
    
    public double getBaseSpeed() {
        return 12.0;
    }

}

public interface IParrot {

    double getSpeed();

}

public class NorwegianParrot_ implements IParrot {

    private final BaseSpeed baseSpeed;

    public NorwegianParrot_() {
        this.baseSpeed = new BaseSpeed();
    }

    @Override
    public double getSpeed() {
        return /* faire mon calcul*/ 0;
    }
}


public class BaseSpeed {
    public double getBaseSpeed() {
        return 12.0;
    }
}