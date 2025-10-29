package arraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class types {

		public static void main(String[] args)  {
			ArrayList<Integer> al=new ArrayList<>();
			al.add(30);
			al.add(20);
			al.add(30);
			al.add(null);
			al.add(10);
			al.add(1,50);
			//al.set(0, 300);
			//al.remove(0);
			System.out.println(al);
			ArrayList<Integer> al2=new ArrayList<>();
			al2.add(100);
			al2.add(200);
			//al2.addAll(al);
			al2.addAll(1, al);
			System.out.println(al.contains(500));
			System.out.println(al2);
			//al2.removeAll(al);
			al2.retainAll(al);
			System.out.println(al);
			System.out.println(al2);
			System.out.println(al.size());
			System.out.println(al.get(0));
			System.out.println(al.indexOf(30));
			System.out.println(al.lastIndexOf(30));
			//al.clear();
			System.out.println(al);
			System.out.println(al.isEmpty());
			ArrayList li=new ArrayList();
			li.add(1000);
			li.add("hello");
			li.add('A');
			li.add(null);
			System.out.println(li);
			Integer a=al.get(0);
			System.out.println(a);  
			Integer b=(Integer)(li.get(0));
			System.out.println(b);
			String s=(String)li.get(1);
			System.out.println(s);
			java.lang.Object[] arr=li.toArray();
			System.out.println(Arrays.toString(arr));
			System.out.println(li);
						}
		}
		

	
