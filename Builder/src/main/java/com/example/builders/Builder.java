package com.example.builders;

public interface Builder {
    void reset();

    void buildFoundation();

    void buildWalls();

    void buildRoof();

    void getResult();
}
