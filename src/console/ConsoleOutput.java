package console;

import cars.Car;

import java.util.List;

public class ConsoleOutput {
    public void instruction() {
        System.out.println("******************************************");
        System.out.println("-value                  (Get the cost of all cars in the taxi fleet)");
        System.out.println("-fuelSort               (Sort all cars in the taxi fleet by fuel consumption)");
        System.out.println("-speed <int> <int>      (Get all cars whose maximum speed is within the specified range)");
        System.out.println("-exit                   (End the program)");
        System.out.println("-help                   (List of all available commands)");
        System.out.println("******************************************");
    }

    public void allCarsValue(int summa) {
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.println("The cost of all cars in the taxi fleet = " + summa + " euro.");
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
    }

    public void sortByFuel(List<Car> allCarsList) {
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        for (Car car : allCarsList) {
            System.out.println(car);
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
    }

    public void carsInTheSpeedRange(List<Car> carsInSpeedRange) {
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        if (carsInSpeedRange.size() != 0) {
            for (Car car : carsInSpeedRange) {
                System.out.println(car);
            }
        } else {
            System.out.println("No cars found matching the specified parameters");
        }

        System.out.println("- - - - - - - - - - - - - - - - - - - -");
    }

    public void exit() {
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.println("Terminating the program");
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
    }

    public void inputError() {
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.println("!!! Invalid command entered. Try again !!!");
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
    }
}
