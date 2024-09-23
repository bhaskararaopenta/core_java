package com.day7.stringsPrograms;

public class PrimeIndexValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefgh";
		String p = "";
		String nP = "";

		for (int i = 0; i < s.length(); i++) {
			if (prime(i)) {
				p = p + s.charAt(i);
			}else {
				nP=nP+s.charAt(i);
			}
		}
		System.out.println(p+nP);

	}

	public static boolean prime(int i) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				count++;
			}
		}

		return count == 2;
	}

}
