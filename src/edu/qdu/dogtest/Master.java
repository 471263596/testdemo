package edu.qdu.dogtest;

import java.util.InputMismatchException;

public class Master {
	public void Test() throws InputMismatchException {
		// ʵ����
		Dog mydog = new Dog("Air");
		mydog.kind = "��ë";
		try {
			mydog.setAge(6);

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("�д���");
		}
		System.out.println(mydog.bark());
		mydog.eat("����");
		mydog.sleep();
		mydog.lookDoor();

		System.out.println("");

		Cat cat = new Cat("Amy");
		cat.kind = "��˹";
		try {
			mydog.setAge(50);

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			throw e;
		} catch (Exception e) {
			System.out.println("�д���");
			throw e;
		} //finally {
			System.out.println(cat.bark());
			cat.eat("��");
			cat.sleep();
			cat.catchMouse();
		//}//��finally����ִ��

	}

	public static void main(String[] args) {
		Master master = new Master();

		try {
			master.Test();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("�д���");
		}

	}
}
