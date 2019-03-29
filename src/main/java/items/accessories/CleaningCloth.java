package items.accessories;

import items.interfaces.ISell;

public class CleaningCloth extends Accessory implements ISell {

    public CleaningCloth(double costPrice, double retailPrice, String make, String model, AccessoryType accessoryType) {
        super(costPrice, retailPrice, make, model, accessoryType);
    }

    public double calculateMarkup(){
        return this.getRetailPrice() - this.getCostPrice();
    }
}
