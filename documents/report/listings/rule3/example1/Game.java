package reportexamples.rule3.example1;

public class Game {

	public static void main(String[] args) {
		Dice dice = new Dice();

		int roll = dice.roll();
		System.out.println("You will jump " + roll + " times.");
		for (int i = 1; i <= roll; i++) {
			System.out.println("Jump number " + i);
		}

	}

}
