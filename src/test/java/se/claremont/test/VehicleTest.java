package se.claremont.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
//Unit test
public class VehicleTest {
//if something is red. ALT+Enter, then import class. in this ex. import org.junit.Test
    //If you add the @Test label with IntelliJ and Gradel get that this is a Test
    @Test
    //all test when doing it with JAVA are methods. Almost ALL should be "Void" because you are not supposed to return something
    public void changeOwnerOfVehicle(){
        //System.out.println("TEST!"); //this does nothing. It doesn't call the Vehicle code at all, just prints text
        //To the left. you create a "box". To the right you create a thing and place it in the box.
        Vehicle myVehicle = new Vehicle("Tesla", "Petrol Model"); //I create a object of this class. This is creating an instance
        myVehicle.changeOwnership("Volvo"); //in the tab it says what to enter. don't type out the hint
        //that above only runs through the motions. you don't validate anything
        assertEquals("Volvo", myVehicle.getOwner());    //Assert will give error. alt+enter for setting ex. org.junit.test

    }

}
