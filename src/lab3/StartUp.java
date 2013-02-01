package lab3;

public class StartUp {

    public static void main(String[] args) {
        //Did not use Liskov Subsitution Principle because Automoblie is abstract

        //Car Class
        Car car = new Car();
        car.setMake("Chevy");
        car.setEngine("1.4 L 4-Cylinder");
        car.setColor("Gray");
        car.setCarDoors(5);
        car.setFuelEconomy(29);

        //Print out to console
        System.out.println("Make: " + car.getMake());
        System.out.println("Engine Size: " + car.getEngine());
        System.out.println("Color: " + car.getColor());
        System.out.println("Number of Doors: " + car.getCarDoors());
        System.out.println("Fuel Enconomy: " + car.getFuelEconomy());
        //Create a Blank Line
        System.out.println("");

        //Van Class
        Van van = new Van();
        van.setMake("Dodge");
        van.setEngine("3.8 L 6-Cylinder");
        van.setColor("Red");
        van.setCarDoors(5);
        van.setSize("Mid-Size");

        //Print out to console
        System.out.println("Make: " + van.getMake());
        System.out.println("Engine Size: " + van.getEngine());
        System.out.println("Color: " + van.getColor());
        System.out.println("Number of Doors: " + van.getCarDoors());
        System.out.println("Size: " + van.getSize());
        //Create a Blank Line
        System.out.println("");

        //Truck Class
        Truck truck = new Truck();
        truck.setMake("GMC");
        truck.setEngine("5.0 L 8-Cylinder");
        truck.setColor("Green");
        truck.setCarDoors(2);
        //Trying to get the FourWheelDrive to work
        //truck.setFourWheelDrive();

        //Print out to Console
        System.out.println("Make: " + truck.getMake());
        System.out.println("Engine Size: " + truck.getEngine());
        System.out.println("Color: " + truck.getColor());
        System.out.println("Number of Doors: " + truck.getCarDoors());
        System.out.println("Four Wheel Drive: Active");
    }
}
