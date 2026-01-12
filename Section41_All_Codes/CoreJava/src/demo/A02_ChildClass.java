package demo;

import org.testng.annotations.Test;

public class A02_ChildClass extends A01_ParentClass{ //used extends keyword for inheritance

	@Test
	public void testRun() {
		
		A03_ChildClass2 Name =new A03_ChildClass2(3); //Object to call  //3 in bracket for parameterized constructor
		
		
		int a=3;
		
		doThis(); //ParentClass (inheritance)
		
		//Name.increment(); //Name used to call object
		
		
		System.out.println(Name.increment());
		System.out.println(Name.decrement());
		
		//A04_ChildClass3 ps3 =new A04_ChildClass3(3); //object for taking class in this
		//System.out.println(ps3.multiplyThree());
		System.out.println(Name.multiplyThree());
		
	}
	
	//if we dont want to use inheritance and Extends keyword we can use objects
	
	/*
	@Test
	public void testRun2() {
	A01_ParentClass run = new A01_ParentClass();
	run.doThis();
	}
	*/
}
