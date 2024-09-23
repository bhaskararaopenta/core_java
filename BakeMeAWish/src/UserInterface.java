import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	public static void main(String args[]) {
		CakeOrder co = new CakeOrder();
		Scanner sc = new Scanner(System.in);

		// Fill the code here
		System.out.println("Enter number of cakes to be added");
		int count = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the cake order details (Order Id:CakeCost)");
		for (int i = 1; i <= count; i++) {
			String abc = sc.nextLine();
			String[] cba = abc.split(":");
			String orderId = cba[0];
			double price = Double.parseDouble(cba[1]);

			co.addOrderDetails(orderId, price);
		}
		System.out.println("Enter the cost to search the cakes orders");
		int counted = sc.nextInt();
		Map<String, Double> result = co.findOrdersAboveSpecifiedCost(counted);
		if (result.isEmpty()) {
			System.out.println("No cakes orders found");
		} else {
			Set<Entry<String, Double>> es = result.entrySet();
			Iterator<Entry<String, Double>> itr = es.iterator();
			while (itr.hasNext()) {
				Entry<String, Double> abc = itr.next();

				System.out.println("Order ID:" + abc.getKey() + ", Cake Cost :" + abc.getValue());
			}
		}
	}
}