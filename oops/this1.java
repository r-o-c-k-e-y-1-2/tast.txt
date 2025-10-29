package oops;

public  class this1 {
	 int a;
	 int b;
   this1(int a,int b){
	  this. a=a;
	   this.b=b;
   }
   
   
	   void display() {
		   System.out.println(a+" "+b);
		   
	   }
   

	public static void main(String[] args) {
		this1 b=new this1(10,5);
		b.display();

	}

}
