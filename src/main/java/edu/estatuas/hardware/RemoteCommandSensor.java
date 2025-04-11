package edu.estatuas.hardware;

import edu.estatuas.interfaces.Thermometer;
import edu.estatuas.types.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {
    
    @Override
    public double read(RoomTemperature temperature) {
        return temperature.getTemperature();
    }
}
