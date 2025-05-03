package facade.http;

public class Router {
    public void sendDatagram(String data) {
        System.out.println("Sending datagram: " + data + "...");
        multiplex();
    }

    public void multiplex() {
        System.out.println("Adding IP headers to datagram and delivering to Link Layer...");
    }

    public void receiveDatagram(String data) {
        System.out.println("Receiving datagram: " + data + "...");
        demultiplex();
    }

    public void demultiplex() {
        System.out.println("Parsing IP headers from datagram and delivering to TCP...");
    }
}
