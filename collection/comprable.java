package collection;

import java.util.Scanner;

public class comprable{
	public static void main  (String args[]) {
		
		Scanner obj=new Scanner(System.in);
		String value="Name=\"Rockey\"/company Name=\"Uniqu\"/Experiance=\"2years\"";
		String A=obj.next();
		
		String[] Split = value.split("/");
		for(int i=0;i<Split.length;i++) {
			if(A.equals(Split[i].split("=")[0])) {
				String D= (Split[i].split("=")[1]);
				System.out.println(D.replace("\"",""));
				
			}
		}
	
	}
}



