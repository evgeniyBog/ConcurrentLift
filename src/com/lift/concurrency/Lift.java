package com.lift.concurrency;

/**
 * Created by Ievgen_Bogdanov on 06/04/2017.
 */
public class Lift {

    private int currentFloor;

    public Lift(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
}
