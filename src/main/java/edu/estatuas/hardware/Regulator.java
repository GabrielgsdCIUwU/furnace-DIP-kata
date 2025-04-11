package edu.estatuas.hardware;

import edu.estatuas.interfaces.Heater;
import edu.estatuas.interfaces.Thermometer;
import edu.estatuas.types.RoomTemperature;

public class Regulator {

    public void regulate(Thermometer thermometer, Heater heater, double MIN_TEMP, double MAX_TEMP,
            RoomTemperature temperature) {

        while (thermometer.read(temperature) < MIN_TEMP || thermometer.read(temperature) > MAX_TEMP) {

            if (thermometer.read(temperature) < MIN_TEMP) {
                heater.engage(temperature);
                StateHeater.HEATING.showMessage(temperature);

            } else if (thermometer.read(temperature) > MAX_TEMP) {
                heater.disengage(temperature);
                StateHeater.COOLING.showMessage(temperature);
            }

        }

        StateHeater.OFF.showMessage(temperature);
    }

    private enum StateHeater {
        OFF, HEATING, COOLING;

        public void showMessage(RoomTemperature temperature) {
            switch (this) {
                case OFF:
                    System.out.println("\033[1;37mCalefactor apagado\033[0m. Temperatura actual: " + temperature.getTemperature());
                    break;
                case HEATING:
                    System.out.println("\u001B[31mCalefactor calentando\u001B[0m.Temperatura actual: " + temperature.getTemperature());
                    break;
                case COOLING:
                    System.out.println("\033[0;36mCalefactor enfriando\033[0m.Temperatura actual: " + temperature.getTemperature());
                    break;
            }
        }
    }
}
