package edu.estatuas.hardware;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.estatuas.interfaces.Heater;
import edu.estatuas.types.RoomTemperature;

public class GasHeaterTest {
    
    @Test
    public void testGasHeaterEngage() {
        Heater gasHeater = new GasHeater();

        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(20.0);

        gasHeater.engage(temperature);

        assertEquals(21, temperature.getTemperature(), 0.01);
    }

    @Test
    public void testGasHeaterDisengage() {
        Heater gasHeater = new GasHeater();

        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(20.0);

        gasHeater.disengage(temperature);
        
        assertEquals(19, temperature.getTemperature(), 0.01);
    }
}
