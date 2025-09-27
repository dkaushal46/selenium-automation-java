package demo;

public class A04_CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // string is an object  // String literal

        // String s1 = "Rahul Shetty Academy";
        String s5 = "hello";

        // new
        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        String s = "Rahul Shetty Academy";
        String[] splittedString = s.split("Shetty");

        System.out.println(splittedString[0]);        // Prints: Rahul 
        System.out.println(splittedString[1]);        // Prints:  Academy
        System.out.println(splittedString[1].trim()); // Prints: Academy (without leading space)

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i)); 

	}

}}
