import java.util.*;

public class Products {

	private List<String> productList = new ArrayList<String>();

	// Write code for getter and setter

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}

	public List<String> getProductList() {
		return this.productList;
	}

	public void addProductToList(String product) {
		productList.add(product);

	}

	public void sortProductList() {
		Collections.sort(productList);

		for (String s : productList) {
			System.out.println(s);
		}
	}
}
