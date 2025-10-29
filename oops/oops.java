package oops;

 class ex1 {
     int a=10;
 }
 
	class ex2 extends ex1{
		int empid=123;
	}
	class ex3 extends ex2{
		
		int empage=24;
	}
 public	class oops extends ex3 {
		int display() {
			System.out.println("rockey");
			return a;
	}
	public static void main(String[] args) {
 
          oops obj=new oops(); 
          obj.display();
            System.out.println(obj.a);
            System.out.println(obj.empid);
            System.out.println(obj.empage);
            
	}

}
 
