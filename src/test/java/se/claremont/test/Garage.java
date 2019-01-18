package se.claremont.test;

import java.util.Arrays;

public class Garage {

    Vehicle[] vehicles = new Vehicle[10];
    String address;

    public Garage(String address){
        this.address = address;
    }
    public void parkVehicle(int place, Vehicle vehicle){
        vehicles[place] = vehicle;
    }
    public Vehicle checkVehicle(int place){
        return vehicles[place];
    }

    public int getNumberOfCarsWithValueOver(int price){
        int numbersOfCars = 0;

        for (int i = 0; i <= vehicles.length - 1; i++) {

            if (vehicles[i] != null && vehicles[i].getPrice() > price) {
                numbersOfCars++;
            }
            //System.out.println(Arrays.toString(vehicles));
        }

        return numbersOfCars;
    }

}
//if (vehicles[0] != null && vehicles[0].getPrice() > 1000){
//            numbersOfCars++;
