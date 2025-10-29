package collection;
import java.util.*;

 class lib1 {
	 
	 String Author;
	 String Title;
	 Integer Copies;
	 
	 lib1(String a,String b,Integer c){
		 Author=a;
		 Title=b;
		 Copies=c;
	 }
	 public String toString() {
		return Author+""+Title+""+Copies;
		 
	 }
 }
	 public  class Task1 implements Comparator<lib1>{
		 public int compare(lib1 a, lib1 b) {
			
			 if(a.Copies<b.Copies)
				 return -1;
			 else if(a.Copies>b.Copies)
			 return 1;
			 else
				 return 0;
		 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<lib1> a=new ArrayList<>();
		a.add(new lib1("hari","Maths",60));
		a.add(new lib1("hari","Ct",50));
		a.add(new lib1("hari","Em1",43));
		a.add(new lib1("vetri",".net",32));
		a.add(new lib1("vetri","Html",22));
		a.add(new lib1("amalek","Python",38));
		a.add(new lib1("amalek","DBMS",70));
		a.add(new lib1("radha","Tamil",83));
		a.add(new lib1("radha","English",54));
		Collections.sort(a,new Task1());
		System.out.println("Enter Author Name:");
		String c=sc.next();
		
		Iterator<lib1> i=a.iterator();

		while(i.hasNext()) {
		lib1  l=(lib1)i.next();
		
		if(l.Author.equals(c)) {
		
			System.out.println(l.Title+"-"+l.Copies);
		}
		}
	}
	 }
	 
