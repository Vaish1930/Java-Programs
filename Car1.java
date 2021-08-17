interface Vehicle1 {
    void start();

    void stop();

    void speedMeter();
}

public class Car1 implements Vehicle1 {
    @Override
    public void start() {
        System.out.println("Starting");

    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }

    @Override
    public void speedMeter() {
        System.out.println(1000);
    }

    public static void main(String args[]) {
        Car1 ob = new Car1();
        ob.start();
        ob.stop();
        ob.speedMeter();
    }
}
