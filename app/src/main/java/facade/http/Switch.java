package facade.http;

public class Switch {
    public void sendFrame(String frame) {
        System.out.println("Sending frame: " + frame + "...");
        multiplex();
    }

    public void multiplex() {
        System.out.println("Adding Ethernet headers to frame and delivering to server...");
    }

    public void receiveFrame(String frame) {
        System.out.println("Receiving frame: " + frame + "...");
        demultiplex();
    }

    public void demultiplex() {
        System.out.println("Parsing Ethernet headers from frame and delivering to Network Layer...");
    }
}
