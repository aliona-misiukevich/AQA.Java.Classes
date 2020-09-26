package com.epam.classes.aqa;

import static com.epam.classes.aqa.BuildingType.Apartments;
import static com.epam.classes.aqa.BuildingType.IndustrialBuilding;

public class Main {

    public static void main(String[] args) {
        House house1 = new House(1, 100, 4, "Bakery", IndustrialBuilding, 50 );
        House house2 = new House(2, 13,  55, 5, 2, "Bakery", Apartments, 70 );
        House house3 = new House(3, 15,  86.5, 12, 3, "Bakery", Apartments, 70 );
        House[] houses = new House[] {house1, house2, house3};
        City city = new City(houses);

        city.printCity(city.getRequiredRoomQuantityAndFloor(3, 2, 15));

    }
}
