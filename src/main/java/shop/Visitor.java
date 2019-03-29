package shop;

import items.Item;

import java.util.ArrayList;

public class Visitor {

    private String name;
    private double purse;
    private ArrayList<Item> inventory;

    public Visitor(String name, double purse){
        this.name = name;
        this.purse = purse;
        this.inventory = new ArrayList<Item>();
    }

    public String getName(){
        return name;
    }

    public double getPurse(){
        return purse;
    }

    public double buy(Item item){
        this.inventory.add(item);
        double price = item.getRetailPrice();
        this.purse -= price;
        return price;
    }

    public int countInventory(){
        return this.inventory.size();
    }


}
