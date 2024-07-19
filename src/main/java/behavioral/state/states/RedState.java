package behavioral.state.states;

import behavioral.state.TrafficLight;

public class RedState implements TrafficLightState {

    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("RED!");
        trafficLight.setRedLight(true);
        trafficLight.setYellowLight(false);
        trafficLight.setGreenLight(false);
        waitTime(10000);
        trafficLight.setState(new RedYellowState());
    }
}
