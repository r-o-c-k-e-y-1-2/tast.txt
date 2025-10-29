package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class compare1 {

		Integer rno;
		String name;
		Integer mark;
		compare1(Integer rno,String name,Integer mark)
		{
			this.mark=mark;
			this.rno=rno;
			this.name=name;
		}
		public String toString()
		{
			return rno+" "+name+" "+mark;
		}
	}
	class user2 implements Comparator
	{
		
		public int compare(Object a,Object b)
		{
			compare1 x=(compare1)a;
			compare1 y=(compare1)b;
			if(x.mark<y.mark)
				return 1;
			else if(x.mark>y.mark)
				return -1;
			else
				return 0;
			
		}
	}
	public class compare implements Comparator<compare1>{
		
	     public int compare(compare1 s1,compare1 s2)
	     {
	    	 if(s1.rno<s2.rno)
	    		 return -1;
	    	 else if(s1.rno>s2.rno)
	    		 return 1;
	    	 else
	    		 return 0;
	     }
		public static void main(String[] args) {
		   
//			ArrayList<Integer> al=new ArrayList<>();
//			al.add(30);
//			al.add(10);
//			al.add(50);
//			al.add(20);
//			Collections.sort(al);
//			System.out.println(al);
			ArrayList<compare1> li=new ArrayList<>();
			li.add(new compare1(2,"B",80));
			li.add(new compare1(1,"C",60));
			li.add(new compare1(4,"D",70));
			li.add(new compare1(3,"E",90));
			System.out.println(li);
			Collections.sort(li,new compare());
			System.out.println(li);
			Collections.sort(li,new user2());
			System.out.println(li);
		}

	}
