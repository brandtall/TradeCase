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
    protected ArrayList<Offers> offerList = new ArrayList();
    public Seller(String name, String phoneNumber, String Address) {
        super(name, phoneNumber, Address);
    }
    public void addItemForSale(Item item) {
        forSale.add(item);
    }
    public void removeItemFromSale(Item item) {
        forSale.remove(item);
    }
    public void addOffer(Offers offer) {
        offerList.add(offer);
    }
    public void sell(Offers offer) {
        for (int i = 0; i < offerList.size(); i++) {
            if(offerList.get(i).item.equals(offer.item)) {
                offerList.remove(i);
                forSale.get(forSale.indexOf(offer.item)).setStatus("SOLD");
                break;
            }
        }
    }

}
