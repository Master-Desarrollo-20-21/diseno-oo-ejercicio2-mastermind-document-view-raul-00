package models;

public abstract class Combination {
    public static final int SIZE = 4;
    protected Color[] colors;

    protected Combination() {
        this.colors = new Color[SIZE];
    }

    public int size() {
        return this.colors.length;
    }

    public Color[] getColors() {
        return this.colors;
    }

    protected boolean contains(Color color) {
        for (Color c : this.colors) {
            if (c == color) {
                return true;
            }
        }
        return false;
    }
}
