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
}
