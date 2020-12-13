package views.console;

import models.Game;

public class View {

    private ResumeView resumeView;
    private GameView gameView;

    public View(Game game) {
        resumeView = new ResumeView(game);
        gameView = new GameView(game);
    }

    public void interact() {
        do {
            gameView.interact();
            resumeView.interact();
        } while (resumeView.isResumed());
    }
}
