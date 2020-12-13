package models;

import java.util.Random;

public class SecretCombination extends Combination {

	public SecretCombination() {
		this.generateRandom();
	}

	private void generateRandom() {
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < this.size(); i++) {
			Color randomColor;
			do {
				int randomIndex = random.nextInt(Color.values().length);
				randomColor = Color.values()[randomIndex];
			} while (randomColor == Color.NULL || this.contains(randomColor));
			this.colors[i] = randomColor;
		}
	}

	public int getBlacks(ProposedCombination proposedCombination) {
		assert proposedCombination != null;

		int blacks = 0;
		for (int i = 0; i < this.size(); i++) {
			if (this.colors[i] == proposedCombination.colors[i]) {
				blacks++;
			}
		}
		return blacks;
	}

	public int getWhites(ProposedCombination proposedCombination) {
		assert proposedCombination != null;

		int whites = 0;
		for (int i = 0; i < this.size(); i++) {
			if (proposedCombination.contains(this.colors[i]) && !proposedCombination.contains(this.colors[i], i)) {
				whites++;
			}
		}
		return whites;
	}
}
