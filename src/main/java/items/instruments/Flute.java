package items.instruments;

import items.interfaces.IPlay;
import items.interfaces.ISell;

public class Flute extends Instrument implements IPlay, ISell {

    public Flute(double costPrice, double retailPrice, String make, String model){
        super(costPrice, retailPrice, make, model, InstrumentType.WOODWIND);
    }

    public String play(){
        return "Toooweeet tweeet twoooooo...";
    }

    public double calculateMarkup(){
        return this.getRetailPrice() - this.getCostPrice();
    }
}
