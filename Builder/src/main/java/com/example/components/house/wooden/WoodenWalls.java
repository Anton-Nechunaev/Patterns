package com.example.components.house.wooden;

public class WoodenWalls {
    private int countWalls;
    private String info = "Деревянные стены в количестве: " + countWalls + "шт.";

    public WoodenWalls() {
        System.out.println("Созданы 4 деревянные стены");
    }

    public WoodenWalls(int count) {
        countWalls = count;
        System.out.println("Созданы деревянные стены в количестве: " + count + "шт.");
    }

    public WoodenWalls getWoodenWalls() {
        return this;
    }

    public String getInfo() {
        return info;
    }
}
