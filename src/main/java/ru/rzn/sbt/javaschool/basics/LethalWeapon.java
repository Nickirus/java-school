package ru.rzn.sbt.javaschool.basics;

import java.util.Objects;

public class LethalWeapon {
    public String color;
    private int roundsLeft;
    private Double power;
    private static long nextSerial = 0;
    private final long serial;
    public void reload(int counterOfRoundsLeft) {
        roundsLeft+=counterOfRoundsLeft;
    }
    public void pewPew() {
        roundsLeft-=2;
    }
    public LethalWeapon() {

        serial = nextSerial;
        nextSerial++;


    }
    public LethalWeapon(String color, Double power , int roundsLeft) {
        this.color = color;
        this.power = power;
        this.roundsLeft = roundsLeft;

        serial = nextSerial;
        nextSerial++;

    }
    public long getSerial () {
        return serial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LethalWeapon that = (LethalWeapon) o;
        return roundsLeft == that.roundsLeft &&
                Objects.equals(color, that.color) &&
                Objects.equals(power, that.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, roundsLeft, power);
    }
}
