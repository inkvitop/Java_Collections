package cars;

import java.util.ArrayList;
import java.util.List;

public class AllCars {
    public static List<Car> allCarsList = new ArrayList<>();

    public AllCars() {
        allCarsList.add(new Car("Skoda Fabia", 2018, 160, 8, 8200));
        allCarsList.add(new Car("Skoda Octavia", 2020, 180, 10, 10500));
        allCarsList.add(new Car("Chevrolet Aveo", 2019, 170, 9, 9100));
        allCarsList.add(new Car("Renault Logan", 2016, 130, 11, 4500));
        allCarsList.add(new Car("Hyundai Accent", 2020, 150, 9, 7500));
        allCarsList.add(new Car("Volkswagen Polo", 2020, 140, 6, 11200));
        allCarsList.add(new Car("Hyundai Solaris", 2016, 160, 8, 5800));
        allCarsList.add(new Car("KIA Ceed", 2019, 140, 7, 7000));
        allCarsList.add(new Car("Lada Largus", 2021, 120, 15, 4000));
        allCarsList.add(new Car("Toyota Corolla", 2010, 160, 8, 6000));
    }
}
