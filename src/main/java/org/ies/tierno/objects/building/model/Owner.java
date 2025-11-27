package org.ies.tierno.objects.building.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;
@Data
@AllArgsConstructor
public class Owner {
    private String nif;
    private String name;
    private String surname;


    public void showInfo() {
        System.out.print(surname + ", " + name + " (" + nif + ")");
    }
}