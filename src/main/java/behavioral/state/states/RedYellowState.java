package behavioral.state.states;

import behavioral.state.TrafficLight;

public class RedYellowState implements TrafficLightState {

    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("RED and YELLOW");
        trafficLight.setRedLight(true);
        trafficLight.setYellowLight(true);
        trafficLight.setGreenLight(false);
        waitTime(1000);
        trafficLight.setState(new GreenState());
    }
}
