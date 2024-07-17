package creational.factory_method;

import creational.factory_method.factory.AirLogistic;
import creational.factory_method.factory.Logistic;
import creational.factory_method.factory.RoadLogistic;
import creational.factory_method.factory.SeaLogistic;

public class Client {

    private static Logistic logistic;

    public static void main(String[] args) {
        configure("Air");
        runBusinessLogic();
    }

    static void configure(String logisticType) {
        if (logisticType.equals("Air")) {
            logistic = new AirLogistic();
        } else if (logisticType.equals("Road")) {
            logistic = new RoadLogistic();
        } else if (logisticType.equals("Sea")) {
            logistic = new SeaLogistic();
        }
    }

    static void runBusinessLogic() {
        logistic.planDelivery();
    }

}
