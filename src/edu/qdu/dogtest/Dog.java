package edu.qdu.dogtest;



public class Dog extends Pet{
	public Dog(String name){
		//调用父类的方法
		super(name);
		//setName（name）；
	}
	protected String bark(){
		return "在汪汪叫";
	}
	public void lookDoor(){
		System.out.println("look after the home");
	}
	
//	@Override
//	protected String bark() {
//		// TODO Auto-generated method stub
//		return null;
//	}
    
}
