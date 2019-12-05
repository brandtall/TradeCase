/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author webya
 */
public class Item {
    private double price;
    private Seller Owner;
    private String year;
    private String condition;
    private ArrayList<Offers> offersList;

    public Item(double price, Seller Owner, String year, String condition) {
        this.price = price;
        this.Owner = Owner;
        this.year = year;
        this.condition = condition;
    }

    public double getPrice() {
        return price;
    }

    public Seller getOwner() {
        return Owner;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOwner(Seller Owner) {
        this.Owner = Owner;
    }

    public String getYear() {
        return year;
    }

    public String getCondition() {
        return condition;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
    public void addOffer(Offers Off) {
        offersList.add(Off);
    }
    @Override
    public String toString() {
        return "Item{" +  "price=" + price + ", Owner=" + Owner + ", year=" + year + ", condition=" + condition + '}';
    }
    


    
}
