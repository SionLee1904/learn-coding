import java.io.*;
import java.util.Scanner;

public class AbbreviationMarker01 {
    private static final String[] ABBREVIATIONS = { "lol", "u", ":)", "iirc", "ttfn" };

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the message file name: ");
        String filename = s.nextLine();
        s.close();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String w : line.split(" ")) {
                    String core = w.replaceAll("^[^a-zA-Z0-9:)]*|[^a-zA-Z0-9:)]*$", "");
                    boolean isAbbr = false;
                    for (String abbr : ABBREVIATIONS) {
                        if (core.equalsIgnoreCase(abbr)) {
                            isAbbr = true;
                            break;
                        }
                    }
                    System.out.print(isAbbr ? "<" + w + "> " : w + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
