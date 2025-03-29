package com.example;

import java.util.List;

public class Lion {

    private boolean hasMane;
    private final FelineInterface feline;  // Зависимость через интерфейс

    // Инъекция зависимости через конструктор
    public Lion(String sex, FelineInterface feline) throws Exception {
        if ("Самец".equals(sex)) {
            this.hasMane = true;
        } else if ("Самка".equals(sex)) {
            this.hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.feline = feline;
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}