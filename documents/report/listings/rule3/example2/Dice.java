package reportexamples.rule3.example2;

public class Dice {

	public void roll(Action action) {
		int times = ((int) (Math.random() * 6) + 1);
		action.print("You will jump " + times + " times.");
		for (int i = 0; i <= times; i++) {
			action.print("Jump number " + i);
		}
	}
}
