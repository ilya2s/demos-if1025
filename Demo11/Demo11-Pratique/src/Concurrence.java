import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Concurrence {

    private static int x = 0;

    private static void increment() {
        for (int i = 0; i < 60000000; i++) {
            x = x + 1;
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(Concurrence::increment);
        Thread t2 = new Thread(Concurrence::increment);

        t1.start();
        t2.start();

        try {
            t1.join();
            t1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(x);
    }

    try (Stream<Path> paths = Files.walk(Paths.get("/home/"))) {
        
    }
}
