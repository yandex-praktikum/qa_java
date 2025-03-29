package com.example;

import java.util.List;

public interface FelineInterface {
    int getKittens();
    List<String> getFood(String type) throws Exception;
}