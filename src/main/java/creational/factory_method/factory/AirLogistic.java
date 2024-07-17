package creational.factory_method.factory;

import creational.factory_method.transport.AirplaneTransport;
import creational.factory_method.transport.Transport;

public class AirLogistic extends Logistic {

    @Override
    protected Transport createTransport() {
        return new AirplaneTransport();
    }

}
