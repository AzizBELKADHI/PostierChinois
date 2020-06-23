package Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlgoEuler {

	public List<String> cycleEuler(String sommet, HashMap<String, List<String>> listAdj, int nbArete) {
		List<String> listSommet = new ArrayList<String>();
		listSommet.add(sommet);
		List<Adjacence> arete = new ArrayList<Adjacence>();
		int j = 0;
		for (int i = 0; i < nbArete; i++) {
			if (arete.isEmpty()) {
				List<String> adj = listAdj.get(listSommet.get(j));
				arete.add(new Adjacence(listSommet.get(j), adj.get(0)));
				listSommet.add(adj.get(0));
			} else {
				List<String> adj = listAdj.get(listSommet.get(j));
				int it = 0;
				boolean test = false;
				while ((it < adj.size()) && (test == false)) {
					System.out.println("pos " + isExist(listSommet, adj));
					if (isExist(listSommet, adj) != -1) {
						arete.add(new Adjacence(listSommet.get(j), adj.get(isExist(listSommet, adj))));
						listSommet.add(adj.get(isExist(listSommet, adj)));
						test = true;
					} else if (!isArete(arete, listSommet.get(j), adj.get(it))) {
						arete.add(new Adjacence(listSommet.get(j), adj.get(it)));
						listSommet.add(adj.get(it));
						test = true;
					}
					it++;
				}

			}
			j++;
		}

		return listSommet;
	}

	public int isExist(List<String> l, List<String> key) {
		int pos = -1;

		for (int i = 0; i < key.size(); i++) {
			boolean test = false;
			int j = 0;
			while (j < l.size() && test == false) {
				if (!(key.get(i).equals(l.get(j)))) {
					j++;
				} else {
					test = true;
				}
			}
			if (test == false) {
				pos = i;
			break;
			}
		}
		return pos;
		
	}



	public boolean isArete(List<Adjacence> l, String key, String value) {
		boolean test = false;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).getA().equals(key) && l.get(i).getB().equals(value)) {
				test = true;
			}
			if (l.get(i).getA().equals(value) && l.get(i).getB().equals(key)) {
				test = true;
			}
		}
		return test;
	}

	/*public static void main(String[] args) {
		HashMap<String, List<String>> listAdj = new HashMap<String, List<String>>();
		listAdj.put("A", Arrays.asList("B", "C"));
		listAdj.put("B", Arrays.asList("A", "C", "D", "E"));
		listAdj.put("C", Arrays.asList("A", "B", "D", "E"));
		listAdj.put("D", Arrays.asList("B", "C", "E", "F"));
		listAdj.put("E", Arrays.asList("B", "C", "D", "F"));
		listAdj.put("F", Arrays.asList("D", "E"));

		AlgoEuler algoEuler = new AlgoEuler();
		System.out.println(algoEuler.cycleEuler("C", listAdj));
		// System.out.println(listAdj);
	}*/

}
