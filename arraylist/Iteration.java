package arraylist;
import java.util.ArrayList;

 public class Iteration{
	
	Integer id;
	String name;
	Integer salary;
	


public  Iteration(Integer A,String B,Integer C){
	id=A;name=B;salary=C;
}
public String toString() {
	return "ID:"+id+"Name:"+name+" "+"salary"+salary;
	
}
public static void main (String args[]) {
	ArrayList <Iteration> R=new ArrayList<>();
	R.add(new Iteration(456,"Rockey",18000));
	R.add(new Iteration(897,"Amleak",88000));
	R.add(new Iteration(331,"Hari",43000));
	Iteration A=new Iteration(678,"Asahf",33000);
	R.add(A);
	
	for(int i=0;i<R.size();i++) {
		System.out.println(R.get(i));
	}
}
}