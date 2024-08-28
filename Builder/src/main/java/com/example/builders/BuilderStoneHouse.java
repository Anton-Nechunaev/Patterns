package com.example.builders;

import com.example.House;
import com.example.components.house.stone.StoneFoundation;
import com.example.components.house.stone.StoneRoof;
import com.example.components.house.stone.StoneWalls;
import com.example.components.house.wooden.WoodenFoundation;
import com.example.components.house.wooden.WoodenRoof;
import com.example.components.house.wooden.WoodenWalls;

public class BuilderStoneHouse implements Builder {

    private House house;

    @Override
    public void reset() {
        house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation(new StoneFoundation().getInfo());
    }

    @Override
    public void buildWalls() {
        house.setWalls(new StoneWalls().getInfo());
    }

    @Override
    public void buildRoof() {
        house.setRoof(new StoneRoof().getInfo());
    }

    @Override
    public void getResult() {
        house.getHouseInfo();
    }
}
