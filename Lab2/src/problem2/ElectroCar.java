package problem2;

import java.util.Objects;

public class ElectroCar extends Car {

    private int chargeLevel;

    public ElectroCar() {
        super();
    }

    public ElectroCar(String name, String brand, int maxSpeed, int chargeLevel) {
        super(name, brand, maxSpeed);
        this.chargeLevel = chargeLevel;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    public String toString() {
        return super.toString() + " Charge level " + getChargeLevel();
    }

    public boolean equals(Object o) {
        if (!super.equals(o))
            return false;
        ElectroCar cr = (ElectroCar) o;
        return this.chargeLevel == cr.chargeLevel;
    }
    
    public int hashCode() {
        return Objects.hash(super.getName(), super.getBrand(), super.getMaxSpeed(), chargeLevel);
    }

}
