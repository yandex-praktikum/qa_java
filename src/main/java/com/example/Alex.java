package com.example;

import java.util.List;

public class Alex extends Lion {

    public Alex() throws Exception {
        super("Самец");
    }

    public int getKittens() {
        return getKittens(0);
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский Зоопарк";
    }
}
