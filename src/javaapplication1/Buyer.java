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
public class Buyer extends Person{
    ArrayList<Item> cart;
    private double bid;
    public Buyer(String name, String phoneNumber, String Address) {
        super(name, phoneNumber, Address);
    }

    public void addToCart(Item item) {
        cart.add(item);
    }
    public void checkout() {
        for (int i = 0; i < cart.size(); i++) {
            Offers offer = new Offers(bid, this);
            cart.get(i).addOffer(offer);
        }
    }
    
}
