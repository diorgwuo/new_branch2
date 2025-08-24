import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;


public class WordGenerator {
    public static String chooseRandomWord() throws FileNotFoundException {
        String path = "ArrayString.txt";
        File file = new File(path);
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            list.add(line);
        }
        scanner.close();
        String RandomWord = list.get((int) Math.floor(Math.random() * list.size()));
        return RandomWord;
    }
}
