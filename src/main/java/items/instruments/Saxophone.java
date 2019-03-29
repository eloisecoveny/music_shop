package items.instruments;

import items.interfaces.IPlay;
import items.interfaces.ISell;

public class Saxophone extends Instrument implements IPlay, ISell {


    public Saxophone(double costPrice, double retailPrice, String make, String model){
        super(costPrice, retailPrice, make, model, InstrumentType.BRASS);
    }

    public String play(){
            return "Miles Davis...";
    }

    public double calculateMarkup(){
        return this.getRetailPrice() - this.getCostPrice();
    }
}
