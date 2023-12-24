package ws;


import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:6060/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web Service deploye sur " + url);
    }
}
