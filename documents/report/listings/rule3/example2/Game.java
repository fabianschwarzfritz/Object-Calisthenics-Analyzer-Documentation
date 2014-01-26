package reportexamples.rule3.example2;

public class Game {

	public static void main(String[] args) {
		Dice one = new Dice();
		one.roll(new Action() {
			@Override
			public void print(String string) {
				System.out.println(string);
			}
		});
	}

}
