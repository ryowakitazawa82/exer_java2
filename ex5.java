import java.io.*;
import java.util.*;

public class ex5 {
    public static void main(String[] args) {

        File file = new File("articles.txt");

        // ファイル書き込み
        try (FileWriter filewriter = new FileWriter(file)) {
            filewriter.write("Hello world\n");
            filewriter.write("Hello Java\n");
        } catch (IOException e) {
            System.err.println("ファイル書き込みに失敗しました");
            e.printStackTrace();
        }

        // ファイル読み込み
        file = new File("error.txt");
        try (Scanner scan = makeScanner(file)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("ファイル読み込みに失敗しました");
            e.printStackTrace();
        }
    }

    public static Scanner makeScanner(File file) throws FileNotFoundException {
        try {
            Scanner scan = new Scanner(file);
            return scan;
        } catch (FileNotFoundException e) {
            System.err.println("makeScannerで例外を検出しました");
            throw e;
        }
    }

}
