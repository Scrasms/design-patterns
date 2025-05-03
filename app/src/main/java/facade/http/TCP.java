package facade.http;

public class TCP {
    public void sendSegment(String segment) {
        System.out.println("Sending segment: " + segment + "...");
        multiplex();
    }

    public void multiplex() {
        System.out.println("Adding TCP headers to segment and delivering to Network Layer...");
    }

    public void receiveSegment(String segment) {
        System.out.println("Receiving segment: " + segment + "...");
        demultiplex();
    }

    public void demultiplex() {
        System.out.println("Parsing TCP headers from segment and delivering to HTTP...");
    }
}
