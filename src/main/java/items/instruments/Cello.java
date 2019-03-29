package items.instruments;

import items.interfaces.IPlay;
import items.interfaces.ISell;

public class Cello extends Instrument implements IPlay, ISell {

    public Cello(double costPrice, double retailPrice, String make, String model){
        super(costPrice, retailPrice, make, model, InstrumentType.STRINGS);
    }

    public String play(){
        return "Bach's Suite No.1 in B...";
    }

    public double calculateMarkup(){
        return this.getRetailPrice() - this.getCostPrice();
    }
}
