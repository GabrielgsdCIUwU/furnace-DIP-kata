package edu.estatuas.other;

import edu.estatuas.interfaces.Heater;
import edu.estatuas.types.RoomTemperature;

public class Jedi implements Heater {
    private String name;

    private static final double TEMPERATURE = 1400; // 1400 degrees Celsius

    public Jedi(String name) {
        this.name = name;
    }

    @Override
    public void engage(RoomTemperature temperature) {
        temperature.incrementTemperature(toucheLightSable());
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        temperature.decrementTemperature(forcePersuasion());
    }

    private double toucheLightSable() {
        return TEMPERATURE;
    }

    private double forcePersuasion() {
        // Use the Force to persuade the heater to disengage
        return TEMPERATURE;
    }

    public void speak() {
        System.out.println("\n"
                + "\t  __.-._   \n"
                + "\t  '-._\"7' \n"
                + "\t   /'.-c   \n"
                + "\t   |  /T   \n"
                + "\t  _)_/LI   \n"
                + "\nDo or do not. There is no try "
                + "\n" + this.name);
    }
}
