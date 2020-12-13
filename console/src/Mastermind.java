import models.Game;
import views.View;

public class Mastermind {

    private Game game;
    private View view;

    public Mastermind() {
        game = new Game();
        view = new View(this.game);
    }

    private void play() {
        this.view.interact();
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }
}
