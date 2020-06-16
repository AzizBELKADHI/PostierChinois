package GUI;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JComponent;
import javax.swing.JPanel;

import Services.CoordinatesPoints;
import Services.Point;

public class DrawingNonEuler extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7685529498775382257L;

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.BLACK);

		CoordinatesPoints coordinatesPoints = new CoordinatesPoints();

		ArrayList<Point> listPoint = new ArrayList<Point>();

		HashMap<String, List<String>> listAdj = new HashMap<String, List<String>>();
		listAdj.put("G", Arrays.asList("H", "I"));
		listAdj.put("H", Arrays.asList("G", "I", "J"));
		listAdj.put("I", Arrays.asList("G", "H", "K"));
		listAdj.put("J", Arrays.asList("H", "K"));
		listAdj.put("K", Arrays.asList("I", "J"));

		// stockage des points dans une liste <Point>
		for (int i = 0; i < coordinatesPoints.getPoint2().size(); i++) {
			listPoint.add(new Point(coordinatesPoints.getPoint2().get(i).get("id"),
					Integer.parseInt(coordinatesPoints.getPoint2().get(i).get("x")),
					Integer.parseInt(coordinatesPoints.getPoint2().get(i).get("y"))));
		}

		for (int j = 0; j < listPoint.size(); j++) {
			List<String> ss = listAdj.get(listPoint.get(j).getId());
			for (int it = 0; it < ss.size(); it++) {

				int pos = this.isExist(listPoint, ss.get(it));
				Point p = listPoint.get(pos);

				g2.drawString(listPoint.get(j).getId(), listPoint.get(j).getX(), listPoint.get(j).getY());
				g2.drawLine(listPoint.get(j).getX(), listPoint.get(j).getY(), p.getX(), p.getY());
			}
		}

	}

	public int isExist(List<Point> l, String id) {
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).getId().equals(id))
				return i;
		}
		return -1;
	}
}
