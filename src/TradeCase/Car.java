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
public class Car extends Item{
    private String make;
    private String engineType;
    private String milage;

    public Car(String make, String engineType, String milage, String price, Seller Owner, String year, String condition) {
        super(price, Owner, year, condition);
        this.make = make;
        this.engineType = engineType;
        this.milage = milage;
    }

    public String getMake() {
        return make;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getMilage() {
        return milage;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setMilage(String milage) {
        this.milage = milage;
    }

    @Override
    public String toString() {
        return "Car: " + make + ", " + engineType + ", " + milage + ", " + getPrice() + "$, " + getYear() + ", " + getCondition() + ", "  + getOwner() + ", " + getStatus();
    }
    
    


    
}
