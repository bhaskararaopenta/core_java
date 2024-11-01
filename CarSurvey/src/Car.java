import java.util.*;
import java.util.Map.Entry;

public class Car {

	Map<String, Integer> carMap = new TreeMap<String, Integer>();

	// Include getter and setter
	public Map<String, Integer> getCarMap() {
		return carMap;
	}

	public void setCarMap(Map<String, Integer> carMap) {
		this.carMap = carMap;
	}

	public void addCar(String name, int num) {
		// Code here
		if (!carMap.containsKey(name)) {
			carMap.put(name, num);
		}
	}

	public int carByName(String name) {
		if (carMap.isEmpty()) {
			System.out.println("The map is empty");
		} else if (!carMap.containsKey(name)) {
			System.out.println("Car not found");
		}
		Integer value = carMap.getOrDefault(name, -1);

		return value;
	}

	public List<String> carByCount(int count) {
		// Code here
		List<String> result = new ArrayList<>();
		if (carMap.isEmpty()) {
			System.out.println("The map is empty");
		}
		Set<Entry<String, Integer>> abcd = carMap.entrySet();
		Iterator<Entry<String, Integer>> itr = abcd.iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> value = itr.next();
			if (value.getValue() >= count) {

				result.add(value.getKey());
			}

		}
		return result;

	}

	public int totalCarsSold() {
		// Code here
		if (carMap.isEmpty()) {
			System.out.println("The map is empty");
		}
		int sum = 0;
		Set<Entry<String, Integer>> abcd = carMap.entrySet();
		Iterator<Entry<String, Integer>> dcba = abcd.iterator();
		while (dcba.hasNext()) {
			Entry<String, Integer> ewww = dcba.next();
			sum = sum + ewww.getValue();
		}
		return sum;
	}

}
