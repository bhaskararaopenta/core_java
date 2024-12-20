import java.util.HashSet;
import java.util.Iterator;

public class ClassHouseFormation {

	HashSet<String> studSet = new HashSet<String>();

	// Incude getters and setters

	public HashSet<String> getStudSet() {
		return studSet;
	}

	public void setStudSet(HashSet<String> studSet) {
		this.studSet = studSet;
	}

	public void addName(String details) {
		String[] res = details.split(":");
		String name = res[1];
		studSet.add(name);
	}

	public HashSet<String> formTeam() {
		HashSet<String> hs = new HashSet<String>();
		Iterator<String> itr = getStudSet().iterator();
		
		
		while (itr.hasNext()) {
			String name = itr.next();
			char firstLetter = name.toUpperCase().charAt(0);
			String house;

			if (firstLetter >= 'A' && firstLetter <= 'H') {
				house = "RED";
			} else if (firstLetter >= 'I' && firstLetter <= 'P') {
				house = "BLUE"; 
			} else {
				house = "GREEN";
			}

			hs.add(name + ":" + house);
		}
		return hs;
	}

}
