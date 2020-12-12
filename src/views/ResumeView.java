package views;

import models.Game;
import utils.YesNoDialog;

public class ResumeView {

    private Game game;
    private boolean resume;

    public ResumeView(Game game) {
        this.game = game;
    }

    public void interact() {
        YesNoDialog dialog = new YesNoDialog(Message.RESUME_QUESTION.text());
        dialog.interact();
        this.resume = dialog.isYesAnswer();
        if (this.resume) {
            this.game.reset();
        }
    }

    public boolean isResumed() {
        return this.resume;
    }
}
