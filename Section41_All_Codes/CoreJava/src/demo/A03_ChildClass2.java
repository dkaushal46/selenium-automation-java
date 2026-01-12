package demo;

public class A03_ChildClass2 extends A04_ChildClass3{
	int a;
	
	//default constructor
	public A03_ChildClass2(int a) {
		super(a);
		this.a=a;  //Parameterized constructor 
			}

	public int increment() {
		// TODO Auto-generated method stub
		a=a+1;
		return a;
	}
	
	public int decrement() {
		// TODO Auto-generated method stub
		a=a-1;
		return a;
	}
	
	
}
