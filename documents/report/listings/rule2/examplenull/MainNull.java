package reportexamples.rule2.examplenull;

public class MainNull {

	public void conditionalMethod() {
		if (conditionIsfulfilled()) {
			doTrue();
			veryComplexAndLongOperations();
			return;
		}
		doFalse();
		veryComplexAndLongOperations();
		return;
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
