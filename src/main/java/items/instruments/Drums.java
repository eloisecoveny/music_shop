package items.instruments;

import items.interfaces.IPlay;
import items.interfaces.ISell;

public class Drums extends Instrument implements IPlay, ISell {

    public Drums(double costPrice, double retailPrice, String make, String model){
        super(costPrice, retailPrice, make, model, InstrumentType.PERCUSSION);
    }

    public String play(){
        return "Bong bitter batter bong beep bong...";
    }

    public double calculateMarkup(){
        return this.getRetailPrice() - this.getCostPrice();
    }
}
