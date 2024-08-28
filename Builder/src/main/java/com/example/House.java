package com.example;

public class House {
    private String foundation;
    private String walls;
    private String roof;

    public String getHouseInfo() {
        StringBuilder result = new StringBuilder();
        result.append("Этот дом состоит из: ").append(System.lineSeparator())
                .append(foundation).append(System.lineSeparator())
                .append(walls).append(System.lineSeparator())
                .append(roof);
        return result.toString();
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }


}
