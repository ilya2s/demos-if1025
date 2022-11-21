package network;

import linked.Calculator;
import linked.ChainedList;
import linked.Node;

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
        private final ServerSocket serverSocket;
        private final List<EventHandler> handlers;

        public MyServer(int port) throws IOException {
            serverSocket = new ServerSocket(port, 1);
            handlers = new ArrayList<>();
        }

        public void addEventHandler(EventHandler handler) {
            handlers.add(handler);
        }

        public void callHandler(String cmd, String arg) {
            for (EventHandler handler : handlers) {
                handler.handle(cmd, arg);
            }
        }

        public void listen() {
            try (Socket client = serverSocket.accept();
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
                        if (i < parts.length - 1) {
                            sb.append(" ");
                        }
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
            MyServer myServer = new MyServer(1337);

            myServer.addEventHandler((cmd, arg) -> {
                if (cmd.equals("echo")) System.out.println(arg);
            });

            myServer.addEventHandler((cmd, arg) -> {
                if (cmd.equals("reverse")) System.out.println(new StringBuilder(arg).reverse());
            });

            myServer.addEventHandler((cmd, arg) -> {
                if (cmd.equals("date")) System.out.println(LocalDateTime.now());
            });

            myServer.addEventHandler((cmd, arg) -> {
                if (cmd.equals("count")) System.out.println(arg.split(" ").length);
            });

            myServer.listen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
