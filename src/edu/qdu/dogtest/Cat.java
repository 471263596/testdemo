package edu.qdu.dogtest;



public class Cat extends Pet{
	
	public Cat(String name){
		//���ø���ķ���
		super(name);
		//setName��name����
	}
	public void catchMouse(){
		kind="��˹è";
		System.out.println("catch mouse");
	}
   public String bark(){
		return "��������";
	}

}
