package behavioral.state.states;

import behavioral.state.TrafficLight;

public class GreenState implements TrafficLightState {

    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("GREEN");
        trafficLight.setRedLight(false);
        trafficLight.setYellowLight(false);
        trafficLight.setGreenLight(true);
        waitTime(5000);
        trafficLight.setState(new GreenBlinkState());
    }
}
