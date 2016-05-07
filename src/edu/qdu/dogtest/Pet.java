package edu.qdu.dogtest;

import java.util.InputMismatchException;

public abstract class Pet {
	private String name;
    protected String kind;
    
    private int age;//˽�����ԣ���װ
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws InputMismatchException{
		if(age<0||age>40){
			throw new InputMismatchException("please enter the true age");
		}
		else
			this.age = age;
	}
	public Pet(String name){
		this.name=name;
	}
	public void eat(String food){
		System.out.println(name+age+"�ڳ�"+food);
	}
	protected abstract String bark();
	public void sleep(){
		System.out.println(kind+":"+name+" ��˯��");
	}

}
