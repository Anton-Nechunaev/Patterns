package com.example.components.house.stone;

public class StoneRoof {
    private String info = "Каменная крыша";

    public StoneRoof() {
        System.out.println("Создана каменная крыша");
    }

    public StoneRoof getStoneRoof() {
        return this;
    }

    public String getInfo() {
        return info;
    }
}
