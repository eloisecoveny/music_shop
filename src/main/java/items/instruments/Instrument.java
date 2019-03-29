package items.instruments;

import items.Item;

public abstract class Instrument extends Item {

    private InstrumentType instrumentType;

    public Instrument(double costPrice, double retailPrice, String make, String model, InstrumentType instrumentType){
        super(costPrice, retailPrice, make, model);
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType(){
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType){
        this.instrumentType = instrumentType;
    }



}
