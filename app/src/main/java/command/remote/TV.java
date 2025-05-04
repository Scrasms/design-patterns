package command.remote;

public class TV {
    private boolean on = false;
    private int volume = 5;
    private final int maxVol = 10;
    private final int minVol = 0;

    public void turnOn() {
        if (!on) {
            on = true;
            System.out.println("TV turned on");
        } else {
            System.out.println("TV already on");
        }

    }

    public void turnOff() {
        if (on) {
            on = false;
            System.out.println("TV turned off");
        } else {
            System.out.println("TV already off");
        }

    }

    public void increaseVolume() {
        if (!on) {
            System.out.println("TV is turned off");
        } else if (volume < maxVol) {
            volume++;
            System.out.println("Volume increased");
        } else {
            System.out.println("Already at max volume");
        }

    }

    public void decreaseVolume() {
        if (!on) {
            System.out.println("TV is turned off");
        } else if (volume > minVol) {
            volume--;
            System.out.println("Volume decreased");
        } else {
            System.out.println("Already at min volume");
        }

    }
}
