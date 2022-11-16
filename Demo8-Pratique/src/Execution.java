import serialization.Player;
import serialization.SerializationUtils;
import tokens.Tokenizer;

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
        System.out.println("Unique Tokens :");
        // System.out.println(tokenizer.getUniqueTokens());

        System.out.println("=========================================");
        System.out.println("Writing unique Tokens to [textFiles/unique_hugo.txt]");
        // tokenizer.writeFile("textFiles/unique_hugo.txt");

        System.out.println("=========================================");
        System.out.println("Spawned player ilya2s");
        Player player = new Player("ilya2s", "abc");
        System.out.println(player);

        System.out.println("=========================================");
        System.out.println("killed some creepers");
        for (int i = 0; i < 12; i++) {
            player.killMob();
        }
        System.out.println(player);

        System.out.println("=========================================");
        System.out.println("Saving game to [saveGames/player.data]");
        SerializationUtils.serialize(player, "saveGames/player.data");

        System.out.println("=========================================");
        System.out.println("Loading [saveGames/player.data] save Game to otherPlayer object");
        Player otherPlayer = (Player) SerializationUtils.deserialize("saveGames/player.data");

        System.out.println("=========================================");
        System.out.println("New loaded player");
        System.out.println(otherPlayer);



    }
}
