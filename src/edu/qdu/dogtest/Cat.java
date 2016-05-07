package edu.qdu.dogtest;



public class Cat extends Pet{
	
	public Cat(String name){
		//调用父类的方法
		super(name);
		//setName（name）；
	}
	public void catchMouse(){
		kind="波斯猫";
		System.out.println("catch mouse");
	}
   public String bark(){
		return "在喵喵叫";
	}

}
