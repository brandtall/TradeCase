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
    private double bid;
    private Buyer Buyer;

    public Offers(double bid, Buyer Buyer) {
        this.bid = bid;
        this.Buyer = Buyer;
    }

    public double getBid() {
        return bid;
    }

    public Buyer getBuyer() {
        return Buyer;
    }

    public void getBid(double bid) {
        this.bid = bid;
    }

    public void setBuyer(Buyer Buyer) {
        this.Buyer = Buyer;
    }

    @Override
    public String toString() {
        return "Offers{" + "bid=" + bid + ", Buyer=" + Buyer + '}';
    }
    
}
