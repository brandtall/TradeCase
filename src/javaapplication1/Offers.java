/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author webya
 */
public class Offers {
    protected Item item;
    private String bid;
    private Buyer Buyer;

    public Offers(String bid, Buyer Buyer, Item item) {
        this.bid = bid;
        this.Buyer = Buyer;
        this.item = item;
    }

    public String getBid() {
        return bid;
    }

    public Buyer getBuyer() {
        return Buyer;
    }

    public void getBid(String bid) {
        this.bid = bid;
    }

    public void setBuyer(Buyer Buyer) {
        this.Buyer = Buyer;
    }

    @Override
    public String toString() {
        return "Offers: " + bid + ", " + Buyer + ", " + item.toString();
    }
    
}
