package creational.factory_method.factory;

import creational.factory_method.transport.ShipTransport;
import creational.factory_method.transport.Transport;

public class SeaLogistic extends Logistic {

    @Override
    protected Transport createTransport() {
        return new ShipTransport();
    }

}
