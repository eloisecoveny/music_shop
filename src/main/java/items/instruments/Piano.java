package items.instruments;

import items.interfaces.IPlay;
import items.interfaces.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    public Piano(double costPrice, double retailPrice, String make, String model){
        super(costPrice, retailPrice, make, model, InstrumentType.KEYBOARD);
    }

    public String play(){
        return "Chopin's Nocturne...";
    }

    public double calculateMarkup(){
        return this.getRetailPrice() - this.getCostPrice();
    }
}
