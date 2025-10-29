package oops;

class bank {
	double a,b,c;
	bank(double ba)
	{
		c=ba;
	}
	
	
  void intrest(){
	    	b=this.c*0.12;
	    	c=b+this.c;
	    	System.out.println("your bank balace is"+c);
	    	System.out.println("your intrest is"+b);
	    	System.out.println("your current balance is"+c);
	    	
	    }
}
class hdfc extends bank{
	hdfc(double ba){
		super(ba);
		
	}

    void intrest(){
    	b=super.c*0.12;
    	c=b+super.c;
    	System.out.println("your bank balace is"+c);
    	System.out.println("your intrest is"+b);
    	System.out.println("your current balance is"+c);
    	
    }
}
    
    class axis extends bank{
    	axis(double ba){
    		super(ba);
    		
    	}

        void intrest(){
        	b=super.c*0.18;
        	c=b+super.c;
        	System.out.println("your bank balace is"+c);
        	System.out.println("your intrest is"+b);
        	System.out.println("your current balance is"+c);
        	
        } 
    }

        
        class sbi extends bank{
        	sbi(double ba){
        		super(ba);
        		
        	}
        
            void intrest(){
            	b=super.c*0.20;
            	c=b+super.c;
            	System.out.println("your bank balace is"+c);
            	System.out.println("your intrest is"+b);
            	System.out.println("your current balance is"+c);
            	
            }
        }
        
            
    public class methodoverride extends bank{
    	methodoverride(double ba){
    		super(ba);
    	}
    	
    	public static void main(String args[]) {
    		bank obj =new bank(5000);
    		axis obj1=new axis(2000);
    		obj1.intrest();
    		
    	}
    }
       
        
    
