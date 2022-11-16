package tokenize;

import java.io.*;
import java.util.*;

public class Tokenizer {

    private String text;
    private List<String> tokens;
    private List<String> uniqueTokens;

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
            br.lines().forEach(line -> sb.append(line).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            text = sb.toString();
        }
    }

    public void writeFile(String path) {
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(path))) {
            for (String token : uniqueTokens) {
                bf.write(token);
                bf.newLine();
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
