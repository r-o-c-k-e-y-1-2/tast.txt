package oops;

 class honey{
	int a;
	int b;
	honey(){
		System.out.println("defalut constructor");
	}
	honey(int a,int b){
	         
		this();
			System.out.println(a+""+b);
		}
	}

public class superoff extends honey{
	
	int a;
	int b;
	
	superoff(){
		System.out.println(a+""+b);
	}
	superoff(int a,int b){
		this();
		super.a=a;
		super. b=b;
		
				
		System.out.println(a+""+b);
	}	
	

public static void main(String args[]) {
	
	    superoff obj=new superoff(10,30);
	
	
}
	}
	
	
