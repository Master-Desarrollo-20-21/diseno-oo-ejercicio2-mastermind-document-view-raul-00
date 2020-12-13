package views.console;

import java.util.List;

import models.Attempt;
import utils.Console;

public class AttemptView {

    private List<Attempt> attempts;

    public AttemptView(List<Attempt> attempts) {
        this.attempts = attempts;
    }

    public void writeAttemptsNumber() {
        Console.getInstance().writeln(attempts.size() + Message.ATTEMPTS.text());
    }

    public void writeAttempts() {
        for (Attempt attempt : attempts) {
            new ProposedCombinationView(attempt.getProposedCombination()).write();
            Console.getInstance()
                    .writeln(String.format(Message.BLACKS_AND_WHITES.text(), attempt.getBlacks(), attempt.getWhites()));
        }
    }
}
