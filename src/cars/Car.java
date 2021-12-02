package cars;

public class Car {
    private final String model;
    private final int year;
    private final int speed;
    private final int fuelConsumption;
    private final int price;

    public Car(String model, int year, int speed, int fuelConsumption, int price) {
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                '}';
    }
}
