package edu.estatuas.types;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoomTemperatureTest {
    
    @Test
    public void testRoomTemperature() {
        RoomTemperature temperature = RoomTemperature.getInstance();
        
        double expectTemperature = 25.2;

        temperature.setTemperature(expectTemperature);

        assertEquals(expectTemperature, temperature.getTemperature(), 0.01);
    }

    @Test
    public void testIncrementTemperature() {
        RoomTemperature temperature = RoomTemperature.getInstance();

        temperature.setTemperature(16.2);

        temperature.incrementTemperature(2.3);

        assertEquals(18.5, temperature.getTemperature(), 0.01);
    }

    @Test
    public void testDecrementTemperature() {
        RoomTemperature temperature = RoomTemperature.getInstance();

        temperature.setTemperature(16.2);

        temperature.decrementTemperature(2.2);

        assertEquals(14.0, temperature.getTemperature(), 0.01);
    }
}
