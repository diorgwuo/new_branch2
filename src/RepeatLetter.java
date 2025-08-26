import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatLetter {

    private List<String> symbols;

    String getString() {
        symbols = new ArrayList<>();
        String charString = new Scanner(System.in).nextLine(); //ввод буквы
        if (symbols.contains(charString)) {
            System.out.println("Ты уже вводил эту букву");
            getString();
        }
        symbols.add(charString);
        return charString;
    }

    void reset() {
        if (symbols != null) {
            symbols.clear();
        }
    }
}
