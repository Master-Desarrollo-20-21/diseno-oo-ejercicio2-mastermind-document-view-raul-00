package views.console;

import models.Attempt;
import models.Game;
import utils.Console;

public class GameView {
    private Game game;

    public GameView(Game game) {
        this.game = game;
    }

    public void interact() {
        Console.getInstance().writeln(Message.TITLE.text());
        new SecretCombinationView(this.game.getSecretCombination()).write();
        proposeCombinations();
        writeResult();
    }

    private void proposeCombinations() {
        do {
            ProposedCombinationView proposedCombinationView = new ProposedCombinationView();
            proposedCombinationView.read();
            Attempt attempt = new Attempt(this.game.getSecretCombination(),
                    proposedCombinationView.getProposedCombination());
            this.game.addAttempt(attempt);
            writeStatus();
        } while (!this.game.isFinished());
    }

    private void writeStatus() {
        Console.getInstance().writeln();
        AttemptView attemptView = new AttemptView(this.game.getAttempts());
        attemptView.writeAttemptsNumber();
        new SecretCombinationView(this.game.getSecretCombination()).write();
        attemptView.writeAttempts();
    }

    private void writeResult() {
        if (this.game.isWinner()) {
            Console.getInstance().writeln(Message.WINNER.text());
        } else {
            Console.getInstance().writeln(Message.LOSER.text());
        }
    }
}
