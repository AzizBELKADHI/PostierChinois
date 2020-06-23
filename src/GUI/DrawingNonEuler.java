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

		// stockage des points dans une liste <Point>
		for (int i = 0; i < coordinatesPoints.getPoint2().size(); i++) {
			listPoint.add(new Point(coordinatesPoints.getPoint2().get(i).get("id"),
					Integer.parseInt(coordinatesPoints.getPoint2().get(i).get("x")),
					Integer.parseInt(coordinatesPoints.getPoint2().get(i).get("y"))));
		}

		for (int j = 0; j < listPoint.size(); j++) {
			List<String> ss = this.listAdj().get(listPoint.get(j).getId());
			for (int it = 0; it < ss.size(); it++) {

				int pos = this.isExist(listPoint, ss.get(it));
				Point p = listPoint.get(pos);

				if (listPoint.get(j).getId().equals("0") || listPoint.get(j).getId().equals("1")
						|| listPoint.get(j).getId().equals("2") || listPoint.get(j).getId().equals("3")) 
					g2.drawString(listPoint.get(j).getId(), listPoint.get(j).getX(), listPoint.get(j).getY()-10);
					if (listPoint.get(j).getId().equals("4") || listPoint.get(j).getId().equals("7")) 
						g2.drawString(listPoint.get(j).getId(), listPoint.get(j).getX()-20, listPoint.get(j).getY());
						if (listPoint.get(j).getId().equals("6") || listPoint.get(j).getId().equals("5")) 
							g2.drawString(listPoint.get(j).getId(), listPoint.get(j).getX()+10, listPoint.get(j).getY());
					
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
	
	
	
	public HashMap<String, List<String>> listAdj(){
		HashMap<String, List<String>> listAdj = new HashMap<String, List<String>>();
		listAdj.put("0", Arrays.asList("1", "2", "3", "4"));
		listAdj.put("1", Arrays.asList("0", "3", "4", "5"));
		listAdj.put("2", Arrays.asList("0", "4"));
		listAdj.put("3", Arrays.asList("0", "1", "5"));
		listAdj.put("4", Arrays.asList("0", "1", "2", "5", "6", "7"));
		listAdj.put("5", Arrays.asList("1", "3", "4", "6"));
		listAdj.put("6", Arrays.asList("4", "5", "7"));
		listAdj.put("7", Arrays.asList("4", "6"));
		return listAdj;
	}
	
	
}
