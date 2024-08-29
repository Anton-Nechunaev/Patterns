package com.example.builders;

import com.example.House;
import com.example.components.house.wooden.WoodenFoundation;
import com.example.components.house.wooden.WoodenRoof;
import com.example.components.house.wooden.WoodenWalls;

public class BuilderWoodenHouse implements Builder {
    private House house;

    @Override
    public Builder reset() {
        house = new House();
        return this;
    }

    @Override
    public Builder buildFoundation() {
        house.setFoundation(new WoodenFoundation().getInfo());
        return this;
    }

    @Override
    public Builder buildWalls() {
        house.setWalls(new WoodenWalls().getInfo());
        return this;
    }

    @Override
    public Builder buildRoof() {
        house.setRoof(new WoodenRoof().getInfo());
        return this;
    }

    public House build() {
        house.getHouseInfo();
        return house;
    }

}
