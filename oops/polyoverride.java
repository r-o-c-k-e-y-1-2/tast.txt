package oops;
import java.util.Scanner;

 class ex6 {
     
	 double a,n,r;
	 double s,p;
	 void intrest() {
		s=a*n*r/100;
		
	 }
 }
 class canara extends ex6{
	 void intrest() {
		 r=13;
		 s=a*n*r/100; 
		 System.out.println(s);
 }
 
 }
 class idbi extends ex6{
	 void intrest() {
		 r=18;
		 s=a*n*r/100; 
		 System.out.println(s);
	 }
	 }
 class Equatas extends ex6{
	 void intrest() {
		 r=18;
		 s=a*n*r/100; 
		 System.out.println(s);
	 }
	 }
 
 public class polyoverride extends ex6{
	 
 
	public static void main(String[] args) {
		
		 polyoverride obj=new  polyoverride();
		 
		 Scanner sd=new Scanner(System.in);
		 System.out.println("enter the amount");
		 obj.p=sd.nextDouble();
		 System.out.println("enter the number of years");
		 obj.n=sd.nextDouble();
		 
		 canara obj1=new canara();
		 obj1.intrest();
		 idbi obj2=new idbi();
          
		 
		 
		 
	}

 }
