package shop;

import items.Item;
import items.interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private double till;
    private ArrayList<ISell> stock;

    public Shop(String name, double till){
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<ISell>();
    }

    public String getName(){
        return name;
    }

    public double getTill(){
        return till;
    }

    public ArrayList<ISell> getStock(){
        return stock;
    }

    public void buyStock(ISell item){
        this.stock.add(item);
    }

    public void remove(ISell item){
        int index = this.stock.indexOf(item);
        this.stock.remove(index);
    }

    public int countStock(){
        return this.stock.size();
    }

    public double calculateProfit(){
        double totalProfit = 0;
        for(int i = 0; i < countStock(); i++){
            totalProfit += this.stock.get(i).calculateMarkup();
        }
        return totalProfit;
    }

    public void sell(Visitor visitor, ISell item){
        this.remove(item);
        double payment = visitor.buy((Item) item);
        this.till += payment;
    }
}
