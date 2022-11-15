package serialization;

import java.io.*;

public class Player implements Serializable {

    @Serial
    private static final long serialVersionUID = 123L;

    private final String username;
    private transient String password;
    private transient int health;
    private int score;

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
        health = 100;
        score = 0;
    }

    public void killMob() {
        score += 10;
        health -= 2;
    }

    private String encrypt(String password) {
        StringWriter sw = new StringWriter();
        password.chars().map(charNumValue -> ++charNumValue).forEach(sw::write);

        return sw.toString();
    }

    private String decrypt(String password) {
        StringWriter sw = new StringWriter();

        password.chars().map(c -> --c).forEach(sw::write);

        return sw.toString();
    }

    @Serial
    private void writeObject(ObjectOutputStream out) throws Exception {
        out.defaultWriteObject();

        String encryptedPassword = encrypt(password);

        out.writeObject(encryptedPassword);
    }

    @Serial
    private void readObject(ObjectInputStream in) throws Exception {
        in.defaultReadObject();

        password = decrypt((String) in.readObject());
        health = 100;
    }

    @Override
    public String toString() {
        return String.format("""
                Player : %s
                Password : %s
                Health : %d
                Score : %d
                """, username, password, health, score);
    }




}
