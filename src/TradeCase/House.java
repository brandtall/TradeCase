/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TradeCase;

/**
 *
 * @author webya
 */
public class House extends Item {

    private String size;
    private String location;
    private String noOfRooms;
    private String noOfFloors;

    public House(String size, String location, String noOfRooms, String noOfFloors, String price, Seller Owner, String year, String condition) {
        super(price, Owner, year, condition);
        this.size = size;
        this.location = location;
        this.noOfRooms = noOfRooms;
        this.noOfFloors = noOfFloors;
    }

    public String getSize() {
        return size;
    }

    public String getLocation() {
        return location;
    }

    public String getNoOfRooms() {
        return noOfRooms;
    }

    public String getNoOfFloors() {
        return noOfFloors;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNoOfRooms(String noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public void setNoOfFloors(String noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    @Override
    public String toString() {
        return "House: " + size + ", " + location + ", " + noOfRooms + ", " + noOfFloors + ", " + getPrice() + "$, " + getYear() + ", " + getCondition() + ", " + getOwner() + ", " + getStatus();
    }
    
}
