package creational.factory_method.transport;

public class AirplaneTransport implements Transport {

    @Override
    public void deliver() {
        System.out.println("Airplane delivered");
    }

}
