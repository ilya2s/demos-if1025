package tokens;

import java.io.*;
import java.util.*;

public class Tokenizer {

    private String text;
    private final List<String> tokens;
    private final List<String> uniqueTokens;

    public Tokenizer() {
        text = "";
        tokens = new ArrayList<>();
        uniqueTokens = new ArrayList<>();
    }

    public String getText() {
        return text;
    }

    public List<String> getTokens() {
        return tokens;
    }

    public List<String> getUniqueTokens() {
        return uniqueTokens;
    }

    public void readFile(String path) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.lines().forEach(line -> sb.append(line).append(System.getProperty("line.separator")));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            text = sb.toString();
        }
    }

    public void writeFile(String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String token : uniqueTokens) {
                bw.write(token);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void tokenize() {
        String cleanText = text.replaceAll("[^A-z0-9À-ú']", " ");

        tokens.addAll(Arrays.asList(cleanText.split("\\s+")));

        Set<String> set = new LinkedHashSet<>(tokens);
        uniqueTokens.addAll(set);
    }
}
