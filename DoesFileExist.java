package takeHome2;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DoesFileExist {
	static String filePath = "C:\\Users\\rbuck\\eclipse-workspace\\takeHomePracticalQuestions\\src\\TakeHome\\HWFile.properties";

	public static void main(String[] args) {

		doesFileExist(filePath);
		Reader();
	}

	public static void doesFileExist(String path) {
		File file = new File(path);
		try {
			if (file.exists()) {
				System.out.println("The file exists and is located at: " + file);
			} else {
				System.out.println("The file does not exist: " + file);
			}
		} catch (Exception e) {
			System.out.println("Access to the file is denied.");

		}
	
	}

	public static void Reader() {

		try 
		(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			int wordCount = 1;

			while ((line = br.readLine()) != null) {
				String[] parts = line.split("-");
				String word = parts[0].trim();
				String[] meanings = parts[0].split(",");

				System.out.println("Word " + wordCount + ":");
				System.out.println(word);
				for (String meaning : meanings) {
					System.out.println(meaning.trim());
				}
				wordCount++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
