package end.qdu.duotaitest;

import java.util.Scanner;

public class Test3 {
	private String name="Amy";
	private int age=12;
//	public Test3(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	public Test3(){
		System.out.println("construct");
	}
	public Test3(String name){
		System.out.println("hello"+name);
	}
	public static void main(String[] args) {
		Test3 obj=new Test3();
		Test3 obj1=new Test3("David");
		
	}

}
