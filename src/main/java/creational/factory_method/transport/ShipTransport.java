package creational.factory_method.transport;

import javax.swing.*;
import java.awt.*;

public class ShipTransport implements Transport {

    @Override
    public void deliver() {
        System.out.println("Ship delivered");
    }

}