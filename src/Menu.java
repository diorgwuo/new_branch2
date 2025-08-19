import java.io.FileNotFoundException;

public class Menu {
    public static void main(String[] args) throws FileNotFoundException {
        boolean start = true;
        do {
            StartGame.main();
            start= RestartingGame.RestartGame();
        } while (start);
    }
}

