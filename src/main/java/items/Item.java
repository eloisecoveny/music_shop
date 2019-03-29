package items;

public abstract class Item {

    private double costPrice;
    private double retailPrice;
    private String make;
    private String model;

    public Item(double costPrice, double retailPrice, String make, String model){
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
        this.make = make;
        this.model = model;
    }

    public double getCostPrice(){
        return costPrice;
    }

    public void setCostPrice(double costPrice){
        this.costPrice = costPrice;
    }

    public double getRetailPrice(){
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice){
        this.retailPrice = retailPrice;
    }

    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }
}
