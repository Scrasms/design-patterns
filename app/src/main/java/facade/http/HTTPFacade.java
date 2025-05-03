package facade.http;

public class HTTPFacade {
    public void request(String req) {
        System.out.println("Sending request: " + req + "...");

        HTTP httpClient = new HTTP();
        httpClient.sendPacket(req);

        TCP tcpClient = new TCP();
        tcpClient.sendSegment(req);

        Router routerClient = new Router();
        routerClient.sendDatagram(req);

        Switch switchClient = new Switch();
        switchClient.sendFrame(req);

        Switch switchServer = new Switch();
        switchServer.receiveFrame(req);

        Router routerServer = new Router();
        routerServer.receiveDatagram(req);

        TCP tcpServer = new TCP();
        tcpServer.receiveSegment(req);

        HTTP httpServer = new HTTP();
        httpServer.receivePacket(req);

        System.out.println("Delivered to server!");
    }

    public static void main(String[] args) {
        HTTPFacade test = new HTTPFacade();
        test.request("Hello World");
    }
}
