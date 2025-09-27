package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A02_CoreJavaBrushup1 {

	public static void main(String[] args) {
		
		int myNum= 5;
		String Website="Rahul shetty Academy";
		char letter='r';
		double dec= 5.99;
		float point= 4.66f;
		boolean myCard=true;
		
		System.out.println(myNum +" is the number");
		System.out.println(Website);

		// Array can be written in 2 forms 
		//1st
		int[] arr =new int[5];
		arr[0]= 9;
		arr[1]= 1;
		arr[2]= 8;
		arr[3]= 6;
		arr[4]= 2;
		
		//2nd
		
		int[] arr2 = {9,1,8,6,2};
		System.out.println(arr2[3]);
		
		
		
		/*
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		*/
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		/*String[] Name= {"Dikshansh","Kaushal","Abhishek","Kaushal" };
		for(int i=0;i<Name.length;i++) {
			System.out.println(Name[i]);
		}*/
		
		ArrayList<String> a= new ArrayList();
		a.add("Dikshansh");
		a.add("Kaushal");
		a.add("Abhishek");
		a.add("Aaaaaaa");
		System.out.println(a.get(2));
		
		System.out.println("****************");
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));}
		
		System.out.println("****************");
		
		//convert array to arraylist
		String[] Name= {"Dikshansh","Kaushal","Abhishek","Kaushal" };
		List<String> NameArraylist= Arrays.asList(Name);
		
		// now name is "NameArraylist"
		
		
		for(int i=0;i<NameArraylist.size();i++) {
			System.out.println(NameArraylist.get(i));}
		
		}

}
