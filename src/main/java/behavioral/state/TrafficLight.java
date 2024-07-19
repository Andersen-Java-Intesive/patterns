package behavioral.state;

import behavioral.state.states.TrafficLightState;

public class TrafficLight {

    private boolean redLight;
    private boolean yellowLight;
    private boolean greenLight;

    private TrafficLightState state;

    public void setRedLight(boolean redLight) {
        this.redLight = redLight;
    }

    public void setYellowLight(boolean yellowLight) {
        this.yellowLight = yellowLight;
    }

    public void setGreenLight(boolean greenLight) {
        this.greenLight = greenLight;
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public TrafficLightState getState() {
        return state;
    }

}
