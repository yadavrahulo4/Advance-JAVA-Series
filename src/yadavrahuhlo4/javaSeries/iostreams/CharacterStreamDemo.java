package yadavrahuhlo4.javaSeries.iostreams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
	public static void main(String[] args) throws IOException {

		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {

			fileReader = new FileReader("src\\yadavrahuhlo4\\javaSeries\\iostreams\\source.txt");
			fileWriter = new FileWriter("src\\yadavrahuhlo4\\javaSeries\\iostreams\\dest.txt");

			// reads a byte at a time,if it reached end of a file ,returns -1
			int content;

			while ((content = fileReader.read()) != -1) {
				fileWriter.append((char) content);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (new File("src\\yadavrahuhlo4\\javaSeries\\iostreams\\dest.txt").exists()) {
				System.out.println("FILE CREATED(dest.txt) and text written from source.txt");
			}
			if (fileReader != null) {
				fileReader.close();
			}
			if (fileWriter != null) {
				fileWriter.close();
			}

		}
	}
}
