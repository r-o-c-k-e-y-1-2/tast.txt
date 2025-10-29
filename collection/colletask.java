package collection;
import java.util.*;

 class Primarydata {
   String number;
   String name;

   Primarydata(String name, String number){
	   
	   this.number=number;
	   this.name=name;
	   
   }
   public String toString() {
	   return number+" "+name;
   }
 }
 
   class Secondarydata{
	   String number;
	   String Address;
	   
	   Secondarydata(String number,String Address){ 
		   this.Address=Address;
		   this.number=number;
		   
	   }
	   public String toString() {
		   return number+" "+Address;
	   }
   }
   
	   public class colletask{
		   
		   public static void main(String args[]) {
			   
			   Primarydata obj1=new  Primarydata("7200819886","Rajan");
			   Primarydata obj2=new  Primarydata("7200819886","guna");
			   
			   Secondarydata s2=new Secondarydata("9943331639","Rajan");
			   Secondarydata S1=new Secondarydata("7200819886","velu");
 
			   HashMap<String,String> obj3=new HashMap <>();
			   obj3.put(obj1.number,obj1.name);
			   obj3.put(obj2.number,obj2.name);
			   
			   System.out.println(obj3);
			   
			   HashMap<String,String> obj4=new HashMap <>();
			   obj4.put(S1.number,S1.Address);
			   obj4.put(S1.number,S1.Address);
			   
			   System.out.println(obj4);
			   
			   HashMap<String,String> obj5=new HashMap <>();
			   Set st1=obj3.keySet();
			   Set st2=obj4.keySet();
			   
			   Iterator i1=st1.iterator();
			   Iterator i2=st2.iterator();
			    
			   while(i1.hasNext()) {
				   
				   while(i2.hasNext()) {
					   
					   String x=(String)i1.next();
					   String y=(String)i2.next();
					   
					   if(x.equals(y));
					   
					   obj5.put(x,(obj3.get(x)+""+obj4.get(x)));
				   }
			   }   
		   }
	 
	   }
   

