import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameOver {
    static void EndingGame(int countErrors) throws FileNotFoundException {
        Gallow.GallowState(countErrors);
        System.out.println("Счетчик ошибок:"+countErrors);
        System.out.println("Вы проиграли! Попытки закончились");
    }
}

