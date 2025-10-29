package arraylist;
import java.util.ArrayList;

public class task1 {

public static void main (String[] args) {
	ArrayList <Integer> A = new ArrayList<>();
	
	
	A.add(30);
	A.add(40);
	A.add(60);
	A.add(90);
	A.add(65);
	ArrayList <Integer> B =(ArrayList <Integer>)A.clone();
	System.out.println(B);
	
	
}
}
