package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Server {

    private static class MyServer {

        private final ServerSocket server;
        private final List<EventHandler> handlers;

        public MyServer(int port) throws IOException {
            server = new ServerSocket(port, 1);
            handlers = new ArrayList<>();
        }

        public void addEventHandler(EventHandler handler) {
            handlers.add(handler);
        }

        public void callHandler(String cmd, String arg) {
            for (EventHandler eh : handlers) {
                eh.handle(cmd, arg);
            }
        }

        public void listen() {
            try (Socket client = server.accept();
                 BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()))) {

                System.out.println("Connexion !");
                System.out.println(client);

                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(" ");

                    String cmd = parts[0];

                    StringBuilder sb = new StringBuilder();
                    for (int i = 1; i < parts.length; i++) {
                        sb.append(parts[i]);
                        if (i <= parts.length - 1) sb.append(" ");
                    }
                    String arg = sb.toString();

                    callHandler(cmd, arg);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        try {
            MyServer server = new MyServer(Client.PORT);

            server.addEventHandler((cmd, arg) -> {
                if (cmd.equals("echo")) System.out.println(arg);
            });

            server.addEventHandler((cmd, arg) -> {
                if (cmd.equals("reverse")) System.out.println(new StringBuilder(arg).reverse());
            });

            server.addEventHandler((cmd, arg) -> {
                if (cmd.equals("date")) System.out.println(LocalDateTime.now());
            });

            server.addEventHandler((cmd, arg) -> {
                if (cmd.equals("count")) System.out.println(arg.split(" ").length);
            });

            server.listen();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
