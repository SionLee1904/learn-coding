import java.io.*;
import java.util.*;

public class AbbreviationMarker03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter abbreviation file name: ");
        String abbreviationFile = s.nextLine().trim();

        List<String> abbreviations = new ArrayList<>();
        try (BufferedReader abbrReader = new BufferedReader(new FileReader(abbreviationFile))) {
            String abbr;
            while ((abbr = abbrReader.readLine()) != null) {
                abbreviations.add(abbr.trim().toLowerCase());
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 실패: " + e.getMessage());
            s.close();
            return;
        }

        System.out.print("Enter message file name: ");
        String messageFile = s.nextLine().trim();
        System.out.print("Enter output file name: ");
        String outputFile = s.nextLine().trim();
        s.close();

        try (
            BufferedReader messageReader = new BufferedReader(new FileReader(messageFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        ) {
            String line;
            int lineNumber = 1;

            while ((line = messageReader.readLine()) != null) {
                StringBuilder sb = new StringBuilder();
                int count = 0;

                for (String w : line.split(" ")) {
                    String core = w.replaceAll("^[^a-zA-Z0-9:)]*|[^a-zA-Z0-9:)]*$", "");
                    boolean isAbbr = false;

                    for (String abbr : abbreviations) {
                        if (core.equalsIgnoreCase(abbr)) {
                            isAbbr = true;
                            break;
                        }
                    }

                    if (isAbbr) {
                        sb.append("<").append(w).append("> ");
                        count++;
                    } else {
                        sb.append(w).append(" ");
                    }
                }

                String processed = sb.toString().trim();
                String outputLine = "Line " + lineNumber + ": " + count + " abbreviation(s) found.\n" + processed;
                System.out.println(outputLine);
                writer.write(outputLine);
                writer.newLine();
                lineNumber++;
            }

            System.out.println("Marked message saved to: " + outputFile);
        } catch (IOException e) {
            System.out.println("파일 처리 중 오류 발생: " + e.getMessage());
        }
    }
}
