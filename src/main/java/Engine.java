import de.gurkenlabs.litiengine.Game;

public class Engine {

    public static void main(String[] args) {
        Game.init(args);
        Game.start();

        System.out.println("Game version is: " + Game.info().getVersion());
    }
}
