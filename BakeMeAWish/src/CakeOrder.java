import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class CakeOrder {

	private Map<String, Double> orderMap = new HashMap<String, Double>();

	public Map<String, Double> getOrderMap() {
		return orderMap;
	}

	public void setOrderMap(Map<String, Double> orderMap) {
		this.orderMap = orderMap;
	}

	public void addOrderDetails(String orderId, double cakeCost) {
		// Fill the code here
		orderMap.put(orderId, cakeCost);

	}

	public Map<String, Double> findOrdersAboveSpecifiedCost(double cakeCost) {
		// Fill the code here
		HashMap<String, Double> newOne = new HashMap<String, Double>();
		Set<Entry<String, Double>> setEntry = orderMap.entrySet();
		Iterator<Entry<String, Double>> abc = setEntry.iterator();
		while (abc.hasNext()) {
			Entry<String, Double> bca = abc.next();
			if (bca.getValue() > cakeCost) {
				newOne.put(bca.getKey(), bca.getValue());
			}

		}

		return newOne;
	}

}
