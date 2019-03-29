package items.accessories;

import items.interfaces.ISell;

public class Metronome extends Accessory implements ISell {

    public Metronome(double costPrice, double retailPrice, String make, String model, AccessoryType accessoryType) {
        super(costPrice, retailPrice, make, model, accessoryType);
    }

    public double calculateMarkup(){
        return this.getRetailPrice() - this.getCostPrice();
    }
}
