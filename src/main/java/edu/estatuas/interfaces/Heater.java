package edu.estatuas.interfaces;

import edu.estatuas.types.RoomTemperature;

public interface Heater {
    void engage(RoomTemperature temperature);
    void disengage(RoomTemperature temperature);
    default void engage(RoomTemperature temperature, double increment) {
        engage(temperature);
    }
    default void disengage(RoomTemperature temperature, double decrement) {
        disengage(temperature);
    }
}
