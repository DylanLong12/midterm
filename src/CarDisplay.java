/**
 * Inheritance Lab - Midterm Exam 
 * Spring 2024 ITEC 2150
 *
 */
public class CarDisplay {
    public static void main(String[] args) {
        Car car = new Car("Father", "Large");
        car.setLicensePlate("ABC123");
        System.out.println(car);

        Truck truck = new Truck("Ford", "Extra Large size", "TRK999", 5000);
        System.out.println(truck);

        Sedan sedan = new Sedan("Mother", "Medium", 4, 2000);
        System.out.println(sedan);

        SportsCar sportsCar = new SportsCar("I", "Small", 2, 3000, "Red");
        System.out.println(sportsCar);

    }
}


class Car {
    private String name; //owner name e.g. mother, father, son, daughter
    private String size;
    private String licensePlate;


    public Car(String name, String size) {
        this.name = name;
        this.size = size;
        this.licensePlate = null;
    }
    public Car() {
        this.name = null;
        this.size = "Extra Large";
        this.licensePlate = "TRK999";
    }

    public Car(String name, String size, String licensePlate) {
        this.name = name;
        this.size = size;
        this.licensePlate = licensePlate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "My " + this.name + " has/have a most luxurious car in my family. and" +
                " License Plate is " + this.licensePlate;
    }
}


class SportsCar extends Sedan{

    private String color;


    public SportsCar(String name, String size, int doors, int engineCapacity, String color) {
        super(name, doors, engineCapacity);
        this.color = color;
    }

    @Override
    public String toString(){
        return super.getNewname() + " has/have a Sports Car with " + super.getDoors() + " doors and " + super.getEngineCapacity() + " engine capacity and " + this.color + " color";
    }
}

class Sedan extends Car {
    private int doors;
    private int engineCapacity;
    private String Newname;

    public Sedan(String name, String size, int doors, int engineCapacity) {
        super(name, size);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
    public Sedan(String name, int doors, int engineCapacity) {
        super();
        this.doors = doors;
        this.engineCapacity = engineCapacity;
        this.Newname = name;
    }

    public String getNewname() {
        return Newname;
    }

    public void setNewname(String newname) {
        Newname = newname;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return super.getName() + " has/have a Sedan with " + this.doors + " doors and " + this.engineCapacity + " engine capacity";
    }
}

class Truck extends Car {

    private double cargoCapacity;

    public Truck(String name, String size, String licensePlate, double cargoCapacity) {
        super(name, size, licensePlate);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "This Truck belongs to " + super.getName() + " and it is " +
                super.getSize() + " and the cargo capacity is " +
                this.cargoCapacity + " kg and License Plate is " +
                super.getLicensePlate();
    }
}
