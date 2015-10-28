package chapter3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrintErrorAndDebug {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main function begins!");
		System.err.println("print error information!");
		System.setIn(new FileInputStream("D:\\THIRDPARTYLICENSEREADME.txt"));
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			System.out.println(scanner.nextLine());
		}
	}

}
