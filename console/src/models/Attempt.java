package models;

public class Attempt {

    private ProposedCombination proposedCombination;
    private int blacks;
    private int whites;

    public Attempt(SecretCombination secretCombination, ProposedCombination proposedCombination) {
        this.proposedCombination = proposedCombination;
        this.blacks = secretCombination.getBlacks(proposedCombination);
        this.whites = secretCombination.getWhites(proposedCombination);
    }

    public int getBlacks() {
        return blacks;
    }

    public int getWhites() {
        return whites;
    }

    public boolean isWinner() {
        return blacks == Combination.SIZE;
    }

    public ProposedCombination getProposedCombination() {
        return proposedCombination;
    }
}
