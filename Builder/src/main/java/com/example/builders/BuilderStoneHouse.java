package com.example.builders;

import com.example.House;
import com.example.components.house.stone.StoneFoundation;
import com.example.components.house.stone.StoneRoof;
import com.example.components.house.stone.StoneWalls;

public class BuilderStoneHouse implements Builder {

    private House house;

    @Override
    public Builder reset() {
        house = new House();
        return this;
    }

    @Override
    public Builder buildFoundation() {
        house.setFoundation(new StoneFoundation().getInfo());
        return this;
    }

    @Override
    public Builder buildWalls() {
        house.setWalls(new StoneWalls().getInfo());
        return this;
    }

    @Override
    public Builder buildRoof() {
        house.setRoof(new StoneRoof()   .getInfo());
        return this;
    }


    public House build() {
        house.getHouseInfo();
        return house;
    }
}
