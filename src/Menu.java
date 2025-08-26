public class Menu {
    public static void main(String[] args){
        boolean start = true;
        while (start) {
            GameAPI game = new GameAPI();
            game.start();
            start = game.restart();
        }
    }
}

