package com.example;

import com.example.builders.Builder;

public class DirectorBuilderHouse {
    private Builder builder;

    public DirectorBuilderHouse(Builder builder) {
        this.builder = builder;
    }

    public void createHouse() {
        builder.reset();
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildRoof();
        builder.getResult();
    }

    public void createNewHouse(Builder builder) {
        this.builder = builder;
        createHouse();
    }
}
