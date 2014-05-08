package reportexamples.rule2.examplenull;

public class Main {

	public void conditionalMethod() {
		if (conditionIsfulfilled()) {
			doTrue();
			veryComplexAndLongOperations();
		} else {
			doFalse();
			veryComplexAndLongOperations();
		}
	}

	private boolean conditionIsfulfilled() {
		return false;
	}

	private void doTrue() {
	}

	private void doFalse() {
	}

	private void veryComplexAndLongOperations() {
	}

}
