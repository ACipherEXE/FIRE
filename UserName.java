package FIRE;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserName {
	private String filename;

	public String getFilename() throws IOException {

		FileInputStream fStream = new FileInputStream(filename);
		DataInputStream in = new DataInputStream(fStream);
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		String st = null;
		while ((st = br.readLine()) != null) {
			return st;
		}
		return st;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
/**
 * 
 * @param filename = enter .txt file here. Note: KEEP IT IN THE FOLDER DO NOT EDIT!
 * @throws FileNotFoundException
 */
	public UserName(String filename) throws FileNotFoundException {
		this.filename = filename;

	}

	public String toString() {
		return filename;

	}
}
