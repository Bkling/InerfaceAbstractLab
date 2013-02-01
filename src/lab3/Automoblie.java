package lab3;

public abstract class Automoblie {

    //Properties of an automoblie
    private String engine;
    private String color;
    private int carDoors;
    private String make;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCarDoors() {
        return carDoors;
    }

    public void setCarDoors(int carDoors) {
        this.carDoors = carDoors;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
