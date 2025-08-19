import java.io.FileNotFoundException;
import java.util.Scanner;

public class StartGame {
    public static void main() throws FileNotFoundException {
        resetGameState();
        Message.StartMessage();
        Message.ExitGame();
        Message.ChooseOne();
        int start = new Scanner(System.in).nextInt();
        while((start!=1) && (start!=2)) {
            Message.WrongMessage();
            start = new Scanner(System.in).nextInt();
        }
        if(start==1) {
            Message.RunMessage();
            Game.main();

        } else {
            System.out.println("Выходим из приложения");
        }
    }

    private static void resetGameState() {
        StringInput.reset();
    }
}
