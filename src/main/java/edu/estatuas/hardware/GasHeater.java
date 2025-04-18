package edu.estatuas.hardware;

import edu.estatuas.interfaces.Heater;
import edu.estatuas.types.RoomTemperature;

public class GasHeater implements Heater {
    
    @Override
    public void engage(RoomTemperature temperature) {
        temperature.incrementTemperature(1);
    }

    @Override
    public void engage(RoomTemperature temperature, double increment) {
        temperature.incrementTemperature(increment);
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        temperature.decrementTemperature(1);
    }

    @Override
    public void disengage(RoomTemperature temperature, double decrement) {
        temperature.decrementTemperature(decrement);
    }
}
