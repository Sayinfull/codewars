package ru.sayinfull.education.kyu8;

public class ObjectOrientedPiracy {
    private final double draft;
    private final int crew;

    public ObjectOrientedPiracy(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt() {
        double weightShip = draft - crew * 1.5;
        if (weightShip > 20) {
            return true;
        } else return false;
    }
}