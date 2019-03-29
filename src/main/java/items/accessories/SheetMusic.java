package items.accessories;

import items.interfaces.ISell;

public class SheetMusic extends Accessory implements ISell {

    public SheetMusic(double costPrice, double retailPrice, String make, String model, AccessoryType accessoryType){
        super(costPrice, retailPrice, make, model, accessoryType);
    }

    public double calculateMarkup(){
        return this.getRetailPrice() - this.getCostPrice();
    }
}
