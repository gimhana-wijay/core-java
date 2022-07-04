package main.java;

import java.util.ArrayList;

import com.accelaero.aeropay.core.systemwide.Empty;

public class Test {
	public static void main(String args[]) {
		ArrayList<String> aa = new ArrayList<>();
		String a = null;
		String b = "b";
		if (Empty.isNotEmpty(a)) {
			System.out.println(a);
		}
		if (Empty.isNotEmpty(b)) {
			System.out.println(b);
		}
	}
}
