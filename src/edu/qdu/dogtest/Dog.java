package edu.qdu.dogtest;



public class Dog extends Pet{
	public Dog(String name){
		//���ø���ķ���
		super(name);
		//setName��name����
	}
	protected String bark(){
		return "��������";
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
