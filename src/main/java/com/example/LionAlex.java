package com.example;

import java.util.List;

public class LionAlex extends Lion {
    private Lion lion;

    private Feline feline;
    String sex;

    public LionAlex(Feline feline) {
        sex = "Самец";
        this.feline = feline;
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }

    @Override
    public boolean doesHaveMane(){
        return hasMane = true;
    }
}