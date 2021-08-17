abstract class Vehicle {
    void start() {
        System.out.println("Starting!");
    }

    abstract void stop();

    abstract void speedMeter();
    // cannot provide body to a abstarct function
}
// we cannot create instance of a abstract class

public class Car extends Vehicle {
    @Override
    void stop() {
        System.out.println("Stopping!");
    }

    @Override
    void speedMeter() {
        System.out.println("500 kmph");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.speedMeter();
        car.stop();
    }
}