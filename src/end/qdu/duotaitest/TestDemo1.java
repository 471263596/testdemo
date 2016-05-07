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
    	 System.out.println("---------------------------------------");
         System.out.println(":\t蓝桥计划Java工程师管理系统\t:");
         System.out.println("---------------------------------------");
         System.out.println("1.输入Java工程师资料");
         System.out.println("2.删除指定Java工程师资料");
         System.out.println("3.查询Java工程师资料");
         System.out.println("4.修改Java工程师资料");
         System.out.println("5.计算Java工程师的月薪");
         System.out.println("6.保存新添加的Java工程师资料");
         System.out.println("7.对Java工程师信息排序");
         System.out.println("8.输出所有Java工程师信息");
         System.out.println("9.清空所以Java工程师数据");
         System.out.println("10.打印Java工程师数据报表");
         System.out.println("11.从文件重新导入Java工程师数据");
         System.out.println("0.结束（编辑工程师信息后提示保存）");
         System.out.print("请输入您的选择：");
         userSel=input.nextInt();
         return userSel;
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
