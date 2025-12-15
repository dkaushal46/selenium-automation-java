package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Streams;



public class A01_Test01 {
	//@Test
	public void countNames() {
		
		
		/*
		    ✅ TestNG does NOT check if your logic is correct

			TestNG only checks two things:

			1️⃣ Did your test method throw any exception?

			If yes → FAIL
			If no → PASS

			2️⃣ Did you use an assertion like Assert.assertEquals()?

			If an assertion fails → FAIL
			If no assertion is used, TestNG assumes everything is fine.
		 
		 */
		ArrayList<String> names =new ArrayList<String>();
		
		names.add("Dikshansh");
		names.add("Abhishek");
		names.add("Kaushal");
		names.add("ddddddd");
		names.add("jjjjjjj");
		int count =0;
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
			String actual=names.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	@Test
	public void streamFiltr() {
		
		ArrayList<String> names =new ArrayList<String>();
		
		names.add("Dikshansh");
		names.add("Abhishek");
		names.add("Kaushal");
		names.add("ddddddd");
		names.add("jjjjjjj");
		
		
		//there is no life for intermediate op if there is no terminal op
		//terminal operation will execute only if inter op (filter) returns true
		//We can create stream
		//how to use filter in Stream API
		System.out.println("*********************************************");
		long C=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(C);
		
		System.out.println("*********************************************");
		long J=Stream.of("DDDDDD","AAAAA","JJJJJJJ","AAAAAAAAA","AAAAAAAAAAA").filter(m->{
			return m.startsWith("A"); // return should be removed
			//return true;
		}).count();
		System.out.println(J);
		
		//Print all names form array list length more than 7
		System.out.println("*********************************************");
		names.stream().filter(s -> s.length()>7).forEach(s->System.out.println(s));
		System.out.println("*********************************************");
	}
	
	@Test
	public void streamMap() {
		
		
		ArrayList<String> names =new ArrayList<String>();
		
		names.add("Dikshansh");
		names.add("Abhishek");
		names.add("Kaushal");
		names.add("ddddddd");
		names.add("jjjjjjj");
		
		
		//print name which has last character as "A" with upper case 
		//map is used to convert to capital letter 
		System.out.println("*********************************************");
		Stream.of("DDDDDD","AAAAA","JJJJJJJ","AAAAAAAAA","AAAAAAAAAAA").filter(s->s.endsWith("A")).map(s->s.toLowerCase()).forEach(s->System.out.println(s));
		
		
		System.out.println("*********************************************");
		//print name which has first letter as a with uppercase and sorted
		
		List<String> names1=Arrays.asList("DDDDDD","AAAABA","JJJJJJJ","AAAAAAAAA","AAAAAAAAAAA");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
		System.out.println("*********************************************");
		
		
		//merge 2 list and sort them
		Stream<String> allNames=Streams.concat(names.stream(), names1.stream());
		//allNames.sorted().forEach(s->System.out.println(s));
		boolean flag=allNames.anyMatch(s->s.equalsIgnoreCase("AAAaBA"));
		System.out.println(flag);
		Assert.assertFalse(flag);//it will be true
		
		}
		
	
	@Test
	public void streamCollect() {
		System.out.println("******************************************************");
		List<String> ls =	Stream.of("DDDDDD","AAAAA","JJJJJJJ","AAAAAAAAA","AAAAAAAAAAA").filter(s->s.endsWith("A")).map(s->s.toLowerCase()).collect(Collectors.toList());
		//Limit will also work the same
		System.out.println(ls.get(1));
		
		List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique number
		//sort the array
		values.stream().distinct().forEach(s->System.out.println(s));
		System.out.println("******************************************************");
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		System.out.println("******************************************************");
		List<Integer>Li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(Li.get(3));
		//
		}
}
