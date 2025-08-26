public enum ConsoleDrawer {
        FIRST("""
                        +----+
                        |
                        |
                        |
                        |
                        |"""),
        SECOND ("""
                        +----+
                        |    0
                        |
                        |
                        |
                        |"""),
        THIRD ("""
                        +----+
                        |    0
                        |    |
                        |    |
                        |
                        |"""),
        FOURTH ("""
                        +----+
                        |    0
                        |   /|
                        |    |
                        |
                        |"""),
        FIFTH ("""
                        +----+
                        |    0
                        |   /|\\
                        |    |
                        |
                        |"""),
        SIXTH ("""
                        +----+
                        |    0
                        |   /|\\
                        |    |
                        |   /
                        |"""),
        FINAL ("""
                        +----+
                        |    0
                        |   /|\\
                        |    |
                        |   / \\
                        |""");

    private final String sprite;
    static void StartMessage() {
        System.out.println("1.Начать игру");
    }
    static void ExitGame() {
        System.out.println("2.Выйти из игры");
    }
    static void ChooseOne() {
        System.out.println("Введите 1 чтобы начать игру или 2 чтобы выйти из приложения");
    }
    static void WrongMessage() {
        System.out.println("Неверно! Введите снова");
    }
    static void RunMessage() {
        System.out.println("Игра началась");
    }
    static void RigthMessage() {
        System.out.println("Есть такая буква!");
    }
    static void MistakeMessage() {
        System.out.println("Нет такой буквы!");
    }

    ConsoleDrawer (String sprite) {
        this.sprite = sprite;
    }

    public String getSprite() {
        return sprite;
    }
}