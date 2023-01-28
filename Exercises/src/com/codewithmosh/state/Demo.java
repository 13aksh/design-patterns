package com.codewithmosh.state;

import com.codewithmosh.memento.Document;
import com.codewithmosh.memento.History;

public class Demo {
    public static void show() {
        var driving = new DirectionService(new Driving());
        var bicycling = new DirectionService(new Bicycling());
        var transit = new DirectionService(new Transit());
        var walking = new DirectionService(new Walking());

        driving.getEta();
        bicycling.getEta();
        transit.getEta();
        walking.getEta();

        driving.getDirection();
        bicycling.getDirection();
        transit.getDirection();
        walking.getDirection();
    }
}
