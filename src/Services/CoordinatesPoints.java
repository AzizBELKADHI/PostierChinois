package Services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CoordinatesPoints {
	public CoordinatesPoints() {}
	
	public List<Map<String, String>> getPoint()  {
		ReadFile readFile = new ReadFile();
		String points = readFile.readPoints();

		List<Map<String, String>> scenas = new ArrayList<>();
		Map<String, String> map;
		String[] tabscenas = points.split("/");
		for (int i = 0; i < tabscenas.length; i++) {
			map = new TreeMap<>(new Comparator<String>() {

				@Override
				public int compare(String h1, String h2) {
					return h1.compareTo(h2);
				}

			});
			String[] tabscen = tabscenas[i].split(";");

			for (int j = 0; j < tabscen.length; j++) {
				String[] tabVals = tabscen[j].split(":");

				for (int k = 0; k < tabVals.length - 1; k++) {
					map.put(tabVals[k], tabVals[k + 1]);

				}
			}

			scenas.add(map);
		}
		return scenas;
	}
	
	
	/*public static void main(String[] args) {
		CoordinatesPoints coordinatesPoints = new CoordinatesPoints();
		System.out.println(coordinatesPoints.getPoint());
		
	}*/
}
