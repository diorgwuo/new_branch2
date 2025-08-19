import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringInput {

    static List<String> symbols = new ArrayList<>();

    static String GetString() {
        String charString = new Scanner(System.in).nextLine(); //ввод буквы
        if (symbols.contains(charString)) {
            System.out.println("Ты уже вводил эту букву");
            GetString();
        }

        symbols.add(charString);
        return charString;
    }

    static void reset() {
        symbols.clear();
    }
}
