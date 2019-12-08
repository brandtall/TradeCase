/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TradeCase;

import java.util.ArrayList;

/**
 *
 * @author webya
 */
public class Buyer extends Person{
    ArrayList<Item> cart = new ArrayList();
    public Buyer(String name, String phoneNumber, String Address) {
        super(name, phoneNumber, Address);
    }

    public void addToCart(Item item) {
        cart.add(item);
    }
    public void checkout(Seller seller, Offers offer) {
        for (int i = 0; i < cart.size(); i++) {
            seller.addOffer(offer);
            cart.remove(i);
        }
    }
    
}
