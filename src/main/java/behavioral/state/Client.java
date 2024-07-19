package behavioral.state;

import behavioral.state.states.RedState;

public class Client {

    public static TrafficLight trafficLight;


    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        trafficLight = new TrafficLight();
        trafficLight.setState(new RedState());
    }

    static void runBusinessLogic() {
        while (true) {
            trafficLight.changeState();
        }
    }

}
