package items.accessories;

import items.Item;

public abstract class Accessory extends Item {

    private AccessoryType accessoryType;

    public Accessory(double salePrice, double retailPrice, String make, String model, AccessoryType accessoryType){
        super(salePrice, retailPrice, make, model);
        this.accessoryType = accessoryType;
    }

    public AccessoryType getAccessoryType(){
        return accessoryType;
    }

    public void setAccessoryType(AccessoryType accessoryType){
        this.accessoryType = accessoryType;
    }
}
