package FileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
//Just run it and see the magic goes!
public class filewriter {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many lines will the file have?");
		int numberLines = sc.nextInt();
		System.out.println("Rewrite file? Y/N?");
		String about = sc.next();
		FileWriter file;

		if (about.equalsIgnoreCase("Y")) {
			file = new FileWriter("teste.txt");

		} else {
			file = new FileWriter("teste.txt", true);

		}

		PrintWriter writer = new PrintWriter(file);
		for (int i = 1; i <=numberLines; i++) {
			writer.printf("Line number " + i + "%n");

		}
		file.close();
		System.out.println("Done");

	}
}

