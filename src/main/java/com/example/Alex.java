package com.example;

import com.example.Feline;
import com.example.Lion;

import java.util.List;
import java.util.Arrays;

public class Alex extends Lion {

    private final List<String> friends = Arrays.asList("Марти", "Глория", "Мелман");
    private final String placeOfLiving = "Нью-Йоркский зоопарк";

    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends() {
        return friends;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }

    @Override
    public int getKittens() {
        return 0;
    }
}