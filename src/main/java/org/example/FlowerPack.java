package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public <T extends Flower> FlowerPack(T fl, int qua) {
        setFlower(fl);
        setQuantity(qua);
    }

    public int getPrice() {
        return (int) flower.getPrice()*quantity;
    }
}
