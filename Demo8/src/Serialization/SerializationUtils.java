package Serialization;

import java.io.*;

public class SerializationUtils {

    public static void serialize(Object object, String path) throws IOException {
        try (
                FileOutputStream fos = new FileOutputStream(path);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                ObjectOutputStream oos = new ObjectOutputStream(bos)
        ) {
            oos.writeObject(object);
        }
    }

    public static Object deserialize(String path) throws IOException, ClassNotFoundException{
        try (
                FileInputStream fis = new FileInputStream(path);
                BufferedInputStream bis = new BufferedInputStream(fis);
                ObjectInputStream ois = new ObjectInputStream(bis)) {
            return ois.readObject();
        }
    }
}
