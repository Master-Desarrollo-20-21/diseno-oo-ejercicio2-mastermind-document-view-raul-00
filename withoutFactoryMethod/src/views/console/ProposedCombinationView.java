package views.console;

import models.Color;
import models.Combination;
import models.ProposedCombination;
import utils.Console;

public class ProposedCombinationView {

	private ProposedCombination proposedCombination;

	public ProposedCombinationView(ProposedCombination proposedCombination) {
		this.proposedCombination = proposedCombination;
	}

	public ProposedCombinationView() {
	}

	public void read() {
		String input;
		do {
			input = Console.getInstance().readString(Message.PROPOSE_COMBINATION.text());
			if (!isValidLength(input)) {
				Console.getInstance().writeln(Message.INVALID_LENGTH.text());
			} else if (!isValidChars(input)) {
				Console.getInstance()
						.writeln(String.format(Message.INVALID_COLORS.text(), ColorView.getValidCharacteres()));
			} else if (!isUniqueChars(input)) {
				Console.getInstance().writeln(Message.REPEATED_COLORS.text());
			} else {
				this.proposedCombination = new ProposedCombination(getColors(input));
			}
		} while (!isValid(input));
	}

	private boolean isValidLength(String combination) {
		return combination.length() == Combination.SIZE;
	}

	private boolean isValidChars(String combination) {
		for (Color color : getColors(combination)) {
			if (color == Color.NULL) {
				return false;
			}
		}
		return true;
	}

	private boolean isUniqueChars(String combination) {
		for (int i = 0; i < combination.length(); i++) {
			for (int j = i + 1; j < combination.length(); j++) {
				if (combination.charAt(i) == combination.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean isValid(String combination) {
		return isValidLength(combination) && isValidChars(combination) && isUniqueChars(combination);
	}

	private Color[] getColors(String combination) {
		assert combination != null;

		Color[] colors = new Color[combination.length()];
		for (int i = 0; i < colors.length; i++) {
			colors[i] = ColorView.getColor(combination.charAt(i));
		}
		return colors;
	}

	public ProposedCombination getProposedCombination() {
		return proposedCombination;
	}

	public void write() {
		for (Color color : this.proposedCombination.getColors()) {
			new ColorView(color).write();
		}
	}
}
