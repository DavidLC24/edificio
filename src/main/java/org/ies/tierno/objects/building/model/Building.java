package org.ies.tierno.objects.building.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Objects;
@Data
@AllArgsConstructor
public class Building {
    private String address;
    private String city;
    private Apartment[] apartments;

    public Apartment findApartment(int floor, String door) {
        for (var apartment : apartments) {
            if (apartment.getFloor() == floor && apartment.getDoor().equals(door)) {
                return apartment;
            }
        }
        return null;
    }

    public void showInfo() {
        System.out.println("Edificio " + address + ", " + city);
        for (var apartment : apartments) {
            apartment.showInfo();
            System.out.println();
        }
    }

    public Owner countApartmentOwners(int floor, String door){
        for (
    }
}
