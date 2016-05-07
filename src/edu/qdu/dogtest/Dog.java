package edu.qdu.dogtest;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dog {
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0||age>40){
			throw new InputMismatchException("please enter the true age");
		}
		else
			this.age = age;
//		try{
//			
//			if(age<0||age>40){
//				throw new InputMismatchException("please enter the true age");
//			}
//			else
//				this.age = age;
//				
//		}catch(InputMismatchException e){
//				//System.out.println(e.getMessage());
//			e.printStackTrace();
//		}catch(Exception e){
//			System.out.println("error");
//		}
	}
}
