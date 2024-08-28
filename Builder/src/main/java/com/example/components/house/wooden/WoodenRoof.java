package com.example.components.house.wooden;

public class WoodenRoof {
    private String info = "Деревянная крыша";
    public WoodenRoof() {
        System.out.println("Создана деревянная крыша");
    }

    public WoodenRoof getWoodenRoof() {
        return this;
    }
    public String getInfo() {
        return info;
    }
}
