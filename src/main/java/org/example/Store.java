package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Store {
    @Getter@Setter
    public ArrayList<Flower> flowers;

    public Store(ArrayList<Flower> flList){
        setFlowers(flList);
    }
    public ArrayList<Flower> search(Flower fl){
        ArrayList<Flower> searchResult = new ArrayList<>();
        for (Flower flower: flowers){
            if (flower.getFlowerType()==fl.getFlowerType() &&
            flower.getColor()== fl.getColor() &&
            flower.getPrice() == fl.getPrice()){
                searchResult.add(flower);
            }
        }
        return searchResult;
    }
}
