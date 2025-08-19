import java.util.Scanner;

public class RestartingGame {
    static boolean RestartGame() {
        System.out.println("Хотите начать игру заново?");
        System.out.println("1.Да");
        System.out.println("2.Нет");
        int start = new Scanner(System.in).nextInt();
        while((start!=1) && (start!=2)) {
            Message.WrongMessage();
            start = new Scanner(System.in).nextInt();
        }
        if(start==1) {
            Message.RunMessage();

            return true;

        } else {
            System.out.println("Выходим из приложения");
            return false;
        }
    }
}
