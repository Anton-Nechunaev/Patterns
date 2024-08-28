package com.example.components.house.stone;

public class StoneFoundation {
    private String info = "Каменный фундамент";
    public StoneFoundation() {
        System.out.println("Создан каменный фундамент");
    }

    public StoneFoundation getStoneFoundation() {
        return this;
    }
    public String getInfo() {
        return info;
    }
}
