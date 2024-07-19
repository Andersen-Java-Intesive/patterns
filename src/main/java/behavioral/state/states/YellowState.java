package behavioral.state.states;

import behavioral.state.TrafficLight;

public class YellowState implements TrafficLightState {

    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("YELLOW");
        trafficLight.setRedLight(false);
        trafficLight.setYellowLight(true);
        trafficLight.setGreenLight(false);
        waitTime(2000);
        trafficLight.setState(new RedState());
    }
}
