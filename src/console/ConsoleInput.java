package console;

import taxiStationManager.TaxiStationManager;

import java.util.Scanner;

public class ConsoleInput {
    ConsoleOutput consoleOutput = new ConsoleOutput();
    TaxiStationManager taxiStationManager = new TaxiStationManager();

    public void newInput() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();

        String[] inputArray = inputString.split(" ");

        switch (inputArray[0]) {
            case ("-help"): {
                consoleOutput.instruction();
                newInput();
                break;
            }
            case ("-value"): {
                taxiStationManager.calculatingValueOfAllCars();
                newInput();
                break;
            }
            case ("-fuelSort"): {
                taxiStationManager.sortByFuelConsumption();
                newInput();
                break;
            }
            case ("-speed"): {
                taxiStationManager.findCarsInTheSpeedRange(inputArray);
                newInput();
                break;
            }
            case ("-exit"): {
                consoleOutput.exit();
                break;
            }
            default: {
                consoleOutput.inputError();
                newInput();
            }
        }
    }
}
