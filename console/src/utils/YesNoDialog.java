package utils;

public class YesNoDialog {

    private static final char YES = 'y';
    private static final char NO = 'n';
    private static final String QUESTION_OPTIONS = String.format(" (%s/%s): ", YES, NO);

    private String question;
    private boolean yesAnswer;

    public YesNoDialog(String question) {
        this.question = question + YesNoDialog.QUESTION_OPTIONS;
    }

    public void interact() {
        char answer;
        do {
            answer = Console.getInstance().readChar(this.question);
        } while (!isYesAnswer(answer) && !isNoAnswer(answer));
        yesAnswer = isYesAnswer(answer);
    }

    private boolean isYesAnswer(char answer) {
        return Character.toLowerCase(answer) == YesNoDialog.YES;
    }

    private boolean isNoAnswer(char answer) {
        return Character.toLowerCase(answer) == YesNoDialog.NO;
    }

    public boolean isYesAnswer() {
        return this.yesAnswer;
    }
}
