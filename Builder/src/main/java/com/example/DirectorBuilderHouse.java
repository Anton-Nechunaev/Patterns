package com.example;

import com.example.builders.Builder;

public class DirectorBuilderHouse {
    private Builder builder;

    public DirectorBuilderHouse(Builder builder) {
        this.builder = builder;
    }

    public House createHouse() {
        builder.reset();
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildRoof();
        return builder.build();
    }

    public House createNewHouse(Builder builder) {
        this.builder = builder;
        return createHouse();
    }
}
