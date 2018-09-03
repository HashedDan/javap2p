package client;

public class Client {
    private Socket socket;
    private DataInputStream input;
    private DataOutputStream out;

    public Client(String ip, int port) {
        socket = new Socket(ip, port);
    }
}