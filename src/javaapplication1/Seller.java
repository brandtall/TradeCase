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
public class Seller extends Person{
    protected ArrayList<Item> forSale = new ArrayList();
    protected ArrayList<Offers> offers = new ArrayList();

    public Seller(String name, String phoneNumber, String Address) {
        super(name, phoneNumber, Address);
    }
    public void addItemForSale(Item item) {
        forSale.add(item);
    }
    public void removeItemFromSale(Item item) {
        forSale.remove(item);
    }
    public void recieveOffer(Offers buyer) {
        offers.add(buyer);
    }
    public void sell(Offers buyer) {
        for (int i = 0; i < offers.size(); i++) {
            if(offers.contains(offers.get(i))) {
                offers.remove(offers.get(i));
            }
        }
    }

}
