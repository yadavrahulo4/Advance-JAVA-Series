package yadavrahuhlo4.javaSeries.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileInputStream = new FileInputStream("src\\yadavrahuhlo4\\javaSeries\\iostreams\\source.txt");
			fileOutputStream = new FileOutputStream("src\\yadavrahuhlo4\\javaSeries\\iostreams\\dest.txt");

			// reads a byte at a time,if it reached end of a file ,returns -1
			int content;
			while ((content = fileInputStream.read()) != -1) {
				fileOutputStream.write((byte) content);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				fileInputStream.close();
			}
			if (fileOutputStream != null) {
				fileOutputStream.close();
			}

		}
	}

}
