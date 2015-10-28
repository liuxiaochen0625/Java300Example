package chapter3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out1 = System.out;
		PrintStream out2 = new PrintStream("log.txt");
		System.setOut(out2);
		System.out.print(11);
		System.setOut(out1);
		System.out.println(11);
	}

}
