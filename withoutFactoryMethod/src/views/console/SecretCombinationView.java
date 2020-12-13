package views.console;

import models.SecretCombination;
import utils.Console;

public class SecretCombinationView {

	private SecretCombination secretCombination;

	public SecretCombinationView(SecretCombination secretCombination) {
		this.secretCombination = secretCombination;
	}

	public void write() {
		String secret = "";
		for (int i = 0; i < secretCombination.size(); i++) {
			secret += Message.SECRET_CHARACTER.text();
		}
		Console.getInstance().writeln(secret);
	}
}
