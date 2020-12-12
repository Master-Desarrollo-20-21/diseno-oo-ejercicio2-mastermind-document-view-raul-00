package views;

public enum Message {
    TITLE("----- MASTERMIND -----"), 
    SECRET_CHARACTER("*"),
    ATTEMPTS(" attempt(s):"),
    BLACKS_AND_WHITES(" --> %s blacks and %s whites"),
    WINNER("You've won!!! ;-)"),
    LOSER("You've lost!!! :-("),
    PROPOSE_COMBINATION("Propose a combination: "),
    INVALID_LENGTH("Wrong proposed combination length"),
    INVALID_COLORS("Wrong colors, they must be: %s"),
    REPEATED_COLORS("Repeated colors"),
    RESUME_QUESTION("RESUME?");

    private String text;

    Message(String text) {
        this.text = text;
    }

    public String text() {
        return this.text;
    }
}
