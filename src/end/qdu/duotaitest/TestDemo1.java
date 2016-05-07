import java.util.Scanner;

public class TestDemo1 {
	static int engNo=-1;
	static String engName="";
	static int engSex=-1;
	static int engEdu=-1;
	
	static int basSalary=3000;
	
	
	static int userSel;
	static Scanner input=new Scanner(System.in);
     public static void main(String[] args) {
    	 
         while(true){
        	 userSel=showMenu();
        	 switch(userSel){
        	 case 4:System.out.println("程序结束");break;
             case 5:calculate();
            	 break;
             case 6:System.out.println("程序结束");break;
             case 7:System.out.println("程序结束");break;
             case 8:System.out.println("程序结束");break;
             case 9:System.out.println("程序结束");break;
             case 10:System.out.println("程序结束");break;
             case 11:System.out.println("程序结束");break;
             case 0:System.out.println("程序结束");
                 break;
             default:System.out.println("输入正确选择");
                 break;
             
             }
        	 if(userSel==0){break;}
        	 
         }
         
     }
     public static int showMenu(){
    	 
     }
     public static void ininputEngInfo(){
    	 
     } 
     
     public static void calculate(){
    	 double engSalary=0.0;
    	 int basSalary=3000;
    	 int comResult=100;
    	 double workDay=22;
    	 double insurance=3000*0.105;
    	 
    	 Scanner input =new Scanner(System.in);
    	 System.out.print("请输入Java工程师底薪：");
    	 basSalary=input.nextInt();
    	 System.out.print("请输入Java工程师底薪月工作完成分数（最小值为0，最大值为150）：");
    	 comResult=input.nextInt();
    	 System.out.print("请输入Java工程师的实际工作天数：");
    	 workDay=input.nextDouble();
    	 System.out.print("请输入Java工程师月应扣保险数：");
    	 insurance=input.nextDouble();
    	 
    	 engSalary=basSalary+basSalary*0.25*comResult/100+15*workDay-insurance;
    	 System.out.println("Java工程师月薪为："+engSalary);
     }
}
