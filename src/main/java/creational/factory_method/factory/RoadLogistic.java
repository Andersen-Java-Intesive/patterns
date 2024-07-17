package creational.factory_method.factory;

import creational.factory_method.transport.Transport;
import creational.factory_method.transport.TruckTransport;

public class RoadLogistic extends Logistic {

    @Override
    protected Transport createTransport() {
        return new TruckTransport();
    }

}
