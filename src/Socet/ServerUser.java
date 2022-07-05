package Socet;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public class ServerUser {
    static ServerSocket socket;
    public static List<ClientUser> clients = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        socket = new ServerSocket(2000);

        while (true) {
            ClientUser client = new ClientUser(socket.accept());
            clients.add(client);
            client.start();
        }
    }


}
