import java.io.FileNotFoundException;

public class Game {
    public static void main() throws FileNotFoundException {
        int countErrors = 0;
        String randomWord = WordGenerator.chooseRandomWord();
        char[] charsWord = randomWord.toCharArray();
        String hiddenWord = "_".repeat(randomWord.length());
        while (hiddenWord.contains("_") & countErrors<6) {
            Gallow.GallowState(countErrors);
            System.out.println("Загаданное слово:" + hiddenWord);
            System.out.println("Счетчик ошибок:"+countErrors);
            System.out.println("Напиши букву");
            String charString = StringInput.GetString();
            char symbol = charString.charAt(0);
            if (randomWord.contains(charString)) {
                Message.RigthMessage();
                for (int i = 0; i<randomWord.length();i++) {
                    if (charsWord[i] == symbol) {
                        StringBuilder sb = new StringBuilder(hiddenWord);
                        sb.setCharAt(i,symbol); // меняем символ в строке по индексу
                        hiddenWord = sb.toString();
                        if (!hiddenWord.contains("_")) {
                            System.out.println("Вы угадали слово!");
                            System.out.println("Было слово - " + randomWord);
                        }
                    }
                }
            } else {
                countErrors = ErrorCounter.errorCount(countErrors);
                Message.MistakeMessage();
                if (countErrors>=6) {
                    GameOver.EndingGame(countErrors);
                    System.out.println("Было слово - " + randomWord);
                }
            }
        }
    }
}
