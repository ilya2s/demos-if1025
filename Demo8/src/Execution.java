import Serialization.Player;
import Serialization.SerializationUtils;
import tokenize.Tokenizer;

public class Execution {

    public static void main(String[] args) throws Exception {
        Tokenizer tokenizer = new Tokenizer();

        System.out.println("=========================================");
        System.out.println("Texte :");
        tokenizer.readFile("textFiles/hugo.txt");
        // System.out.println(tokenizer.getText());

        System.out.println("=========================================");
        System.out.println("Tokens :");
        tokenizer.tokenize();
        // System.out.println(tokenizer.getTokens());

        System.out.println("=========================================");
        System.out.println("Unique Tokens");
        // System.out.println(tokenizer.getUniqueTokens());

        System.out.println("=========================================");
        System.out.println("Writing unique Tokens to [textFiles/unique_hugo.txt]");
        // tokenizer.writeFile("textFiles/unique_hugo.txt");

        System.out.println("=========================================");
        System.out.println("Spawn Player");
        Player p1 = new Player("ilya2s", "abc");
        System.out.println(p1);

        System.out.println("=========================================");
        System.out.println("Killed some creepers");
        for (int i = 0; i < 12; i++) {
            p1.killMob();
        }
        System.out.println(p1);


        System.out.println("=========================================");
        System.out.println("Saving game to [saveGames/p1.data]");
        SerializationUtils.serialize(p1, "saveGames/p1.data");

        System.out.println("=========================================");
        System.out.println("Loading [saveGames/p1.data] save Game to p2 object");
        Player p2 = (Player) SerializationUtils.deserialize("saveGames/p1.data");

        System.out.println("=========================================");
        System.out.println("New Loaded Player");
        System.out.println(p2);

        //System.out.println("============================================");
        // System.out.println("Saving game with encrypted pwd to [saveGames/p1_pwd.data]");
        // SerilizationUtils.serialize(p1, "saveGames/p1_pwd.data");

        // System.out.println("=========================================");
        // System.out.println("Loading [saveGames/p1_pwd.data] save Game to p3 object");
        // Player p3 = (Player) SerilizationUtils.deserialize("saveGames/p1_pwd.data");
        // System.out.println(p3);

    }
}
