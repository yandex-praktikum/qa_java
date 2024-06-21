package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        if (kittensCount <= 0) {
            return 1; // Если число котят 0 или меньше, то вернуть 1
        } else {
            return kittensCount;
        }
    }

}
