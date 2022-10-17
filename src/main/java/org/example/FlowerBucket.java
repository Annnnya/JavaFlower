package org.example;

import lombok.Getter;

import java.util.ArrayList;

public class FlowerBucket {
    @Getter
    private ArrayList<FlowerPack> packs;
    @Getter
    public int price = 0;
    public void add(FlowerPack flowerPack) {
        packs.add(flowerPack);
        price += flowerPack.getPrice();
    }

}
