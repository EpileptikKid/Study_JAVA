package Socet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        int port = 7777;
        try (ServerSocket ss = new ServerSocket(port)) {
            System.out.println("Ожидаем клиента...");
            Socket socket = ss.accept();
            System.out.println("Клиент нашелся!");
            System.out.println();

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            String line;
            String message;
            Scanner scannerMessage = new Scanner(System.in);
            while (true) {
                line = in.readUTF(); // ожидаем пока клиент пришлет строку текста
                System.out.println("Клиент: " + line);
                System.out.print("Я: ");
                message = scannerMessage.nextLine();
                out.writeUTF(message);
                out.flush(); // освобождаем буфер потока

            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
