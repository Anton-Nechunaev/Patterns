package com.example;

import com.example.builders.Builder;
import com.example.builders.BuilderStoneHouse;
import com.example.builders.BuilderWoodenHouse;

public class Main {
    public static void main(String[] args) {
        Builder builderWooden = new BuilderWoodenHouse();  //Строитель деревянного дома
        Builder builderStone = new BuilderStoneHouse(); // Строитель каменного дома
        DirectorBuilderHouse director = new DirectorBuilderHouse(builderWooden); //Директор в конструкторе принимает строителя
        director.createHouse(); //Строит дом согласно переданному строителю
        director.createNewHouse(builderStone); //В параметре принимает нового строителя и сразу же строит дом.


    }
}