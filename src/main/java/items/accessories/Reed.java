package items.accessories;

import items.interfaces.ISell;

public class Reed extends Accessory implements ISell {

    public Reed(double costPrice, double retailPrice, String make, String model, AccessoryType accessoryType){
        super(costPrice, retailPrice, make, model, accessoryType);
    }

    public double calculateMarkup(){
        return this.getRetailPrice() - this.getCostPrice();
    }
}
