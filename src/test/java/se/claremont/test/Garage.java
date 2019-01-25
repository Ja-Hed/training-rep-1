package se.claremont.test;

import java.util.Arrays;
import java.util.List;

import static sun.rmi.transport.TransportConstants.Return;

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
/*
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

    public int getNumberOfCarsWithValueOver (int price){
        int numverOfCars = 0;
        List<Vehicle> apa = Arrays.asList(vehicles);

        Return (int)apa.stream()
                .filter(vehicle -> vehicle !=null)
                .filter(vehicle -> vehicle.getPrice() > price)
                .count();
    }
    public Vehicle getMostExpensiveVehicle(){

        Arrays.stream(vehicles)
                .filter(vehicle -> vehicle != null)
                .max((vehicle1, vehicle2) -> vehicle1.getPrice() - vehicle2.getPrice())
                .orElseThrow(() -> new RuntimeException("No vehicle found"));
        //.orElse(t:null);
        }

    }

*/
//if (vehicles[0] != null && vehicles[0].getPrice() > 1000){
//            numbersOfCars++;
}