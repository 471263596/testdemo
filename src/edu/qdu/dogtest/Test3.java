package edu.qdu.dogtest;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		/*Dog dog=new Dog();
		System.out.println("enter your dog's age:");
		Scanner input =new Scanner(System.in);
//		dog.setAge(input.nextInt());
		try{
			dog.setAge(input.nextInt());
			System.out.println(dog.getAge());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}*/
		String name1=",wang,li,song";
		String[] splitStr=name1.split(",");
		String name2=new String("wang,li,song");
		for (int i = 0; i < splitStr.length; i++) {
			System.out.println(splitStr[i]);
			
		}
		System.out.println(name1==name2);
		System.out.println(name2==name1);
		System.out.println(name1.equals(name2));
		System.out.println(name2.equals(name1));
	}

}
