import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.File;


public class ChooseWord {
    public static String chooseRandomWord() throws FileNotFoundException {
        String seperator = File.separator;
        String path = seperator + "Users" + seperator + "diorgwuo" + seperator + "Desktop" + seperator + "ArrayString.txt";
        File file = new File(path);
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            String String = scanner.nextLine();
            list.add(String);
        }
        scanner.close();
        String RandomWord = list.get((int) Math.floor(Math.random() * list.size()));
        return RandomWord;
    }
}
