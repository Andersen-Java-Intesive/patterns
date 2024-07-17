package creational.factory_method.transport;

public class TruckTransport implements Transport {

    @Override
    public void deliver() {
        System.out.println("Truck delivered");
    }

}