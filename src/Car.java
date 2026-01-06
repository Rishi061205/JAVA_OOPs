package src;

public class Car {
    String brand;
    String model;
    String type;
    String color;
    int makeYear;
    int mileage;

    public Car(String brand, String model, String type, String color, int makeYear, int mileage) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
        this.makeYear = makeYear;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "CAR DETAILS{" +
                "brand='" + this.brand + '\'' +
                ", model=" + this.model +
                ", type='" + this.type + '\'' +
                ", color='" + this.color + '\'' +
                ", makeYear='" + this.makeYear + '\'' +
                ", mileage='" + this.mileage + '\'' +
                '}';
    }

    public void carDetails(String brand, String model, String type, String color, int makeYear, int mileage) {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Make Year: " + makeYear);
        System.out.println("Mileage: " + mileage + " km/l");
    }

    public void comparison(Car car) {
        if (this.mileage > car.mileage) {
            System.out
                    .println(this.brand + " " + this.model + " has better mileage than " + car.brand + " " + car.model);
        } else if (this.mileage < car.mileage) {
            System.out
                    .println(car.brand + " " + car.model + " has better mileage than " + this.brand + " " + this.model);
        } else {
            System.out.println("Both cars have the same mileage.");
        }
    }

    public String startEngine(){
        return "Engine started for "+this.brand + " car";
    }

    public String stopCarEngine(){
        return "Engine stopped for "+this.brand + " car";
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", "Petrol", "Red", 2020, 15);
        // Car car2 = new Car("Honda", "Civic", "Diesel", "Blue", 2019, 18);
        // car1.carDetails(car1.brand, car1.model, car1.type, car1.color, car1.makeYear,
        // car1.mileage);
        // System.out.println();
        // car2.carDetails(car2.brand, car2.model, car2.type, car2.color, car2.makeYear,
        // car2.mileage);
        // System.out.println();
        // car1.comparison(car2);
        // int a = 15;
        // System.out.println(a);
        // System.out.println(car1.toString());
        System.out.println(car1.startEngine());
    }
}