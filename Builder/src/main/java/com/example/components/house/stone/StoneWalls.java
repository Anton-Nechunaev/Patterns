package com.example.components.house.stone;

public class StoneWalls {
    private int countWalls;
    private String info = "Каменные стены в количестве:" +countWalls+ "шт.";
    public StoneWalls() {
        System.out.println("Созданы 4 каменные стены");
    }

    public StoneWalls(int count) {
        countWalls = count;
        System.out.println("Созданы каменные стены в количестве: "+count+ "шт.");
    }

    public StoneWalls getStoneWalls() {
        return this;
    }
    public String getInfo() {
        return info;
    }
}
