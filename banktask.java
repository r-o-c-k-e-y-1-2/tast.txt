package Array;


import java.util.*;
public class banktask {
	int AC_NO,pwd;int q=0;
	String User_Name;
	double Amt, Amount;
	double Balance=7000;
	 Scanner s=new Scanner(System.in);
	
public void UserDetails() {User_Name="Rockey";AC_NO=78450180;pwd=6969;	}
void Deposit() {Amount=Balance+Amt;}
  void Widthral() {Amount=Balance-Amt;}
  void cont() {
	 try {
	System.out.println(" DO YOU CONTINUE");
	System.out.println(" 4.EXIT");
	System.out.println(" 5.YES");
	q=s.nextInt();}
	 catch(InputMismatchException e){
		 System.out.println("PLZ ENTER VALID DATA");
			s.nextLine();
			cont();
	 }
  }
  
	public static void main(String[] args) {
		banktask b=new banktask();
		b.UserDetails();
		b.Deposit();
		b.Widthral();
		//b.cont();
		System.out.println("*WELCOME TO ATM  ******");
		
		System.out.print("USER NAME=");
		String a=b.s.next();
		System.out.print("PASSWORD=");
		int p=b.s.nextInt();
		if(p==b.pwd){
			
			while(b.q!=4) {
				try {
			System.out.println("1.WIDTHRAL");
			System.out.println("2.DEPOSIT");
			System.out.println("3.CHECK BALANCE");
			System.out.println("4.EXIT");
			System.out.println("PLZ ENTER YOUR PROCESS");
			b.q=b.s.nextInt();}
				catch(InputMismatchException e) {System.out.println("PLZ ENTER VALID DATA");
				b.s.nextLine();
				b.cont();}
			switch(b.q) {
			case 2:
				try {
				System.out.print("USER NAME=");
				 a=b.s.next();
				System.out.print("PASSWORD=");
				 p=b.s.nextInt();
				if(p==b.pwd){
				System.out.println("ENTER DEPITED AMOUNT");
				b.Amt=b.s.nextDouble();
				b.Deposit();
				System.out.println(" Amount is ADDED");}
				else{
					  System.out.println("INVALID USER ");
					  b.cont();
					  }}
				catch(InputMismatchException e) {
					System.out.println("PLZ ENTER VALID DATA");
					b.s.nextLine();
					b.cont();
					
				}
				
				break;
				
			case 1:
				try {
				System.out.print("USER NAME=");
				 a=b.s.next();
				System.out.print("PASSWORD=");
				 p=b.s.nextInt();
				if(p==b.pwd){
					
				System.out.println("ENTER WIDTHRAL AMOUNT");
				b.Amt=b.s.nextDouble();
				if(b.Balance<b.Amt) {System.out.println("invalid balance");}
				
				b.Widthral();
				System.out.println("WIDTHRAL SUCCESSFULLY");}
				else{System.out.println("INVALID USER ");}
				b.cont();}
			catch(InputMismatchException e) {System.out.println("PLZ ENTER VALID DATA");
				b.s.nextLine();
				b.cont();
				
				}
				break;
			case 3:try {
				System.out.print("USER NAME=");
			 a=b.s.next();
			System.out.print("PASSWORD=");
			 p=b.s.nextInt();
			if(p==b.pwd){
				System.out.println("YOUR BALANCE IS="+b.Amount);
				b.UserDetails();}else{System.out.println("INVALID USER ");}
			b.cont();}catch(InputMismatchException e) {System.out.println("PLZ ENTER VALID DATA");
			b.s.nextLine();
			b.cont();}
				break;
			case 4:

				System.out.println("thnking you for using this atm");
				break;
				default:

					System.out.println("sorry plz try angain ");
			
				
			}
			}System.out.println("thnking you for using this atm");
		}
		else {
			System.out.println("INVALID USER");
		}
	
		
		
	}

}