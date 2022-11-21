package network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static final String ADDRESS = "127.0.0.1";
    public static final int PORT = 1337;

    public static void main(String[] args) {
        try (Socket client = new Socket(ADDRESS, PORT);
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))) {

            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                System.out.println("Envoi de : " + line);
                bw.append(line).append("\n");

                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
