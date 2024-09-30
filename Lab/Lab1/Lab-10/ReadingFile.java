package lab21;

import java.io.*;

public class ReadingFile {

	public static void main(String[] args) {
		BufferedReader b1, b2;
		try {
			b1 = new BufferedReader(new FileReader("myFile.txt"));
			System.out.println("Reading using readLine() Method");
			String content = b1.readLine();
			while (content != null) {
				System.out.println(content);
				content = b1.readLine();
			}
			
			System.out.println("\nreding using read() Method");
			b2 = new BufferedReader(new FileReader("myFile.txt"));
			int num;
			char ch;

			while ((num = b2.read()) != -1) {
				ch = (char) num;
				System.out.print(ch);
			}

		} catch (IOException ie) {
			System.out.println("File not found");
		}
	}

}
