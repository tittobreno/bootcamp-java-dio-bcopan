package edu.breno.methods;

public class SmartTv {
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }

    public void incrementChannel() {
        channel++;
    };

    public void decrementChannel() {
        channel--;
    };

    public void incrementVolume() {
        volume++;
    };

    public void decrementVolume() {
        volume--;
    };

    public void tvOn() {
        on = true;
    };

    public void tvOff() {
        on = false;
    };
}
