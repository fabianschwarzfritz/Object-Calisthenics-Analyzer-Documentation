package reportexamples.rule1.example4;

import java.io.PrintStream;

public class HtmlHello {

	public String name;

	public HtmlHello(String name) {
		this.name = name;
	}

	public void sayHello(PrintStream print) {
		HtmlElement htmlElement = new HtmlElement("hello");
		htmlElement.print(print);
	}

	public static void main(String[] args) {
		HtmlHello hello = new HtmlHello("Fabian");
		hello.sayHello(System.out);
	}
}
