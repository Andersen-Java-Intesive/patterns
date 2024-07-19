package behavioral.state.states;

import behavioral.state.TrafficLight;

public class GreenBlinkState implements TrafficLightState {

    @Override
    public void handle(TrafficLight trafficLight) {
        trafficLight.setRedLight(false);
        trafficLight.setYellowLight(false);
        blink(trafficLight);
        trafficLight.setState(new YellowState());
    }

    private void blink(TrafficLight trafficLight) {
        for (int i = 0; i < 2; i++) {
            System.out.println("GREEN ON");
            trafficLight.setGreenLight(true);
            waitTime(500);
            System.out.println("GREEN OFF");
            waitTime(500);
            trafficLight.setGreenLight(false);
        }
    }
}
