package edu.qdu.dogtest;

import java.util.InputMismatchException;

public class Master {
	public void Test() throws InputMismatchException {
		// 实例化
		Dog mydog = new Dog("Air");
		mydog.kind = "金毛";
		try {
			mydog.setAge(6);

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("有错误");
		}
		System.out.println(mydog.bark());
		mydog.eat("饼干");
		mydog.sleep();
		mydog.lookDoor();

		System.out.println("");

		Cat cat = new Cat("Amy");
		cat.kind = "波斯";
		try {
			mydog.setAge(50);

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			throw e;
		} catch (Exception e) {
			System.out.println("有错误");
			throw e;
		} //finally {
			System.out.println(cat.bark());
			cat.eat("鱼");
			cat.sleep();
			cat.catchMouse();
		//}//用finally可以执行

	}

	public static void main(String[] args) {
		Master master = new Master();

		try {
			master.Test();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("有错误");
		}

	}
}
