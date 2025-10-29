package oops;

public class ploymorphism {

	void add(){
	
	int a=10;
	int b=20;
	int c=a*b;
	System.out.println(c);
	}
	
	
	void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
	
        ploymorphism fish=new ploymorphism();
        
        fish.add(20,30);
        fish.add(120,60);
        
        
	}

}
