package oops;

class a{
	int a;
	int b;
	int c;

	 public void display(int a,int b) {
    c=a+b;
	int d=a-b;
	System.out.println(c);
	System.out.println(d);
	
	}
} 


public class heriarical extends a{
	public void show(int a,int b) {
		   int e=a*b;
		   int f=a/b;
		   int g=a%b;
		   System.out.println(e);
		   System.out.println(f);
		   System.out.println(g);
	   }

	public static void main(String[] args) {
		
		heriarical obj=new heriarical();
		obj.display(10,20);
		obj.show(10,20);

	}

}


