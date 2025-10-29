package arraylist;

import java.util.ArrayList;

public class Task5 {

	public static void main (String args[]) {
		ArrayList<Integer> R = new ArrayList<>();
		R.add(10);
		R.add(30);
		R.add(40);
		R.add(40);
		R.add(80);
		R.add(90);

        // This loop is functionally correct.
		for(int i = 0; i < R.size(); i++) {
			System.out.println(R.get(i));
		}
	}
}
