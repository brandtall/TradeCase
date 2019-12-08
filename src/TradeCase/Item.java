/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TradeCase;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author webya
 */
public class Item {
    private String price;
    private Seller Owner;
    private String year;
    private String condition;
    private String status = "AVAILABALE";
    protected ImageIcon icon;
//    protected ArrayList<Offers> offersList;

    public Item(String price, Seller Owner, String year, String condition) {
        this.price = price;
        this.Owner = Owner;
        this.year = year;
        this.condition = condition;
    }

    public String getStatus() {
        return status;
    }

    public String getPrice() {
        return price;
    }

    public Seller getOwner() {
        return Owner;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
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
//    public void addOffer(Offers Off) {
//        offersList.add(Off);
//    }
    @Override
    public String toString() {
        return "Item{" +  "price=" + price + ", Owner=" + Owner + ", year=" + year + ", condition=" + condition + '}';
    }
    


    
}
