package edu.estatuas.hardware;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.estatuas.interfaces.Thermometer;
import edu.estatuas.types.RoomTemperature;

public class RemoteCommandSensorTest {
    
    @Test
    public void testGetTemperature() {
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(26.5);

        Thermometer heater = new RemoteCommandSensor();
        
        assertEquals(26.5, heater.read(temperature), 0.01);
    }
}
