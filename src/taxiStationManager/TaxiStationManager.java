package taxiStationManager;

import cars.AllCars;
import cars.Car;
import console.ConsoleOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaxiStationManager extends AllCars {
    ConsoleOutput consoleOutput = new ConsoleOutput();

    public void calculatingValueOfAllCars () {
        int allCarsValue = allCarsList.stream().mapToInt(Car::getPrice).sum();
        consoleOutput.allCarsValue(allCarsValue);
    }

    public void sortByFuelConsumption() {
        allCarsList.sort(Comparator.comparingInt(Car::getFuelConsumption));
        consoleOutput.sortByFuel(allCarsList);
    }

    public void findCarsInTheSpeedRange (String[] inputArray) {
        List<Car> carsInSpeedRange = new ArrayList<>();
        int minSpeedValue = Integer.parseInt(inputArray[1]);
        int maxSpeedValue = Integer.parseInt(inputArray[2]);

        if (inputArray.length == 3) {
            allCarsList.forEach(car -> {
                if (car.getSpeed() >= minSpeedValue && car.getSpeed() <= maxSpeedValue) {
                    carsInSpeedRange.add(car);
                }
            });
        } else {
            consoleOutput.inputError();
        }

        consoleOutput.carsInTheSpeedRange(carsInSpeedRange);
    }
}