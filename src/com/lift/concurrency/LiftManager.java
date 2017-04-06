package com.lift.concurrency;

/**
 * Created by Ievgen_Bogdanov on 06/04/2017.
 */
public class LiftManager {
    private Lift lift;
    private int maxFloor;

    public LiftManager(Lift lift, int maxFloor) {
        this.lift = lift;
        this.maxFloor = maxFloor;
    }

    private void moveLiftUp() {
        if (lift.getCurrentFloor() < maxFloor) {
            lift.setCurrentFloor(lift.getCurrentFloor() + 1);
        }
    }

    private void moveLiftDown() {
        if (lift.getCurrentFloor() > 0) {
            lift.setCurrentFloor(lift.getCurrentFloor() - 1);
        }
    }

}
