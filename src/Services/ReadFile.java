package Services;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFile {

	String points;
	String points2;

	

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
	
	
	/////////////////////
	
	public String readPoints2() {
		Properties prop = new Properties();
		try {
			InputStream input = new FileInputStream("resources\\villeEuler.properties");
			// loads the file properties
			prop.load(input);
			points2 = prop.getProperty("points2");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return points2;
	}
	
	
	
	
	
}
