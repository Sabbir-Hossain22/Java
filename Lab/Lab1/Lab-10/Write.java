package lab21;

import java.io.*;

public class Write {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("myFile.txt");

			fw.append("File in java is tricky\n");
			fw.append("But it is fun\n");
			Circle c1 = new Circle(10);
			fw.append(c1.getArea());
			fw.close();
		} catch (IOException ie) {
			System.out.println("File Error");
		}

	}
}