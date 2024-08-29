package com.example.builders;

import com.example.House;

public interface Builder {
    Builder reset();

    Builder buildFoundation();

    Builder buildWalls();

    Builder buildRoof();
    House build();


}
