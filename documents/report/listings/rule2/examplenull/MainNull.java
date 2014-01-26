package reportexamples.rule2.examplenull;

public class MainNull {

	public void conditionalMethod() {
		if (conditionIsFullfilled()) {
			doTrue();
			veryComplexAndLongOperations();
			return;
		}
		doFalse();
		veryComplexAndLongOperations();
		return;
	}

	private boolean conditionIsFullfilled() {
		return false;
	}

	private void doTrue() {
	}

	private void doFalse() {
	}

	private void veryComplexAndLongOperations() {
	}

}
