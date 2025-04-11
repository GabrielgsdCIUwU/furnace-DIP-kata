package edu.estatuas.interfaces;

import edu.estatuas.types.RoomTemperature;

public interface Heater {
    void engage(RoomTemperature temperature);
    void disengage(RoomTemperature temperature);
}
