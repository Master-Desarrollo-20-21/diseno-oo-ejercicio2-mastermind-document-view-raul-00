package views.console;

import java.util.LinkedHashMap;
import java.util.Map;

import models.Color;
import utils.Console;

public class ColorView {

    private static final Map<Character, Color> colorByCharacter = new LinkedHashMap<Character, Color>();
    static {
        colorByCharacter.put('r', Color.RED);
        colorByCharacter.put('b', Color.BLUE);
        colorByCharacter.put('y', Color.YELLOW);
        colorByCharacter.put('g', Color.GREEN);
        colorByCharacter.put('o', Color.ORANGE);
        colorByCharacter.put('p', Color.PINK);
    }
    private Color color;

    public ColorView(Color color) {
        this.color = color;
    }

    public void write() {
        Console.getInstance().write(getCharacter());
    }

    public static Color getColor(char character) {
        if (colorByCharacter.containsKey(character)) {
            return colorByCharacter.get(character);
        }
        return Color.NULL;
    }

    private char getCharacter() {
        for (Map.Entry<Character, Color> entry : colorByCharacter.entrySet()) {
            if (entry.getValue() == color) {
                return entry.getKey();
            }
        }
        return '?'; // TODO: buscar solución
    }

    public static String getValidCharacteres() {
        String result = "";
        for (Map.Entry<Character, Color> entry : colorByCharacter.entrySet()) {
            result += entry.getKey();
        }
        return result;
    }
}