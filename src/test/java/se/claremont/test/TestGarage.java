package se.claremont.test;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestGarage {

    @Test
    public void parkVehicle(){
        Garage myGarage = new Garage("Stureplan");
        Vehicle myVehicle = new Vehicle("Tesla", "Petrol Model");

        myGarage.parkVehicle(5,myVehicle);

        assertEquals(myVehicle, myGarage.checkVehicle(5));
    }
    //check price in garage
    @Test
    public void getNumberOfExpensiveVehicles(){
        Garage myGarage = new Garage("Stureplan");

        Vehicle myVehicle = new Vehicle("Tesla", "Petrol Model");
        myVehicle.setPrice(1100);
        myGarage.parkVehicle(3,myVehicle);

        Vehicle myVehicle2 = new Vehicle("BMW", "3310");
        myVehicle2.setPrice(900);
        myGarage.parkVehicle(1,myVehicle2);

     //   assertEquals(1,myGarage.getNumberOfCarsWithValueOver(1000));

    }

    @Test
    public void moveVehicle (){
        Garage myGarage = new Garage("Stockholm");

        Vehicle myVehicle = new Vehicle("Volvo", "Nuclear Model");
        myVehicle.setPrice(1100);
        myGarage.parkVehicle(2,myVehicle);

        Vehicle myVehicle2 = new Vehicle("Volkswagen", "DasAuto");
        myVehicle2.setPrice(900);
        myGarage.parkVehicle(1,myVehicle2);

    }


}

//Park a car and then check that the car is there.