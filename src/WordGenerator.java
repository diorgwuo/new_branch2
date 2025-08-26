import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;


public class WordGenerator {
    public String chooseRandomWord() {
        String path = "ArrayString.txt";
        File file = new File(path);
        List<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list.get((int) Math.floor(Math.random() * list.size()));
    }
}
