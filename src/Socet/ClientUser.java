package Socet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientUser extends Thread {
    private final Socket socket;
    private final DataInputStream input;
    private final DataOutputStream output;

    public ClientUser(Socket socket) throws IOException {
        this.socket = socket;
        String hostName = socket.getInetAddress().toString();
        System.out.println("new user connected from " + hostName);
        input = new DataInputStream(socket.getInputStream());
        output = new DataOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        try {
            while (socket.isConnected()) {
                String reader = input.readUTF();
                for (ClientUser c : ServerUser.clients) {
                    if (c != this) {
                        c.send(reader);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("user disconnect");
        }
    }

    public void send(String s) throws IOException {
        output.writeUTF(s);
        output.flush();
    }

}
