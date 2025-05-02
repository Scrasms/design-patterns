package command;

// Receiver class that contains the logic the commands are retrieving
public class Ship {
    public void steerToStarboard() {
        System.out.println("Steering to starboard...");
    }

    public void steerToPort() {
        System.out.println("Steering to port...");
    }

    public void weighAnchor() {
        System.out.println("Weighing anchor! Preparing to depart!");
    }

    public void dropAnchor() {
        System.out.println("Dropping anchor! Preparing to dock!");
    }
}
