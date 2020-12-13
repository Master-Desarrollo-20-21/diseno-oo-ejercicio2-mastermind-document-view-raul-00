package models;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private static final int MAX_ATTEMPTS = 10;
	private SecretCombination secretCombination;
	private List<Attempt> attempts;

	public Game() {
		this.reset();
	}

	public void reset() {
		this.secretCombination = new SecretCombination();
		this.attempts = new ArrayList<>();
	}

	public boolean isFinished() {
		return isLoser() || isWinner();
	}

	private boolean isLoser() {
		return this.attempts.size() == MAX_ATTEMPTS;
	}

	public boolean isWinner() {
		assert attempts.isEmpty();
		return attempts.get(attempts.size() - 1).isWinner();
	}

	public List<Attempt> getAttempts() {
		return this.attempts;
	}

	public SecretCombination getSecretCombination() {
		return secretCombination;
	}

	public void addAttempt(Attempt attempt) {
		this.attempts.add(attempt);
	}
}
