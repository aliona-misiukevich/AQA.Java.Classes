package com.epam.classes.aqa;


import java.util.ArrayList;
import java.util.List;

public class City {
    private House[] houses;

    public City(House[] houses) {
        this.houses = houses;
    }

    public City() {
       this(new House[0]);
    }

    public House[] getHouses() {
        return houses;
    }

    public void setHouses(House[] houses) {
        this.houses = houses;
    }

    public List<House> getRequiredRoomQuantity(int quantity) {
        List<House> filteredHouses = new ArrayList<>();
        for (House house:
             houses) {
            if (house.getRoomQuantity() == quantity) {
                filteredHouses.add(house);
            }
        }
        return filteredHouses;
    }

    public List<House> getRequiredRoomQuantityAndFloor(int quantity, int floorMin, int floorMax) {
        List<House> filteredHouses = new ArrayList<House>();
        for (House house:
             getRequiredRoomQuantity(quantity)) {
            if (house.getFloor() >= floorMin && house.getFloor() <= floorMax){
                filteredHouses.add(house);
            }
        }
        return filteredHouses;
    }

    public List<House> getSquareMoreThenRequired(double minSquare ) {
        List<House> filteredHouses = new ArrayList<>();
        for (House house:
             houses) {
            if(house.getSquare() > minSquare) {
                filteredHouses.add(house);
            }
        }
        return filteredHouses;
    }

    public void printCity(List<House> houses) {
        for (House house:
             houses) {
            System.out.println(house);
        }
    }
}
