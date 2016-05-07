package end.qdu.duotaitest;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		//float a=8388608f;
		//float b=16777217f;
		//float c=16777218f;
		//float d=177767770f;
		//System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
		int num=0;
		for (int i = 0; i < 1000; i++) {
			num+=++i;
		}
		System.out.println(num);
		
		
		String password="";
		final String PASSWORD="13579";
		Scanner input=new Scanner(System.in);
		do{
			System.out.println("ÇëÊäÈë³ÌĞòÃÜÂë£º");
			password=input.nextLine();
		}while(!password.equals(PASSWORD));
		System.out.println("ÃÜÂëÕıÈ·");
	}
                                 
}
