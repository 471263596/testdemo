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
        	 case 4:System.out.println("�������");break;
             case 5:calculate();
            	 break;
             case 6:System.out.println("�������");break;
             case 7:System.out.println("�������");break;
             case 8:System.out.println("�������");break;
             case 9:System.out.println("�������");break;
             case 10:System.out.println("�������");break;
             case 11:System.out.println("�������");break;
             case 0:System.out.println("�������");
                 break;
             default:System.out.println("������ȷѡ��");
                 break;
             
             }
        	 if(userSel==0){break;}
        	 
         }
         
     }
     public static int showMenu(){
    	 System.out.println("---------------------------------------");
         System.out.println(":\t���żƻ�Java����ʦ����ϵͳ\t:");
         System.out.println("---------------------------------------");
         System.out.println("1.����Java����ʦ����");
         System.out.println("2.ɾ��ָ��Java����ʦ����");
         System.out.println("3.��ѯJava����ʦ����");
         System.out.println("4.�޸�Java����ʦ����");
         System.out.println("5.����Java����ʦ����н");
         System.out.println("6.��������ӵ�Java����ʦ����");
         System.out.println("7.��Java����ʦ��Ϣ����");
         System.out.println("8.�������Java����ʦ��Ϣ");
         System.out.println("9.�������Java����ʦ����");
         System.out.println("10.��ӡJava����ʦ���ݱ���");
         System.out.println("11.���ļ����µ���Java����ʦ����");
         System.out.println("0.�������༭����ʦ��Ϣ����ʾ���棩");
         System.out.print("����������ѡ��");
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
    	 System.out.print("������Java����ʦ��н��");
    	 basSalary=input.nextInt();
    	 System.out.print("������Java����ʦ��н�¹�����ɷ�������СֵΪ0�����ֵΪ150����");
    	 comResult=input.nextInt();
    	 System.out.print("������Java����ʦ��ʵ�ʹ���������");
    	 workDay=input.nextDouble();
    	 System.out.print("������Java����ʦ��Ӧ�۱�������");
    	 insurance=input.nextDouble();
    	 
    	 engSalary=basSalary+basSalary*0.25*comResult/100+15*workDay-insurance;
    	 System.out.println("Java����ʦ��нΪ��"+engSalary);
     }
}
