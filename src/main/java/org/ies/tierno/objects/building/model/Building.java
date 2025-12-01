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

    public Integer countApartmentOwners(int floor, String door) {
        var apartment = findApartment(floor, door);
        if (apartment != null) {
            return apartment.getOwners().length;
        } else {
            return null;
        }
    }

    public void showFloorApartments(int floor){
        for(var apartment:apartments){
            if (apartment.getFloor()==floor){
                apartment.showInfo();
            }
        }
    }

    public Owner[] findOwners(int floor, String door){
        Apartment apartment= findApartment(floor, door);
        if (apartment==null){
            return null;
        } else{
            return apartment.getOwners();
        }
    }
    }
