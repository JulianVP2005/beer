package com.hfad.beer;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();

        if (color.equals("light")) {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        } else if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else if (color.equals("brown")) {
            brands.add("Trouble Brown");
            brands.add("Cinnamon Bear");
        } else if (color.equals("dark")) {
            brands.add("Bell Weather Stout");
            brands.add("Blackbeard Porter");
        }

        return brands;
    }
}