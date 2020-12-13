import models.Game;
import views.console.View;

public class MastermindConsole {

    private Game game;
    private View view;

    public MastermindConsole() {
        game = new Game();
        view = new View(this.game);
    }

    private void play() {
        this.view.interact();
    }

    public static void main(String[] args) {
        new MastermindConsole().play();
    }
}
