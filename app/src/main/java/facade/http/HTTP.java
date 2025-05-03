package facade.http;

public class HTTP {
    public void sendPacket(String packet) {
        System.out.println("Sending packet: " + packet + "...");
        multiplex();
    }

    public void multiplex() {
        System.out.println("Adding HTTP headers to packet and delivering to TCP...");
    }

    public void receivePacket(String packet) {
        System.out.println("Receiving packet: " + packet + "...");
        demultiplex();
    }

    public void demultiplex() {
        System.out.println("Parsing HTTP headers from packet and delivering to client...");
    }
}
