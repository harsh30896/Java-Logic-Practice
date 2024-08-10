package test;

import java.util.ArrayList;
import java.util.*;

interface MyInterface{
	static void PrintHello() {
		System.out.println("Printing hello");
	
	}
	
	void myAbstractMethod();
	
}

abstract class Mytest {
	
}

interface NewInterface{
	void abstractMethod();
}

public class InterfaceTest implements MyInterface,NewInterface{
	public static void main(String args[]) {
		
		List<Integer>  nenArr = new ArrayList<>();
		
		InterfaceTest ifTest  = new InterfaceTest();
		
		
}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void myAbstractMethod() {
		// TODO Auto-generated method stub
		
	}

}
