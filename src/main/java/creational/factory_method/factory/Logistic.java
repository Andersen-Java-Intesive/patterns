package creational.factory_method.factory;

import creational.factory_method.transport.Transport;

public abstract class Logistic {

    public void planDelivery(){
        Transport transport = createTransport();
        transport.deliver();
    }

    protected abstract Transport createTransport();

}
