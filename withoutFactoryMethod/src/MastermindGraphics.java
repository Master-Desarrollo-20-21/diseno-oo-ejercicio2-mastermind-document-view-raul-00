import models.Game;
import views.graphics.View;

public class MastermindGraphics {

    private Game game;
    private View view;

    public MastermindGraphics() {
        game = new Game();
        view = new View(this.game);
    }

    private void play() {
        this.view.interact();
    }

    public static void main(String[] args) {
        new MastermindGraphics().play();
    }
}
