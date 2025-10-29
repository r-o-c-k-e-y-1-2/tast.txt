package Array;

import java.util.Scanner;

	public class Libirary {
		
		String Action[] =new String[100];
		int AA = 3;

		String Fantasy[] = new String[100];
		int AF = 3;
		
		String Romance[] = new String[100];
		int AR = 3;
		
		String Manga[] = new String [100];
		int AM = 3;
		
		String Thriller[] = new String[100];
		int AT =3;
		
		int D;
		void entry(){
			try {
			Scanner A = new Scanner(System.in);
			System.out.println("Staff Enter One ");
			System.out.println("");
			System.out.println("Student Enter Two");
			int B = A.nextInt();
			
			if (B==1) {
				System.out.println("Enter Your Name:");
				System.out.println("");
				String C = A.next();
				System.out.println("Enter The Lib Id:");
				String D = A.next();
				teacher();
			}
			else if (B==2) {
				System.out.println("Enter Your Name:");
				System.out.println("");
				String C = A.next();
				System.out.println("Enter The Lib Id:");
				String D = A.next();
				
				student();
			}
			else {
				System.err.println("Plz enter the Correct Number ....");
				entry();
			}
			}catch (Exception e) {
		        System.err.print("Plz enter the Correct Number ....\n");
		        entry();
		       }
		    
		}
		void teacher(){
			try {
			Scanner A = new Scanner(System.in);
			
			System.out.println("View the Books For One ");
			System.out.println("Add Books For Two");
			int B = A.nextInt();
			
			if(B==1) {
				view();
			}
			else if (B==2) {
				add();
			}
			else {
				System.err.println("Plz Enter Correct Number");
				teacher();
			}
			}
			catch(Exception e) {
				System.err.println("Plz Enter Correct Number");
				teacher();
			}
		}
		void add(){
			try {
			Scanner A = new Scanner(System.in);
			
			
			gener();
			D = A.nextInt();
			}
			catch(Exception e) {
				System.out.println("Plz Enter The Correct Number");
				add();
			}
			while((D>0)||(D<0)) {
			switch (D) {
			         
			         case (1):
			        	 Scanner A = new Scanner(System.in);
			        	System.out.println("Enter The Book Name:");
			            ++AA;
			        	Action[AA] = A.next();
			            System.out.println(Action[4]+" "+"BOOK is Added To Library");
			            menupage();
			        	 
			           
			            break;
	                 case (2):
	                	 Scanner B = new Scanner(System.in);
	                	 System.out.println("Enter The Book Name:");
	                     ++AF;
			        	 Fantasy[AF] = B.next();
			             System.out.println("THE BOOK is Added");
			            
			           
			             menupage();
			             
			             break;
	                case (3):
	                	 Scanner C = new Scanner(System.in);
	                	 System.out.println("Enter The Book Name:");
	                     ++AR;
			        	 Romance[AR] = C.next();
			             System.out.println("THE BOOK is Added");
			            
			           
			             menupage();
			            
			             break;
	                case (5):
	                	 Scanner D = new Scanner(System.in);
	                	 System.out.println("Enter The Book Name:");
	                     ++AM;
			        	 Manga[AM] = D.next();
			             System.out.println("THE BOOK is Added");
			            
			             menupage();
			            
			             break;
			             
	                case (4):
	                	 Scanner E = new Scanner(System.in);
	                	 System.out.println("Enter The Book Name:");
	                     ++AT;
			        	 Thriller[AT] = E.next();
			             System.out.println("THE BOOK is Added");
			           
			             menupage();
			            
			             break;
	                case (6):
	                     entry();
	                     break;
	                     
			        default:
			             System.err.println("Plz Enter The Correct Number");
			             add();
			             break;
			             
			}
			}

		}
		void student() {
			try {
			Scanner A = new Scanner(System.in);
			System.out.println("View For One:");
			System.out.println("Take For Two:");
			System.out.println("Return For Three:");
			int B = A.nextInt();
			
			if (B==1) {
				view();
			}
			else if (B==2) {
				take();
			}
			else if (B==2) {
				Return();
			}
			
			else {
				System.out.println("Plz Enter The Correct Number");
				student();
			}
			}
			catch(Exception e) {
				System.err.println("Plz Enter The Correct Number");
				student();
			}
		}
		
		void take() {
			try {
			Scanner A = new Scanner(System.in);
			gener();
		    int B = A.nextInt();
		    int b=1;
		    if (B==1) {
				for(int a =0;a<=AA;a++) {
					
					System.out.println(b+")"+Action[a]);
					b++;
					
				}
				System.out.println("Enter The BOOK Number:");
				int C = A.nextInt();
				System.out.println(Action[C]+"Book is Takken");
				Action[C]=Action[C]+"Book is Takken";
				 menupages();
			}
		    else if (B==2) {
		    	for(int a =0;a<=AF;a++) {
					
					System.out.println(b+")"+Fantasy[a]);
					b++;
					
				}
		    	System.out.println("Enter The BOOK Number:");
				int C = A.nextInt();
				System.out.println(Action[C]+"Book is Takken");
				Fantasy[C]=Action[C]+"Book is Takken";
				 menupages();
		    }
		    else if (B==3) {
		    	for(int a =0;a<=AR;a++) {
					
					System.out.println(b+")"+Romance[a]);
					b++;
					
				}
		    	System.out.println("Enter The BOOK Number:");
				int C = A.nextInt();
				System.out.println(Action[C]+"Book is Takken");
				Romance[C]=Action[C]+"Book is Takken";
				 menupages();
		    }
		    else if (B==4) {
		    	for(int a =0;a<=AT;a++) {
					
		    		b++;
					System.out.println(b+")"+Thriller[a]);
				
				}
		    	System.out.println("Enter The BOOK Number:");
				int C = A.nextInt();
				System.out.println(Action[C]+"Book is Takken");
				Thriller[C]=Action[C]+"Book is Takken";
				 menupages();
		    }
		    else if (B==5) {
		    	for(int a =0;a<=AM;a++) {
					
		    		b++;
					System.out.println(b+")"+Manga[a]);
					
				}
		    	System.out.println("Enter The BOOK Number:");
				int C = A.nextInt();
				System.out.println(Action[C]+"Book is Takken");
				Manga[C]=Action[C]+"Book is Takken";
				 menupages();
		    }
		    else if (B==6) {
		    	student();
		    }
		    else {
		    	System.err.println("Plz Enter The Correct Number");
				take();
		    }
		    
			}
			catch(Exception e){
				System.err.println("Plz Enter The Correct Number");
				take();
			}
		}
		
		
		void Return() {
			try {
			Scanner A = new Scanner(System.in);
			
		    int B = A.nextInt();
		    int b=1;
		    if (B==1) {
				for(int a =0;a<=AA;a++) {
					
					
					System.out.println(b+")"+Action[a]);
					b++;
					
				}
				System.out.println("Enter The BOOK Number:");
				int C = A.nextInt();
				--C;
				System.out.println("Enter The BOOK Name:");
				String D = A.next();
				Action[C]=D;
				 menupages();
			}
		    else if (B==2) {
		    	for(int a =0;a<=AF;a++) {
					
					
					System.out.println(b+")"+Fantasy[a]);
					b++;
					
				}
		    	System.out.println("Enter The BOOK Number:");
				int C = A.nextInt();
				--C;
				System.out.println("Enter The BOOK Name:");
				String D = A.next();
				Action[C]=D;
				 menupages();
				
		    }
		    else if (B==3) {
		    	for(int a =0;a<=AR;a++) {
					
					
					System.out.println(b+")"+Romance[a]);
					b++;
					
				}
		    	System.out.println("Enter The BOOK Number:");
				int C = A.nextInt();
				--C;
				System.out.println("Enter The BOOK Name:");
				String D = A.next();
				Action[C]=D;
				 menupages();
		    }
		    else if (B==4) {
		    	for(int a =0;a<=AT;a++) {
					
		    		b++;
					System.out.println(b+")"+Thriller[a]);
				
				}
		    	System.out.println("Enter The BOOK Number:");
				int C = A.nextInt();
				--C;
				System.out.println("Enter The BOOK Name:");
				String D = A.next();
				Action[C]=D;
				 menupages();
		    }
		    else if (B==5) {
		    	for(int a =0;a<=AM;a++) {
					
		    		b++;
					System.out.println(b+")"+Manga[a]);
					
				}
		    	System.out.println("Enter The BOOK Number:");
				int C = A.nextInt();
				--C;
				System.out.println("Enter The BOOK Name:");
				String D = A.next();
				Action[C]=D;
				 menupages();
		    }
		    else if (B==6) {
		    	student();
		    }
		    else {
		    	System.err.println("Plz Enter The Correct Number");
				Return();
		    }
		    
			}
			catch(Exception e) {
				System.err.println("Plz Enter The Correct Number");
				Return();
			}
		}
		void view() {
			try {
			Scanner A = new Scanner(System.in);
			gener();
			int B=A.nextInt();
			int b=0;
			 if (B==1) {
					for(int a =0;a<=AA;a++) {
						
						b++;
						System.out.println(b+")"+Action[a]);
						
						
					}
			 }	
			    else if (B==2) {
			    	for(int a =0;a<=AF;a++) {
						
						
						System.out.println(b+")"+Fantasy[a]);
						b++;
						
					}
			    }
			    else if (B==3) {
			    	for(int a =0;a<=AR;a++) {
						
						
						System.out.println(b+")"+Romance[a]);
						b++;
						
					}
			    }
			    else if (B==4) {
			    	for(int a =0;a<=AT;a++) {
						
			    		b++;
						System.out.println(b+")"+Thriller[a]);
					
					}
			    }
			    	
			    else if (B==5) {
			    	for(int a =0;a<=AM;a++) {
						
			    		b++;
						System.out.println(b+")"+Manga[a]);
						
					}
			    	
			    }
			    else if (B==6) {
			         entry();
			    }
			    else {
			    	System.err.println("Plz Enter The Correct Number");
					view();
			    }
			 menupage1();
			
				}
				catch(Exception e){
					System.err.println("Plz Enter The Correct Number");
					view();
				}
			
			
		}
		void menupage1() {
			try {
		     Scanner A = new Scanner(System.in);
			 System.out.println("Do You Want To Continue");
	         System.out.println("Yes Press One");
	         System.out.println("Exit Press Zero");
	      
	       int E = A.nextInt();
	       if (E==1) {
	           entry();
	           }
	      else if (E==0) {
	      	end();
	      }
	      else {
	      	System.err.println("Plz Enter The Correct Number");
	      	menupage1();
	      }
			}
			catch(Exception e) {
				System.out.println("Plz Enter The Correct Number");
				menupage1();
			}
		}
		void menupage() {
			try {
			Scanner A = new Scanner(System.in);
			  System.out.println("Do You Want To Continue");
	          System.out.println("Yes Press One");
	          System.out.println("Exit Press Zero");
	          System.out.println("Main Menu Press Two");
	          int E = A.nextInt();
	          
			 if (E==1) {
	             teacher();
	             }
	        else if (E==0) {
	        	end();
	        }
	        else if (E==2) {
	        	entry();
	        }
	        else {
	        	System.err.println("Plz Enter The Correct Number");
				menupage();
	        }
			}
			catch(Exception e) {
				System.err.println("Plz Enter The Correct Number");
				menupage();
			}
		}
		void menupages() {
			try {
			Scanner A = new Scanner(System.in);
			System.out.println("Do You Want To Continue");
	        System.out.println("Yes Press One");
	        System.out.println("Exit Press Zero");
	        System.out.println("Main Menu Press Two");
	        int E = A.nextInt();
	        
			 if (E==1) {
	           student();
	           }
	      else if (E==0) {
	      	end();
	      }
	      else if (E==2) {
	      	entry();
	      }
	      else {
	    	  System.err.println("Plz Enter The Correct Number");
				menupages();
	      }
			}
			catch(Exception e) {
			System.err.println("Plz Enter The Correct Number");
			menupage();
			}
		}
		void gener() {
			System.out.println("Please Select The Gener:");
		    System.out.println("");
		    System.out.println("     For Action press One. ");
		    System.out.println("     For Fantasy press Two.");
		    System.out.println("     For Romance press Three.");
		    System.out.println("     For Thriller press Four.");
		    System.out.println("     For Manga press Five.");
		    System.out.println("     Back For six.");
		}
		
		
		void end() {
			System.out.println("Thank You");
			System.out.println("Please Visit Again...");
		}
		
		public static void main (String[]args) {
			
			System.out.println("WELCOME THE GREAT CARIBBEAN LIBRARY");
			Libirary A = new Libirary();
		
			A.Action[0] = "Solo Level"; A.Action[1] ="The Hobbit";A.Action[2]="The Ancient Nine";A.Action[3]="FIGHT CLUB";
			A.Fantasy[0] ="Harry Potter ";A.Fantasy[1] ="The Name Of The Wind";A.Fantasy[2] ="Game Of Thrones"; A.Fantasy[3] = "A Storm of Swords ";  
			A.Romance[0] ="Something I Never Told You";A.Romance[1] ="Love in a Blue Moon";A.Romance[2] ="All I Ever Want is You";A.Romance[3] ="The Duke and I";A.Romance[4]="Outlander";
	        A.Manga[0] = "ONE PIECE";A.Manga[1] = "DRAGON BALL";A.Manga[2] = "WIND BREAKER";A.Manga[3] = "DEATH NOTE";
	        A.Thriller[0]= "The Good Son"; A.Thriller[1]= "The Little Stranger"; A.Thriller[2]= "A Time to Kill"; A.Thriller[3]= "Big Little Lies";
		   A.entry();
		}

	}
	