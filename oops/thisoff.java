package oops;

public class thisoff {

	thisoff(){
		System.out.println("defalut constructor");
	}
	
	thisoff(int x,int y,int z){
		this();
		System.out.println(x+" 2 perameter"+y);
	}
	
	
	thisoff(int a,int b,int c,int d ){
		
		this(a,b,c);
		System.out.println("yughoiuh"+d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              thisoff b=new thisoff(4,5,6,8);
	}

}
