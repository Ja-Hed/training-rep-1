package se.claremont.test;

import java.security.acl.Owner;

public class Vehicle { //about what this class describes. Always big first letter
//Variables, right is what it is, ex string for text, int for number. right is name
    //not having "private" variables makes them available across the build. set them to private to make sure no one else can change them
    private String make;
    private String model;
    private String owner;
    private int price;

//methods. what can you do with the thing that the class describes. It can start, it can have a year
    //The method should return something, if it is not to return something. set it to void
    // the thing in the () is what you are supposed to return that value too.
    public void changeOwnership(String newOwner){
        owner = newOwner;
    }
    //because the variables above are private. this method is to publish the results so that we can use the test to very this
    public String getOwner(){
        return owner;
    }

    public Vehicle (String make, String model){ //This is a constructor.
        this.make = make;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int Price){
        this.price = Price;
    }


}
