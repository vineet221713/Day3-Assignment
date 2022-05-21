
//Qustion 1..


package com.masai;

public class StaticNonStatic {
	
	int y = 21;
	void fun1() {
		System.out.println("this is Function");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticNonStatic d1 = new StaticNonStatic();
		System.out.println(d1.y);
		d1.fun1();
		
	}

}
