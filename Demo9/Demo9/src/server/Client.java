package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static final String ADDRESS = "127.0.0.1";
    public static final int PORT = 1337;

    public static void main(String[] args) {
        try (
                Socket client = new Socket(ADDRESS, PORT);
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))
        ) {

            Scanner sc = new Scanner(System.in);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                System.out.println("Envoi de ligne "  + line);

                bw.append(line).append("\n");

                bw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
