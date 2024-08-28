package com.example.builders;

import com.example.House;
import com.example.components.house.wooden.WoodenFoundation;
import com.example.components.house.wooden.WoodenRoof;
import com.example.components.house.wooden.WoodenWalls;

public class BuilderWoodenHouse implements Builder {
    private House house;

    @Override
    public void reset() {
        house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation(new WoodenFoundation().getInfo());
    }

    @Override
    public void buildWalls() {
        house.setWalls(new WoodenWalls().getInfo());
    }

    @Override
    public void buildRoof() {
        house.setRoof(new WoodenRoof().getInfo());
    }

    @Override
    public void getResult() {
        house.getHouseInfo();
    }

}
