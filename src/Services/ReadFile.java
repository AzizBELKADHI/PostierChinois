package Services;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFile {

	String points;

	public ReadFile() {
	}

	public String readPoints() {
		Properties prop = new Properties();
		try {
			InputStream input = new FileInputStream("resources\\villeEuler.properties");
			// loads the file properties
			prop.load(input);
			points = prop.getProperty("points");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return points;
	}
}
