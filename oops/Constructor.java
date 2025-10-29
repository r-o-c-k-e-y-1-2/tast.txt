package oops;

 class Constructor1{
	   int a= 10;
	   int b=20;
	   Constructor1(){
		   int c=a+b;
		   System.out.println(c);
	   }
	  
		
	  
	   }	   
	   
public class Constructor extends Constructor1{
	 Constructor(int a,int b){
			int d=a*b;
			System.out.println(d);
			
		}
	
	public static void main(String[] args) {
		
		Constructor B=new Constructor(10,20);
		
		
		

	}

}
