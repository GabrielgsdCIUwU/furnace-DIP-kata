package edu.estatuas.hardware;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.estatuas.interfaces.Heater;
import edu.estatuas.interfaces.Thermometer;
import edu.estatuas.types.RoomTemperature;

public class RegulatorTest {
    
    @Test
    public void testOffRegulator() {
        final double MIN_TEMP = 18.0;
        final double MAX_TEMP = 25.0;

        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(21.2);

        Thermometer thermometer = new RemoteCommandSensor();
        Heater heater = new GasHeater();

        Regulator regulator = new Regulator();
        regulator.regulate(thermometer, heater, MIN_TEMP, MAX_TEMP, temperature);

        assertEquals(21.2, temperature.getTemperature(), 0.01);
    }

    @Test
    public void testCoolingRegulator() throws Exception {
        final double MIN_TEMP = 18.0;
        final double MAX_TEMP = 25.0;

        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(48);

        Thermometer thermometer = new RemoteCommandSensor();
        Heater heater = new GasHeater();

        Regulator regulator = new Regulator();
        regulator.regulate(thermometer, heater, MIN_TEMP, MAX_TEMP, temperature);

        Thread.sleep(200);
        assertTrue(temperature.getTemperature() >= MIN_TEMP && temperature.getTemperature() <= MAX_TEMP);
    }

    @Test
    public void testHeatingRegulator() throws Exception {
        final double MIN_TEMP = 18.0;
        final double MAX_TEMP = 25.0;

        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(-20);

        Thermometer thermometer = new RemoteCommandSensor();
        Heater heater = new GasHeater();

        Regulator regulator = new Regulator();
        regulator.regulate(thermometer, heater, MIN_TEMP, MAX_TEMP, temperature);

        Thread.sleep(200);
        assertTrue(temperature.getTemperature() >= MIN_TEMP && temperature.getTemperature() <= MAX_TEMP);
    }
}
