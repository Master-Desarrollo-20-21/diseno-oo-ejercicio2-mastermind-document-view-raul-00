package models;

public class ProposedCombination extends Combination {

    public ProposedCombination(Color[] colors) {
        this.colors = colors;
    }

    public boolean contains(Color color, int position) {
        for (int i = 0; i < this.colors.length; i++) {
            if (this.colors[i] == color && i == position) {
                return true;
            }
        }
        return false;
    }
}
