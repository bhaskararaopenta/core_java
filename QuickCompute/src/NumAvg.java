import java.util.*;

public class NumAvg {

	private TreeSet<Integer> numSet = new TreeSet<Integer>();

	// Write code for getter and setter

	public TreeSet<Integer> getNumSet() {
		return numSet;
	}

	public void setNumSet(TreeSet<Integer> numSet) {
		this.numSet = numSet;
	}

	public void addNum(int num) {
		if (num % 5 != 0 && num % 6 != 0) {
			numSet.add(num);
		}
	}

	public double calAvg() {

		double res = 0.0;

		Iterator<Integer> itr = numSet.iterator();
		while (itr.hasNext()) {
			Integer num = itr.next();
			res = res + num;
		}
		return res / numSet.size();
	}
}
