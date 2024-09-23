import java.util.Map;
import java.util.HashMap;

public class Country {

	private Map<String, String> countryMap = new HashMap<String, String>();

	// Write code for getter and setter

	public void add(String cname, String capname) {
		// Code here
		countryMap.putIfAbsent(cname, capname);

	}

	public Map<String, String> getCountryMap() {
		return countryMap;
	}

	public void setCountryMap(Map<String, String> countryMap) {
		this.countryMap = countryMap;
	}

	public String search(String cname) {
		// Code here
		String mapp = countryMap.getOrDefault(cname, "Data not found");

		return mapp;
	}
}
