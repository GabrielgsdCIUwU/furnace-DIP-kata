package edu.estatuas.main;

import edu.estatuas.hardware.GasHeater;
import edu.estatuas.hardware.Regulator;
import edu.estatuas.hardware.RemoteCommandSensor;
import edu.estatuas.interfaces.Heater;
import edu.estatuas.interfaces.Thermometer;
import edu.estatuas.other.Jedi;
import edu.estatuas.types.RoomTemperature;

public class App {
    public static void main(String[] args) {
        
        final double MIN_TEMP = 15.0;
        final double MAX_TEMP = 21.0;

        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(-5.0);

        Thermometer thermometer = new RemoteCommandSensor();
        Heater heater = new GasHeater();

        Regulator regulator = new Regulator();

        System.out.println("Arrancando...");
        regulator.regulate(thermometer, heater, MIN_TEMP, MAX_TEMP, temperature);

        temperature = RoomTemperature.getInstance();
        Jedi yoda = new Jedi("Yoda");
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, MIN_TEMP, MAX_TEMP, temperature);
        yoda.speak();

        System.out.println( "\nArrancando a Grogu: " );
        Heater grogu = new Jedi("Grogu");
        ((Jedi)grogu).speak(); // Without casting, it will not work
        
    }
}
