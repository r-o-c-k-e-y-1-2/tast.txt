package variabledatatype;

public class ArrayMethods {

	public static void main(String[] args) {
      
          int[] ar = {2,4,6,8,10,12};
          for(int i = ar.length - 1; i>=0; i--) {
        	  System.out.print(ar[i] + " ");
          }
          System.out.println();
          
          int ar1[] = {8,3,5,1,7};
          int min = ar1[0];
          for (int i =1; i < ar1.length; i++) {
        	  min = Math.min(min,ar1[i]);
          }
          System.out.println("Minimum element: " + min);
          
          int ar2[] = {8,3,5,1,7};
          int max = ar1[0];
          for (int i =1; i < ar2.length; i++) {
        	  max = Math.max(max,ar2[i]);
          }
          System.out.println("Maximum element: " + max);
          
          
          int a = 5 ;
          boolean value = false;
          for(int num : ar2) { value = value || (num == a);
          }  
          System.out.println("Specific value: " + value);
          
	}

}
