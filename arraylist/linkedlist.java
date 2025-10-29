package arraylist;
import java.util.*;


public class linkedlist {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();

		li.add(20);
		li.add(43);
		li.add(77);
		li.add(77);
		li.add(90);
		
		li.add("vakam da mapla");
		li.addFirst("hari");
		li.removeLast();
		li.addLast("extra");
		li.getLast();
		
		System.out.println(li.indexOf("extra"));
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
			
		}
		
	}
}
