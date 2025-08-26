import java.util.Scanner;

public class GameAPI {
    public static final String lowerUnder = "_";

    public void start() {
        resetGameState();
        ConsoleDrawer.StartMessage();
        ConsoleDrawer.ExitGame();
        ConsoleDrawer.ChooseOne();
        int start = new Scanner(System.in).nextInt();
        while((start!=1) && (start!=2)) {
            ConsoleDrawer.WrongMessage();
            start = new Scanner(System.in).nextInt();
        }
        if(start==1) {
            ConsoleDrawer.RunMessage();
            launchGame();
        } else {
            System.out.println("Выходим из приложения");
        }
    }

    private void resetGameState() {
        RepeatLetter reset = new RepeatLetter();
        reset.reset();
    }

    private void launchGame() {
        int errorCount = 0;
        String[] stages = new String[]{"FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "FINAL"};
        WordGenerator line = new WordGenerator();
        String randomWord = line.chooseRandomWord();
        char[] wordChars = randomWord.toCharArray();
        String hiddenWord = lowerUnder.repeat(randomWord.length());
        while (hiddenWord.contains("_") & errorCount < 6) {
            System.out.println(ConsoleDrawer.valueOf(stages[errorCount]).getSprite());
            System.out.println("Загаданное слово:" + hiddenWord);
            System.out.println("Счетчик ошибок:" + errorCount);
            System.out.println("Напиши букву");
            char symbol = checkInput();
            String charString = Character.toString(symbol);
            if (randomWord.contains(charString)) {
                ConsoleDrawer.RigthMessage();
                for (int i = 0; i < randomWord.length(); i++) {
                    if (wordChars[i] == symbol) {
                        StringBuilder sb = new StringBuilder(hiddenWord);
                        sb.setCharAt(i, symbol);
                        hiddenWord = sb.toString();
                        if (!hiddenWord.contains("_")) {
                            System.out.println("Вы угадали слово!");
                            System.out.println("Было слово - " + randomWord);
                        }
                    }
                }
            } else {
                errorCount++;
                ConsoleDrawer.MistakeMessage();
                if (errorCount >= 6) {
                    System.out.println(ConsoleDrawer.FINAL.getSprite());
                    System.out.println("Счетчик ошибок:"+errorCount);
                    System.out.println("Вы проиграли! Попытки закончились");
                    System.out.println("Было слово - " + randomWord);
                }
            }
        }
    }

    private Character checkInput() {
        RepeatLetter letter = new RepeatLetter();
        String charString = letter.getString();
        char symbol = charString.charAt(0);

        if (charString.length() == 1 && ((symbol >= 1040 && symbol <= 1071) || (symbol >= 1072 && symbol <= 1103) || (symbol == 1025) || (symbol == 1105))) {
            return symbol;
        } else {
            System.out.println("Введи букву еще раз");
            return checkInput();
        }
    }

    public boolean restart() {
        System.out.println("Хотите начать игру заново?");
        System.out.println("1.Да");
        System.out.println("2.Нет");
        int start = new Scanner(System.in).nextInt();
        while ((start != 1) && (start != 2)) {
            ConsoleDrawer.WrongMessage();
            start = new Scanner(System.in).nextInt();
        }
        if (start == 1) {
            ConsoleDrawer.RunMessage();
            return true;
        } else {
            System.out.println("Выходим из приложения");
            return false;
        }
    }
}
