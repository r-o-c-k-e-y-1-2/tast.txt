package variabledatatype;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Krishnan";
		String s1 = "Radha";
		String s2 = "";
		String s3 = "Kr";
		String s4 = "Kr";
		String s5 = "Radha krishnan";
		
		s5 = s5.trim();
		System.out.println("1.count: " + s.length());
        System.out.println("Empty or not: " + s2.isEmpty());
        System.out.println("Conver to Uppercase: " + s.toUpperCase());
        System.out.println("Convert to lower case: " + s.toLowerCase());
        System.out.println("Concodinate two string: " + s1.concat(s));
        System.out.println("Length of string: " + s.length());
        System.out.println("Contain substring : " + s.contains(s3));
        System.out.println("Replace a string: " + s1.replace("Radha", "Vaasu deva"));
        System.out.println("String equal: " + s3.equals(s4));
        System.out.println("Count words in string: " +  s5.length());
        
	}

}
