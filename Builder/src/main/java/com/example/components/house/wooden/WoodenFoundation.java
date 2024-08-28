package com.example.components.house.wooden;

public class WoodenFoundation {
    private String info = "Деревянный фундамент";
    public WoodenFoundation() {
        System.out.println("Создан деревянный фундамент");
    }

    public WoodenFoundation getWoodenFoundation() {
        return this;
    }
    public String getInfo() {
        return info;
    }
}
